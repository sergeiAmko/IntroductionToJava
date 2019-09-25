package module4ProgrammingWithClasses.aggregationAndComposition.task2;

public class Wheel {

    private String name;
    private String brand;
    private double diameter;
    private String unit;

    public Wheel(String name, String brand, double diameter, String unit) {
        setBrand(brand);
        setName(name);
        setDiameter(diameter);
        setUnit(unit);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand != null) {
            this.brand = brand;
        } else {
            this.brand = "Default brand";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            this.name = "Default name";
        }
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        if (diameter > 0) {
            this.diameter = diameter;
        } else {
            this.diameter = 0;
        }
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        if (unit != null) {
            this.unit = unit;
        } else {
            this.unit = "Default unit";
        }
    }

    @Override
    public String toString() {
        return "brand: " + brand +
                ", name: " + name +
                ", diameter: " + diameter +
                ", unit: " + unit;
    }
}
