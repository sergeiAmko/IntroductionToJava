package module5BasicOfOOP.task4;

public class Treasure {

    private String name;
    private double cost;


    public Treasure(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }


    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Treasure{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
