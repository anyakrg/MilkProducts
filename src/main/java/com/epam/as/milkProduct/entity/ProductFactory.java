package com.epam.as.milkProduct.entity;

import java.math.BigDecimal;
import java.util.Random;

public class ProductFactory {

    public static Random random = new Random();

    private static Milk createRandomMilk() {
        Milk.milkType milkType = Milk.randomType();
        int fatPercentage;
        fatPercentage = random.nextInt();
        int calories;
        calories = random.nextInt();
        BigDecimal price = BigDecimal.valueOf(random.nextInt(100) + 5);
        Milk milk = new Milk(milkType, fatPercentage, calories, price) {
            @Override
            public int compareTo(Product o) {
                return 0;
            }
        };
        return milk;
    }

    private static Cheese createRandomCheese() {
        Cheese.Type type = Cheese.randomType();
        int fatPercentage;
        fatPercentage = random.nextInt();
        int calories;
        calories = random.nextInt();
        BigDecimal price = BigDecimal.valueOf(random.nextInt(100) + 5);
        Cheese cheese = new Cheese(type, fatPercentage, calories, price) {
           @Override
           public BigDecimal getCurrentCost() {
               return null;
           }

           @Override
           public int compareTo(Product o) {
               return 0;
           }
       };
        return cheese;
    }

    public static Product createRandomProduct() {
        int a = random.nextInt(3);
        switch (a) {
            case 0:
                return createRandomCheese();

            case 1:
                return createRandomMilk();

        }
        return createRandomProduct();
    }

}

