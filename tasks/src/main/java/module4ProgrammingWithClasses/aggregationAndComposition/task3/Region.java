package module4ProgrammingWithClasses.aggregationAndComposition.task3;

import java.util.ArrayList;
import java.util.List;

public class Region {

    private String name;
    private City regionCenter;
    private List<City> cities = new ArrayList<>();


    public Region(String name, City regionCenter) {
        this.name = name;
        this.regionCenter = regionCenter;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public City getRegionCenter() {
        return regionCenter;
    }

    public void setRegionCenter(City regionCenter) {
        this.regionCenter = regionCenter;
    }


    public void addCity(City city) {
        cities.add(city);
    }

    @Override
    public String toString() {
        return name + "район, " + regionCenter + cities.toString() + '\n';
    }
}
