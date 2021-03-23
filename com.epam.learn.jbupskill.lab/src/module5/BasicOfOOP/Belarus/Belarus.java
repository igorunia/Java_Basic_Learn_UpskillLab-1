package module5.BasicOfOOP.Belarus;


import java.util.ArrayList;
import java.util.List;

public class Belarus {

    private List<Region> regions;


    public Belarus() {
        this.regions = new ArrayList<>();
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void addRegion(Region region) {
        regions.add(region);
    }

    public City getCapital() {
        City capital = null;
        for (Region region : regions) {
            if (region.getRegionName().isCapital()) {

                capital = region.getRegionName();
                break;
            }

        }
        return capital;
    }

    public int getCountRegion() {

        return regions.size();

    }

    public double getSumOfArea() {
        double area = 0;
        for (Region region : regions) {
            area += region.getArea();
        }

        return area;
    }

    public void printRegion() {
        for (Region region : regions) {
            System.out.println(region.getName());
        }

    }

}
