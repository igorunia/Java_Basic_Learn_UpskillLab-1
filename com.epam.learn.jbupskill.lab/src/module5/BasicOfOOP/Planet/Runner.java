package module5.BasicOfOOP.Planet;

/**
 * Создать объект класса Планета, используя класс Материк.
 * Методы: вывести на консоль название материка, планеты, количество материков.
 */

public class Runner {

    public static void main(String args[]) {

        Planet earth = new Planet("Earth");
        earth.addContinent(new Continent("Asia"));
        earth.addContinent(new Continent("Africa"));
        earth.addContinent(new Continent("America"));
        earth.addContinent(new Continent("Europe"));
        earth.addContinent(new Continent("Australia"));
        earth.addContinent(new Continent("Oceania"));
        earth.addContinent(new Continent("Antarctica"));

        System.out.println("Display the name of the continent to the console");
        earth.printContinent();
        System.out.println("--------------------------------------------------");
        System.out.println("Display the name of the planet to the console");
        earth.printPlanet();
        System.out.println("----------------------------------------------------");
        System.out.println("Display amount of the continent to the console: " + earth.countOfContinent());

    }

}
