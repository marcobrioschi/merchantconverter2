package biz.brioschi.merchantconverter.model;

import java.math.BigDecimal;

public class GoodsPrice {

    private final String name;
    private final BigDecimal price;

    public GoodsPrice(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

}
