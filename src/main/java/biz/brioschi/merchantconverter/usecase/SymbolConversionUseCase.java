package biz.brioschi.merchantconverter.usecase;

import biz.brioschi.merchantconverter.model.ConverterException;
import biz.brioschi.merchantconverter.model.IntergalacticStringMapper;

import java.util.List;

public class SymbolConversionUseCase {

    private final IntergalacticStringMapper mapper;

    public SymbolConversionUseCase(IntergalacticStringMapper mapper) {
        this.mapper = mapper;
    }

    public int symbolConversion(List<String> sequence) throws ConverterException {
        return mapper.translateSequence(sequence);
    }

}
