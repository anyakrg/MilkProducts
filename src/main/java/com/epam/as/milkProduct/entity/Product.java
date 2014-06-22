package com.epam.as.milkProduct.entity;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Random;

public abstract class Product implements Comparable<Product> {
    public static Random rnd = new Random();

    public Product(BigDecimal price, int fatPercentage, int calories) {
    }

    public enum Type {
        CHEESE, MILK;
    }
    public DecimalFormat format = new DecimalFormat("###.##");
    private Type type;
    private BigDecimal price;
    private int fatPercentage;
    private int calories;

    public static Type randomProduct() {
        int pick = new Random().nextInt(Type.values().length);
        return Type.values()[pick];
    }

    public abstract BigDecimal getCurrentCost();

    public Product(Milk.milkType milkType, int fatPercentage, int calories, BigDecimal price) {
       // this.ProductsType = ProductsType;
        this.fatPercentage = fatPercentage;
        this.calories = calories;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product {" +
                "format=" + format +
                ", type=" + type +
                ", price=" + price +
                ", fatPercentage=" + fatPercentage +
                ", calories=" + calories +
                '}' + "\n";
    }
}
