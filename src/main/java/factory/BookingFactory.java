package factory;

import entity.Cheese;
import entity.Kefir;
import entity.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BookingFactory {

    private final static Random rnd = new Random();

    public List<Product> createDevices(int count, Product.ProductsType... deviceType){

        List<Product> productList = new ArrayList<>();
        Product product;

        for (int i = 0; i<count; i++){
            String nameDevise = deviceType[rnd.nextInt(deviceType.length)].name();

            switch (nameDevise) {
                case "CHEESE": {product = createCheese();productList.add(product);}
                break;
                case "KEFIR": {product = createKefir();productList.add(product);}
                break;
//                case "MILK": {device =  createMilk();productList.add(device);}
//                break;
            }
        }
        return productList;
    }

//    private Milk createMilk() {
//        int price = rnd.nextInt(100);
//        int fatPercentage = rnd.nextInt(5);
//        int calories = rnd.nextInt(70);
//        Milk.Milk type = Milk.type.values()
//
//        Milk milk = new Milk(price, fatPercentage, calories, m_type);
//        return milk;
//
//    }

    private Kefir createKefir() {
        int price = rnd.nextInt(100);
        int fatPercentage = rnd.nextInt(5);
        int calories = rnd.nextInt(70);
        Kefir.Type ingredientsType = Kefir.Type.values()[rnd.nextInt(Kefir.Type.values().length)];
        int livingDays = rnd.nextInt(4);

        Kefir kefir = new Kefir(price,fatPercentage,calories, ingredientsType);
        return kefir;
    }

    private Cheese createCheese() {

        int price = rnd.nextInt(100);
        int fatPercentage = rnd.nextInt(5);
        int calories = rnd.nextInt(70);
        Cheese.Milk milk = Cheese.Milk.values()[rnd.nextInt(Cheese.Milk.values().length)];
        Cheese.Type mtype = Cheese.Type.values()[rnd.nextInt(Cheese.Type.values().length)];

        Cheese cheese = new Cheese(price,fatPercentage,calories,milk,mtype);
            return cheese;
    }


}
