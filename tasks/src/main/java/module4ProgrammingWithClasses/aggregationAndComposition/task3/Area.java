package module4ProgrammingWithClasses.aggregationAndComposition.task3;

import java.util.ArrayList;
import java.util.List;

public class Area {

    private String name;
    private City areaCenter;
    private List<Region> regions = new ArrayList<>();


    public Area(String name, City areaCenter) {
        this.name = name;
        this.areaCenter = areaCenter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    public City getAreaCenter() {
        return areaCenter;
    }

    public void setAreaCenter(City areaCenter) {
        this.areaCenter = areaCenter;
    }


    public void addRegion(Region region) {
        regions.add(region);
    }

    @Override
    public String toString() {
        return name + "область, " + areaCenter +
                regions.toString() + '\n';
    }

}
