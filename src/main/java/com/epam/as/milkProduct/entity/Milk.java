package com.epam.as.milkProduct.entity;

import java.math.BigDecimal;
import java.util.Random;

public  class Milk extends Product {

    private  MilkType milkType;

    public Milk(MilkType milkType, int fatPercentage,
                int calories,
                BigDecimal price) {
        super(price, fatPercentage, calories);
        this.milkType = milkType;
    }

    public static MilkType randomType() {
        int pick = new Random().nextInt(Milk.MilkType.values().length);
        return MilkType.values()[pick];
    }

    @Override
    public BigDecimal getCurrentCost() {
        return null;
    }

    @Override
    public int compareTo(Product o) {
        return 0;
    }

    public enum MilkType {
        SOFT, PROCESSED, HARD;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }


    @Override
    public String toString() {
        return "Milk{" +
                "type=" + milkType + " " +
                "Calories=" + getCalories() + " " +
                "fatPercentage=" + getFatPercentage() + " " +
                "price=" + getPrice() + " " +
                '}' + "\n";
    }

}
