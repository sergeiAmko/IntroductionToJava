package module4ProgrammingWithClasses.aggregationAndComposition.task2;

public class Engine {

    private String name;
    private double volume;
    private int power;
    private int numberOfCylinders;
    private double fuelConsumption;

    public Engine(String name, double volume, int power, int numberOfCylinders, double fuelConsumption) {
        setName(name);
        setVolume(volume);
        setPower(power);
        setNumberOfCylinders(numberOfCylinders);
        setFuelConsumption(fuelConsumption);
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

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        if (volume > 0) {
            this.volume = volume;
        } else {
            this.volume = 1;
        }
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if (power > 0) {
            this.power = power;
        } else {
            this.power = 1;
        }
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        if (numberOfCylinders > 0) {
            this.numberOfCylinders = numberOfCylinders;
        } else {
            this.numberOfCylinders = 1;
        }
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        if (fuelConsumption > 0) {
            this.fuelConsumption = fuelConsumption;
        } else {
            this.fuelConsumption = 1;
        }
    }

    @Override
    public String toString() {
        return "name: " + name +
                ", volume: " + volume +
                ", power: " + power +
                ", numberOfCylinders: " + numberOfCylinders +
                ", fuelConsumption: " + fuelConsumption;
    }
}
