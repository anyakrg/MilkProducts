package com.epam.as.milkProduct.entity;

import java.math.BigDecimal;
import java.util.Random;

public abstract class Milk extends Product {

    private static milkType milkType;

    public Milk(milkType milkType, int fatPercentage,
                int calories,
                BigDecimal price) {
        super(price, fatPercentage, calories);
    }

    public static milkType randomType() {
        int pick = new Random().nextInt(Milk.milkType.values().length);
        return milkType.values()[pick];
    }

    @Override
    public BigDecimal getCurrentCost() {
        return null;
    }

    public enum milkType {
        SOFT, PROCESSED, HARD;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }


    @Override
    public String toString() {
        return "Milk{" +
                "types of Milk=" + milkType +
                '}';
    }

}
