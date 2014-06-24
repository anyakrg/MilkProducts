package com.epam.as.milkProduct.entity;

import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.Random;

public  class Cheese extends Product {
    private Type type;
    private BigDecimal price;


    public Cheese(Type type, int fatPercentage, int calories, BigDecimal price) {
        super(price, fatPercentage, calories);
        this.type = type;
    }

    @Override
    public int compareTo(Product o) {
        return 0;
    }

//    public Type getType() {
//        return type;
//    }

    public void setType(Type type) {
        this.type = type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public enum Type {
        SHIP, GOAT, COW, MOOSE;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }

    public static Type randomType() {
        int pick = new Random().nextInt(Type.values().length);
        return Type.values()[pick];
    }

    public static Type randomCheeseType() {
        int pick = new Random().nextInt(Type.values().length);
        return Type.values()[pick];
    }

    @Override
    public BigDecimal getCurrentCost() {
        return price;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cheese)) return false;

        Cheese cheese = (Cheese) o;

        if (type != cheese.type) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return type.hashCode();
    }
    @Override
    public String toString() {
        return "Cheese{" +
                "type=" + type + " " +
                "fatPercentage=" + getFatPercentage() + " " +
                "calories=" + getCalories() + " " +
                "price=" + getPrice() + " " +
                '}' + "\n";
    }
}
