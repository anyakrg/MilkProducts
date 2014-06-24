package com.epam.as.milkProduct.entity;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Random;

public abstract class Product implements Comparable<Product> {
    public static Random rnd = new Random();

    public Product(BigDecimal price, int fatPercentage, int calories) {
        this.price = price;
        this.fatPercentage = fatPercentage;
    }

    public enum Type {
        CHEESE, MILK;
    }
    public DecimalFormat format = new DecimalFormat("###.##");
    private Type type;
    BigDecimal price;
    private int fatPercentage;
    private int calories;

    public  Type randomProduct() {
        int pick = new Random().nextInt(Type.values().length);
        return Type.values()[pick];
    }

    public abstract BigDecimal getCurrentCost();

//    public Cheese.Type getType() {
//        return type;
//    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getFatPercentage() {
        return fatPercentage;
    }

    public void setFatPercentage(int fatPercentage) {
        this.fatPercentage = fatPercentage;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public Product(Milk.Type milkType, int fatPercentage, int calories, BigDecimal price) {
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
