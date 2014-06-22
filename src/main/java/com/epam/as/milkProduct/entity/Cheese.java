package com.epam.as.milkProduct.entity;

import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.Random;

public abstract class Cheese extends Product {
    private Type type;
    private BigDecimal price;


    public Cheese(Type type, int fatPercentage, int calories, BigDecimal price) {
        super(price, fatPercentage, calories);
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

    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
    }

    public static Type randomCheeseType() {
        int pick = new Random().nextInt(Type.values().length);
        return Type.values()[pick];
    }

    @Override
    public String toString() {
        return "Cheese{" +
                "type=" + type +
                '}';
    }
}
