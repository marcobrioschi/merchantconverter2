package biz.brioschi.merchantconverter.model;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class IntergalacticStringMapper {

    private static final String ROMAN_REG_EXP = "^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$";

    Map<String, String> mapping = new Hashtable<>();

    public void addMapping(String intergalacticSequence, String romanChar) throws ConverterException {
        if (mapping.containsKey(intergalacticSequence) || mapping.containsValue(romanChar)) {
            throw new ConverterException("The roman char '" + romanChar + "' or the value '" + intergalacticSequence + "' are already mapped");
        }
        mapping.put(intergalacticSequence, romanChar);
    }

    public int translateSequence(List<String> sequence) throws ConverterException {
        if (sequence.size() > 0) {
            List<String> invalidStrings = findAllUnknownStrings(sequence);
            if (invalidStrings.size() == 0) {
                List<String> romans = translateIntoRomanSymbols(sequence);
                if (isRomanSequenceValid(romans)) {
                    return evaluateRomanSequence(romans);
                } else {
                    throw new ConverterException("The sequence is invalid because it seems like '" + romans.stream().collect(Collectors.joining())  + "'");
                }
            } else {
                throw new ConverterException("Unknown elements: " + invalidStrings.stream().collect(Collectors.joining(", ")));
            }
        } else {
            throw new ConverterException("Invalid empty sequence");
        }
    }

    private int evaluateRomanSequence(List<String> romans) throws ConverterException {
        int value = 0;
        int i = 0;
        while ( i < romans.size() ) {

            int currentCharValue = findRomanCharValue(romans.get(i));
            int nextCharValue = (i < romans.size() - 1)?findRomanCharValue(romans.get(i + 1)):-1;

            if ( (nextCharValue != -1) && (nextCharValue > currentCharValue) ) {
                value -= currentCharValue;
                value += nextCharValue;
                i += 2;
            } else {
                value += currentCharValue;
                i += 1;
            }

        }
        return value;
    }

    private int findRomanCharValue(String str) throws ConverterException {
        switch(str) {
            case "M" :   return 1000;
            case "D" :   return 500;
            case "C" :   return 100;
            case "L" :   return 50;
            case "X" :   return 10;
            case "V" :   return 5;
            case "I" :   return 1;
            default : throw new ConverterException("Invalid roman char '" + str + "'");
        }
    }

    private List<String> findAllUnknownStrings(List<String> sequence) {
        return sequence.stream()
                .filter( it -> !mapping.containsKey(it) )
                .collect(Collectors.toList());
    }

    private List<String> translateIntoRomanSymbols(List<String> sequence) {
        return sequence.stream()
                .map( it -> mapping.get(it) )
                .collect(Collectors.toList());
    }

    private boolean isRomanSequenceValid(List<String> romans) {
        String romanNumber = romans.stream().collect(Collectors.joining());
        return romanNumber.matches(ROMAN_REG_EXP);
    }

}
