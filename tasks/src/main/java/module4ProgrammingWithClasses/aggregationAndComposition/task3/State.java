package module4ProgrammingWithClasses.aggregationAndComposition.task3;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class State {

    private String name;
    private List<Area> areas;
    private City capital;
    private double area;

    public State(String name, List<Area> areas, City capital, double area) {
        this.name = name;
        this.areas = areas;
        this.capital = capital;
        this.area = area;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Area> getAreas() {
        return areas;
    }

    public void setAreas(List<Area> areas) {
        this.areas = areas;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }


    public int getCountAreas() {
        return areas.size();
    }

    public List<City> getAreaCenters() {

        List<City> areaCenter = new ArrayList<>();

        for (Area area : areas) {
            areaCenter.add(area.getAreaCenter());
        }

        return areaCenter;

    }

    @Override
    public String toString() {
        return name + ' ' +" area= "+area+capital+
                ", areas=" + areas;
    }
}
