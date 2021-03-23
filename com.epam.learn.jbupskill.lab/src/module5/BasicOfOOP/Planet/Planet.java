package module5.BasicOfOOP.Planet;

import java.util.ArrayList;
import java.util.List;

public class Planet {

    private String name;
    private List<Continent> continents;

    public Planet(String name) {
        this.name = name;
        this.continents = new ArrayList<>();
    }


    public List<Continent> getContinents() {
        return continents;
    }

    public void setContinents(List<Continent> continents) {
        this.continents = continents;
    }

    public void addContinent(Continent continent) {
        continents.add(continent);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printContinent(){
        for(Continent continent:continents){
            System.out.println(continent.getContinentName());
        }
    }

    public void printPlanet(){
        System.out.println(name);
    }

    public int countOfContinent(){
        return continents.size();
    }

}
