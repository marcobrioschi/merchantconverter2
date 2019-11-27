package biz.brioschi.merchantconverter.model;

import javax.swing.text.html.Option;
import java.util.Hashtable;
import java.util.Map;
import java.util.Optional;

public class GoodsPriceRepository {

    private Map<String, GoodsPrice> prices = new Hashtable<>();

    public void addGoodsPrice(GoodsPrice goodsPrice) throws ConverterException {
        if (!prices.containsKey(goodsPrice.name)) {
            prices.put(goodsPrice.name, goodsPrice);
        } else {
            throw new ConverterException("You are redefining the price for '" + goodsPrice.name + "'");
        }
    }

    public Optional<Double> getGoodsPrice(String name) {
        if (prices.containsKey(name)) {
            return Optional.of( prices.get(name).price );
        } else {
            return Optional.empty();
        }
    }

}
