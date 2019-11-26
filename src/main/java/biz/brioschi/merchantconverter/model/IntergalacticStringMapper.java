package biz.brioschi.merchantconverter.model;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class IntergalacticStringMapper {

    private static final String ROMAN_REG_EXP = "^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$";

    Map<String, String> mapping = new Hashtable<>();

    public void addMapping(String intergalacticSequence, String romanChar) throws Exception {
        if (mapping.containsKey(intergalacticSequence) || mapping.containsValue(romanChar)) {
            throw new MapperException("The roman char '" + romanChar + "' or the value '" + intergalacticSequence + "' are already mapped");
        }
        mapping.put(intergalacticSequence, romanChar);
    }

    public int translateSequence(List<String> sequence) throws MapperException {
        List<String> invalidStrings = findAllUnknownStrings(sequence);
        if (invalidStrings.size() == 0) {
            List<String> romans = translateIntoRomanSymbols(sequence);
            if (isRomanSequenceValid(romans)) {
                return -1;
            } else {
                throw new MapperException("The sequence is invalid because it seems like '" + romans.stream().collect(Collectors.joining())  + "'");
            }
        } else {
            throw new MapperException("Unknown elements: " + invalidStrings.stream().collect(Collectors.joining(", ")));
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
