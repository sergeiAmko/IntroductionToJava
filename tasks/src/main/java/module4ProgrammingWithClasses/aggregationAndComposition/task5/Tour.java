package module4ProgrammingWithClasses.aggregationAndComposition.task5;

import java.util.List;

public class Tour {

    private static int generateID = 0;

    private int id = generateID++;
    private String name;
    private List<String> countries;
    private List<String> cities;
    private Type type;
    private List<Transport> transports;
    private List<Food> foods;
    private int countDay;
    private double price;


    public Tour(String name, List<String> countries, List<String> cities, Type type, List<Transport> transports, List<Food> foods, int countDay, double price) {
        this.name = name;
        this.countries = countries;
        this.cities = cities;
        this.type = type;
        this.transports = transports;
        this.foods = foods;
        this.countDay = countDay;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCountries() {
        return countries;
    }

    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List<Transport> getTransports() {
        return transports;
    }

    public void setTransports(List<Transport> transports) {
        this.transports = transports;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }

    public int getCountDay() {
        return countDay;
    }

    public void setCountDay(int countDay) {
        this.countDay = countDay;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", countries=" + countries +
                ", cities=" + cities +
                ", type=" + type +
                ", transports=" + transports +
                ", foods=" + foods +
                ", countDay=" + countDay +
                ", price=" + price + "\n";
    }
}
