package biz.brioschi.merchantconverter.usecase;

import biz.brioschi.merchantconverter.model.ConverterException;
import biz.brioschi.merchantconverter.model.GoodsPriceRepository;
import biz.brioschi.merchantconverter.model.IntergalacticStringMapper;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class GoodsTradingUseCase {

    private final IntergalacticStringMapper mapper;
    private final GoodsPriceRepository repository;

    public GoodsTradingUseCase(IntergalacticStringMapper mapper, GoodsPriceRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    public Optional<BigDecimal> goodsTrading(String goodsName, List<String> quantity) throws ConverterException {
        Optional<BigDecimal> gp = repository.getGoodsPrice(goodsName);
        if (gp.isPresent()) {
            BigDecimal quantityBD = new BigDecimal( mapper.translateSequence(quantity) );
            BigDecimal result = quantityBD.multiply(gp.get());
            return Optional.of(result);
        } else {
            return Optional.empty();
        }
    }

}
