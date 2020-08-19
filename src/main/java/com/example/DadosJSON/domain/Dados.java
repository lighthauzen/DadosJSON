package com.example.DadosJSON.domain;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class Dados {

    private String product;

    private Integer quantity;

    private BigDecimal price;

    private String type;

    private String industry;

    private String origin;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) { this.quantity = quantity; }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) { this.price = price; }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Dados() {}

    public Dados(String product, Integer quantity, String price, String type, String industry, String origin) {

        this.product = product;
        this.quantity = quantity;
        this.price = new BigDecimal(price.substring(1));
        this.type = type;
        this.industry = industry;
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Dados{" +
                "product='" + product + '\'' +
                ", quantity=" + quantity +
                ", price='" + price + '\'' +
                ", type='" + type + '\'' +
                ", industry='" + industry + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }
}
