package main;

import entity.Clon;
import entity.Product;
import factory.BookingFactory;

public class Runner  {
    public static void main(String[] args) {
        Clon board = new Clon(100, 100);
        board.setName("First Board");

        BookingFactory factory = new BookingFactory();
        Clon.establishProduct(factory.createDevices(10, Product.ProductsType.CHEESE, Product.ProductsType.KEFIR));

        Clon board2 = Clon.createCopy();
        board2.setName("Second Board");
        board2.deleteElement(0);

        System.out.println(Clon.toString());
        System.out.println(board2.toString());

        System.out.println("=======================TOTAL SUMM=======================================================");
        System.out.println(Clon.totalSummElements());

    }
}
