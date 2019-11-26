package biz.brioschi.merchantconverter.model;

import javax.swing.text.html.Option;
import java.math.BigDecimal;
import java.util.Hashtable;
import java.util.Map;
import java.util.Optional;

public class GoodsPriceRepository {

    private Map<String, GoodsPrice> prices = new Hashtable<>();

    public void addGoodsPrice(GoodsPrice goodsPrice) throws ConverterException {
        if (!prices.containsKey(goodsPrice.getName())) {
            prices.put(goodsPrice.getName(), goodsPrice);
        } else {
            throw new ConverterException("You are redefining the price for '" + goodsPrice.getName() + "'");
        }
    }

    public Optional<BigDecimal> getGoodsPrice(String name) {
        if (prices.containsKey(name)) {
            return Optional.of( prices.get(name).getPrice() );
        } else {
            return Optional.empty();
        }
    }

}
