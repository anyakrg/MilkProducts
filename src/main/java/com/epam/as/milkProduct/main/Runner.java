package com.epam.as.milkProduct.main;

import com.epam.as.milkProduct.entity.Delivery;
import com.epam.as.milkProduct.entity.DeliveryFactory;

import java.util.Collections;

public class Runner implements Cloneable {
    public static void main(String[] args) {

            Delivery delivery = DeliveryFactory.createRandomDelivery();
            System.out.println(delivery);

    }

}
