package com.epam.as.milkProduct.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DeliveryFactory implements Cloneable{
    private static Random random = new Random();

    private DeliveryFactory() {
    }

    public static Delivery createRandomDelivery(int qt) {
        Delivery result = new Delivery();
        for (int i = 0; i < qt; i++) result.addProduct(ProductFactory.createRandomProduct());
        return result;
    }

    public static Delivery createRandomDelivery() {
        return createRandomDelivery(random.nextInt(10) + 1);
    }

}

