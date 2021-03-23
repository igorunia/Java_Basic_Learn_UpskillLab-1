package module5.BasicOfOOP.Belarus;

public class Region {
    private City regionName;
    private String name;
    private double area;

    public Region(City regionName, String name, double area) {
        this.regionName = regionName;
        this.name = name;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public City getRegionName() {
        return regionName;
    }

    public void setRegionName(City regionName) {
        this.regionName = regionName;
    }
}

