package module5.BasicOfOOP.Star_planet;

/**
 * Создать объект класса Звездная система, используя классы Планета, Звезда, Луна.
 * Методы: вывести на консоль количество планет в звездной системе, название звезды, добавление планеты в систему.
 */
public class Runner {
    public static void main(String[] args) {

       Star_planet starPlanet = new Star_planet();

        starPlanet.addPlanet(new Planet("Earth"),new Star("Solaris"));

        System.out.println("Display on the console the number of planets in a star system: " + starPlanet.countOfPlanet());
        System.out.println("-----------------------------------------------------");
        System.out.println("The star name ");
        starPlanet.printStar();

    }
}
