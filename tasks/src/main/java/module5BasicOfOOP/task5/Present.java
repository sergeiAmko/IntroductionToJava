package module5BasicOfOOP.task5;

import java.util.ArrayList;
import java.util.List;

public class Present {

    private String name;
    private Packing packing;
    private List<Sweetness> sweets = new ArrayList<>();
    private double cost = 0;


    public Present(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Packing getPacking() {
        return packing;
    }

    public List<Sweetness> getSweets() {
        return sweets;
    }

    public double getCost() {
        return cost;
    }


    public boolean addSweetness(Sweetness sweetness) {

        if (sweetness == null) {
            return false;

        }

        sweets.add(sweetness);
        cost += sweetness.getCost();
        return true;

    }

    public boolean pack(Packing packing) {

        if (packing == null) {
            return false;
        }

        if (packing.equals(this.packing)) {
            return false;
        }

        if (this.packing == null) {

            cost += packing.getCost();

        } else {
            cost -= this.packing.getCost();
            cost += packing.getCost();
        }

        this.packing = packing;

        return true;

    }


}
