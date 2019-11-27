package biz.brioschi.merchantconverter.usecase;

import biz.brioschi.merchantconverter.model.ConverterException;
import biz.brioschi.merchantconverter.model.IntergalacticStringMapper;

public class SymbolDeclarationUseCase {

    private final IntergalacticStringMapper mapper;

    public SymbolDeclarationUseCase(IntergalacticStringMapper mapper) {
        this.mapper = mapper;
    }

    public void symbolDeclare(String intergalacticString, String romanChar) throws ConverterException {
        // TODO: verifica il carattere romano
        mapper.addMapping(intergalacticString, romanChar);
    }

}
