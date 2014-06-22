package com.epam.as.milkProduct.entity;

import java.util.ArrayList;
import java.util.List;

public class Delivery implements Comparable<Delivery>, Cloneable {

    List<Product> products = new ArrayList<Product>();

    public Delivery() {
        this.products = products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public int compareTo(Delivery o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "products=" + products +
                '}';
    }
//    @Override
//    public int compareTo(Product anotherProduct) {
//        return super.calories.compareTo(anotherProduct.calories);
//        //return this.rooms.indexOf(compareTo(anotherRoom));
//    }
}