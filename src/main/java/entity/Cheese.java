package entity;

public class Cheese extends Product {
    private Milk mtype;
    private Milk milk;

//    public Cheese(int price, int fatPercentage, int calories, Milk mtype, Milk milk) {
//        super(price, fatPercentage, calories, mtype, milk);
//        this.milk = this.milk;
//    }

    public Cheese(int price, int fatPercentage, int calories, Milk milk, Type mtype) {
        super(price, fatPercentage, calories);
    }

    public enum Type {
        SOFT, PROCESSED, HARD;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }
    public enum Milk {
        SHIP, GOAT, COW, MOOSE;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cheese)) return false;

        Cheese cheese = (Cheese) o;

        if (mtype != cheese.mtype) return false;
        if (milk != cheese.milk) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mtype.hashCode();
        result = 31 * result + milk.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Cheese{" +
                " Milk Milk " + mtype +
                ", Milk " + milk +
                '}';
    }

    public static class Builder {
         private int price;
         private int fatPercentage;
         private int calories;
         private Milk milk;
         private Type mtype;

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

        public Builder milk(Milk milk) {
            this.milk = milk;
            return this;
        }

        public Builder mType(Type mtype) {
            this.mtype = mtype;
            return this;
        }

        public Cheese buildCheese(){
            return new Cheese(price,fatPercentage,calories,milk,mtype);
        }

    }
}
