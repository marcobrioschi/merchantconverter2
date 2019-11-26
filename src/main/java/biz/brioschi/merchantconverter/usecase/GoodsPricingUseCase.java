package biz.brioschi.merchantconverter.usecase;

import biz.brioschi.merchantconverter.model.ConverterException;
import biz.brioschi.merchantconverter.model.GoodsPrice;
import biz.brioschi.merchantconverter.model.GoodsPriceRepository;
import biz.brioschi.merchantconverter.model.IntergalacticStringMapper;

import java.math.BigDecimal;
import java.util.List;

public class GoodsPricingUseCase {

    private final IntergalacticStringMapper mapper;
    private final GoodsPriceRepository repository;

    public GoodsPricingUseCase(IntergalacticStringMapper mapper, GoodsPriceRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    public void goodsPricing(String name, List<String> quantity, long credits) throws ConverterException {
        BigDecimal quantityBD = new BigDecimal(mapper.translateSequence(quantity));
        BigDecimal creditsBD = new BigDecimal(credits);
        GoodsPrice gp = new GoodsPrice(name, quantityBD.divide(creditsBD));
        repository.addGoodsPrice(gp);
    }

}
