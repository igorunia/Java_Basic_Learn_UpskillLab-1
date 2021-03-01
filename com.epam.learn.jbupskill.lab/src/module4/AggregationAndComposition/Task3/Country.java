package module4.AggregationAndComposition.Task3;

import java.util.ArrayList;

public class Country {
    private String countryName;
    private City capital;
    private ArrayList<Region> regions;

    Country(String countryName, City capital) {
        this.countryName = countryName;
        this.capital = capital;
        this.regions = new ArrayList<>();
    }

    void printNumberOfRegions() {
        System.out.println("There are regions in." + this.regions.size() + countryName);
    }

    void printCapital() {
        System.out.println("The capital of  is ." + countryName + capital);
    }

    void printArea() {
        double area = 0;
        for (Region region : regions) {
            area += region.getArea();
        }
        System.out.println("The area of  is " + countryName + area);
    }
    void printRegioCenters () {
        System.out.println("Regional centers of the : " + countryName);
        for (Region region : regions) {
            System.out.print(region.getRegionalName() + ", ");
        }
        System.out.println(" ");
    }

    void addRegion (Region region) {
        regions.add(region);
    }

    void removeRegion (String regionName) {
        for (Region region : regions) {
            if (regionName.equals(region.getRegionalName())) {
                regions.remove(region);
            }
        }
    }

    public ArrayList<Region> getRegions() {
        return regions;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }
}
