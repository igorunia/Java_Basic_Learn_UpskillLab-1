package module5.BasicOfOOP.Star_planet;

public class Moon {

    private Star name;

    public Moon(Star name) {
        this.name = name;
    }

    public Star getName() {
        return name;
    }

    public void setName(Star name) {
        this.name = name;
    }
}
