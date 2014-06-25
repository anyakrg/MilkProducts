package com.epam.as.milkProduct.entity;

import java.util.ArrayList;
import java.util.List;

public class Delivery implements Cloneable {

    List<Product> products = new ArrayList<Product>();

    public Delivery() {
        this.products = products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Delivery clonedDelivery = (Delivery) super.clone();
        clonedDelivery = new Delivery();
        for (Product product : products) {
            clonedDelivery.addProduct((Product) product.clone());
        }
        return clonedDelivery;
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
