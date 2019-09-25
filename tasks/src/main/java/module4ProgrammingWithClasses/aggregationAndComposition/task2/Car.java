package module4ProgrammingWithClasses.aggregationAndComposition.task2;

import java.time.LocalTime;

public class Car {

    private String name;
    private String brand;
    private CarType body;
    private int countOfDoors;
    private double volumeOfTank;
    private double litersInTank;
    private Engine engine;
    private Wheel frontLeft;
    private Wheel frontRight;
    private Wheel rearLeft;
    private Wheel rearRight;

    public Car(String name, String brand, CarType body, int countOfDoors, double volumeOfTank, double litersInTank, Engine engine,
               Wheel frontLeft, Wheel frontRight, Wheel rearLeft, Wheel rearRight) {
        setName(name);
        setBrand(brand);
        setBody(body);
        setCountOfDoors(countOfDoors);
        setVolumeOfTank(volumeOfTank);
        setLitersInTank(litersInTank);
        setEngine(engine);
        setFrontLeft(frontLeft);
        setFrontRight(frontRight);
        setRearLeft(rearLeft);
        setRearRight(rearRight);


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public CarType getBody() {
        return body;
    }

    public void setBody(CarType body) {
        if (body != null) {
            this.body = body;
        } else {
            this.body = CarType.DEFAULT;
        }

    }

    public int getCountOfDoors() {
        return countOfDoors;
    }

    public void setCountOfDoors(int countOfDoors) {
        if (countOfDoors > 0) {
            this.countOfDoors = countOfDoors;
        } else {
            this.countOfDoors = 3;
        }
    }

    public double getVolumeOfTank() {
        return volumeOfTank;
    }

    public void setVolumeOfTank(double volumeOfTank) {
        if (volumeOfTank > 0) {
            this.volumeOfTank = volumeOfTank;
        } else {
            this.volumeOfTank = 60;
        }
    }

    public double getLitersInTank() {
        return litersInTank;
    }

    public void setLitersInTank(double litersInTank) {
        if (litersInTank > 0 && litersInTank < volumeOfTank)
            this.litersInTank = litersInTank;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        if (engine != null) {
            this.engine = engine;
        } else {
            this.engine = new Engine("Default", 1, 1, 1, 1);
        }
    }

    public Wheel getFrontLeft() {
        return frontLeft;
    }

    public void setFrontLeft(Wheel frontLeft) {
        this.frontLeft = frontLeft;
    }

    public Wheel getFrontRight() {
        return frontRight;
    }

    public void setFrontRight(Wheel frontRight) {
        this.frontRight = frontRight;
    }

    public Wheel getRearLeft() {
        return rearLeft;
    }

    public void setRearLeft(Wheel rearLeft) {
        this.rearLeft = rearLeft;
    }

    public Wheel getRearRight() {
        return rearRight;
    }

    public void setRearRight(Wheel rearRight) {
        this.rearRight = rearRight;
    }

    public double drive(double speed, LocalTime time) {

        double distanceKM = speed / 3.6 * time.toSecondOfDay() / 1000;

        double reserve = litersInTank / engine.getFuelConsumption() * 100;

        if (distanceKM >= reserve) {
            litersInTank = 0;
            System.out.println("Car stalled");
            return reserve;
        } else {
            System.out.println("было" + litersInTank);
            litersInTank = litersInTank - distanceKM / engine.getFuelConsumption();
            System.out.println("стало" + litersInTank);
            return distanceKM;

        }


    }

    public String getMarka() {
        return name;
    }

    public double refuel(double liters) {

        double refuseLitersInTank = litersInTank + liters;

        if (refuseLitersInTank >= volumeOfTank) {

            double middle = liters - (refuseLitersInTank - volumeOfTank);

            System.out.println("tank is fulled");
            litersInTank = volumeOfTank;

            return middle;

        } else {
            litersInTank = refuseLitersInTank;
            return liters;
        }
    }

    public void replaceWheel(int replacingWheel, Wheel newWheel) {

        Wheel oldWheel;

        switch (replacingWheel) {
            case 1:

                frontLeft = newWheel;
                break;
            case 2:

                frontRight = newWheel;
                break;
            case 3:

                rearLeft = newWheel;
                break;
            default:

                rearRight = newWheel;
                break;
        }

    }

    @Override
    public String toString() {
        return "Car\n" +
                "name: " + name +
                ", brand: " + brand +
                ", body:" + body +
                ", countOfDoors: " + countOfDoors +
                ", volumeOfTank: " + volumeOfTank +
                ", litersInTank: " + litersInTank +
                ", \nengine: " + engine +
                ", \nfrontLeft: " + frontLeft +
                ", \nfrontRight: " + frontRight +
                ", \nrearLeft: " + rearLeft +
                ", \nrearRight: " + rearRight;
    }
}
