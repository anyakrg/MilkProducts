package entity;

import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ListIterator;

public class Product {
    private BigDecimal price;
    private int fatPercentage;
    private int calories;

    protected Product(int price, int fatPercentage, int calories) {
        this.price = new BigDecimal(price);
        this.fatPercentage = fatPercentage;
        this.calories = calories;
       }

    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
       this.price = price;
   }
    public int getFatPercentage() {
       return fatPercentage;
    }
    public void setFatPercentage(int fatPercentage) {
        this.fatPercentage = fatPercentage;
    }
    public int getCalories() {
        return calories;
    }
    public void setCalories(int calories) {
        this.calories = calories;
    }

     public enum ProductsType {
        CHEESE, KEFIR, MILK;
    }


    public class SortByKkal implements Comparator<Product> {
       public int compare(Product o1, Product o2) {
              return (int) (o1.getCalories() - o2.getCalories());
        }
    }
}
