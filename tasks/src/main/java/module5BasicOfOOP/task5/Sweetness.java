package module5BasicOfOOP.task5;

public class Sweetness {

    private String name;
    private String company;
    private String color;
    private double weight;
    private double cost;


    public Sweetness(Builder builder) {

        this.name = builder.name;
        this.company = builder.company;
        this.color = builder.color;
        this.weight = builder.weight;
        this.cost = builder.cost;

    }


    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Sweetness{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", cost=" + cost +
                '}';
    }

    static class Builder {

        private String name;
        private String company = "Default company";
        private String color = "Red";
        private double weight = 1;
        private double cost = 1;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setCompany(String company) {
            this.company = company;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public Builder setCost(double cost) {
            this.cost = cost;
            return this;
        }

        public Sweetness build() {

            return new Sweetness(this);

        }
    }




}
