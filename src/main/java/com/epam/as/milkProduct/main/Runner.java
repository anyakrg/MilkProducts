package com.epam.as.milkProduct.main;

import com.epam.as.milkProduct.entity.Delivery;
import com.epam.as.milkProduct.entity.DeliveryFactory;

public class Runner {
    public static void main(String[] args) throws CloneNotSupportedException {

        Delivery delivery = DeliveryFactory.createRandomDelivery();
        System.out.println(delivery);

        Delivery clonedDelivery = (Delivery) delivery.clone();
        System.out.println("Cloned delivery: " + clonedDelivery);
    }


}