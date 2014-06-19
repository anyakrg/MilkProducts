package entity;

import org.omg.CosNaming._NamingContextExtStub;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Clon implements Cloneable {
    private String name;
    private int length;
    private int width;
    private List<Product> products = new ArrayList<Product>();

    public Clon(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Clon createCopy(){
        Clon copy = null;
        try {
            copy = (Clon)super.clone();
            copy.name = new String(name);
            copy.products = new ArrayList<>(products);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return copy;
    }

    public void deleteElement(int index){
        products.remove(index);
    }

    public void establishProduct(Product... product) {
        for (Product product1 : product) {
            products.add(product1);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Clon clon = (Clon) o;

        if (length != clon.length) return false;
        if (width != clon.width) return false;
        if (!products.equals(clon.products)) return false;
        if (!name.equals(clon.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + length;
        result = 31 * result + width;
        result = 31 * result + products.hashCode();
        return result;
    }

    public void establishProduct(List<Product> product) {
        this.products = product;

    }

    public BigDecimal totalSummElements() {
        BigDecimal totalSumm = new BigDecimal(0);
        for (Product s : products) {
            totalSumm = totalSumm.add(s.getPrice());
        }
        return totalSumm;
    }

    @Override
    public String toString() {
        String elements = "";
        for (Product s : products) {
            elements = elements + s.toString() + "\n";
        }
        return  name + " {" +
                "length=" + length +
                ", width=" + width +
                ", devices:" + "\n" + elements +
                '}';
    }

}
