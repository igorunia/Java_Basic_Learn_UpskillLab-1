package module5.BasicOfOOP.Belarus;

/**
 * Создать объект класса Беларусь, используя класс Область.
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */

public class Runner {
    public static void main(String args[]) {

        Belarus belarus = new Belarus();

        belarus.addRegion(new Region(new City("Minsk", true), "Minskiy", 222));
        belarus.addRegion(new Region(new City("Minsk", true), "Minskiy", 222));
        belarus.addRegion(new Region(new City("Minsk", true), "Minskiy", 222));
        belarus.addRegion(new Region(new City("Minsk", true), "Minskiy", 222));
        belarus.addRegion(new Region(new City("Minsk", true), "Minskiy", 222));
        belarus.addRegion(new Region(new City("Minsk", true), "Minskiy", 222));


        System.out.println(belarus.getCapital().getName());
        System.out.println("---------------------------------");
        System.out.println(belarus.getCountRegion());
        System.out.println("-----------------------------------");
        System.out.println(belarus.getSumOfArea());
        System.out.println("----------------------------------");
        belarus.printRegion();

    }
}
