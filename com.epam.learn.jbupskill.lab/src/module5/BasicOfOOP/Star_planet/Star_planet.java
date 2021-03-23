package module5.BasicOfOOP.Star_planet;

import java.util.ArrayList;
import java.util.List;

public class Star_planet {


    private  List<Star>stars;
    private List<Planet>planets;

    public Star_planet() {
        this.stars = new ArrayList<>();
        this.planets = new ArrayList<>();
    }

    public List<Star> getStars() {
        return stars;
    }

    public void setStars(List<Star> stars) {
        this.stars = stars;
    }

    public List<Planet> getPlanets() {
        return planets;
    }

    public void setPlanets(List<Planet> planets) {
        this.planets = planets;
    }

    public void addPlanet(Planet planet, Star solyris){
        planets.add(planet);

    }
    public void printStar(){
        for (Star star:stars)
        System.out.println(star.getName());
    }

    public int countOfPlanet(){
        return planets.size();
    }

}
