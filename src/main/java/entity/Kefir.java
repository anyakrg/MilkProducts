package entity;

public class Kefir extends Product {

    private Type type;
    private int livingDays;

     public Kefir(int price, int fatPercentage, int calories, Type ingredientsType) {
        super(price, fatPercentage, calories);
    }

    public enum Type {
        SOFT, PROCESSED, HARD;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Kefir)) return false;

        Kefir kefir = (Kefir) o;

        if (livingDays != kefir.livingDays) return false;
        if (type != kefir.type) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = type.hashCode();
        result = 31 * result + livingDays;
        return result;
    }

    @Override
    public String toString() {
        return "Kefir{" +
                "ingredients Milk=" + type +
                ", livingDays=" + livingDays +
                '}';
    }

    public static class Builder {
        private int price;
        private int fatPercentage;
        private int calories;
        private Type ingredientsType;
        private int livingDays;

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

        public Builder ingredientsType(Type ingredientsType) {
            this.ingredientsType = ingredientsType;
            return this;
        }

        public Kefir buildKefir(){
            return new Kefir(price, fatPercentage, calories, ingredientsType);
        }
   }


}
