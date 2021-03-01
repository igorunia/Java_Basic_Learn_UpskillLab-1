package module4.AggregationAndComposition.Task3;

/*
 * Создать объект класса Государство, используя классы Область, Район, Город.
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */
public class Runner {
    public static void main(String[] args) {
        City minsk = new City("Minsk", 1999999);
        Country belarus = new Country("Belarus", minsk);

        belarus.addRegion(new Region("Minskaya oblast'", minsk, 59));
        belarus.addRegion(new Region("Brestskaya oblast'", new City("Brest", 343), 32));
        belarus.addRegion(new Region("Vitebskaya oblast'", new City("Vitebsk", 366), 40));
        belarus.addRegion(new Region("Gomel'skaya oblast'", new City("Gomel", 509), 44));
        belarus.addRegion(new Region("Grodnenskaya oblast'", new City("Grodno", 369), 25));
        belarus.addRegion(new Region("Mogilevskaya oblast'", new City("Mogilev", 382), 27));

        belarus.printCapital();
        belarus.printNumberOfRegions();
        belarus.printArea();
        belarus.printRegioCenters();
    }

}
