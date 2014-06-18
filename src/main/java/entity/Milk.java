package entity;

import java.lang.reflect.Type;

public class Milk extends Product {

    public Type type;

     public Milk(int price, int fatPercentage, int calories, Type m_type) {
        super(price, fatPercentage, calories);
    }

    public enum type {
        SOY, ORGANIC, RICE, ALMOND, UNBOILED;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Milk)) return false;

        Milk milk = (Milk) o;

        if (type != milk.type) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return type.hashCode();
    }

    @Override
    public String toString() {
        return "Milk{" +
                "type=" + type +
                '}';
    }



    public static class Builder {
        private int price;
        private int fatPercentage;
        private int calories;
        private Type type;

        public Builder() {
        }

        public Builder price(int price) {
            this.price = price;
            return this;
        }

        public Builder fatPercentage(int fatPercentage) {
            this.fatPercentage = fatPercentage;
            return this;
        }

        public Builder calories(int calories) {
            this.calories = calories;
            return this;
        }

        public Builder type(Type type) {
            this.type = type;
            return this;
        }

        public Milk buildMilk(){
            return new Milk(price,fatPercentage,calories,type);
        }
    }


}
