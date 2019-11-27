package module5BasicOfOOP.task5;

import java.util.Objects;

public class Packing {

    private String name;
    private double cost;

    public Packing(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Packing packing = (Packing) o;
        return Double.compare(packing.cost, cost) == 0 &&
                name.equals(packing.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost);
    }
}
