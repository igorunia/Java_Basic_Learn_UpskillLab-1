package module5.BasicOfOOP.task4;

import module5.BasicOfOOP.task4.jewels.*;

import java.util.Scanner;

/**
 * Создать консольное приложение, удовлетворяющее следующим требованиям:
 * Приложение должно быть объектно-, а не процедурно-ориентированным.
 * Каждый класс должен иметь отражающее смысл название и информативный состав.
 * Наследование должно применяться только тогда, когда это имеет смысл.
 * При кодировании должны быть использованы соглашения об оформлении кода java code convention.
 * Классы должны быть грамотно разложены по пакетам.
 * Консольное меню должно быть минимальным.
 * Для хранения данных можно использовать файлы.
 * Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере дракона.
 * Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
 * выбора сокровищ на заданную сумму.
 */

public class Runner {

    public static void main(String args[]) {

        Game game = new Game();


        game.addJewels(new ValuableMetals("Gold", 10));
        game.addJewels(new ValuableMetals("Silver", 15));
        game.addJewels(new ValuableMetals("Bronze", 20));
        game.addJewels(new ValuableMetals("Platinum", 30));
        game.addJewels(new ValuableMetals("Iron", 40));
        game.addJewels(new ValuableMetals("Diamond", 50));
        game.addJewels(new Fruit("Apple", 60));
        game.addJewels(new Fruit("Banana", 70));
        game.addJewels(new Fruit("apricot", 80));
        game.addJewels(new Fruit("avocado", 90));
        game.addJewels(new Fruit("pineapple", 100));
        game.addJewels(new Fruit("bergamot", 1110));
        game.addJewels(new Fruit("durian", 110));
        game.addJewels(new Fruit("grapefruit", 1110));
        game.addJewels(new Fruit("kiwi", 1550));
        game.addJewels(new Fruit("lime", 1550));
        game.addJewels(new Fruit("lemon", 1510));
        game.addJewels(new Fruit("loquat", 15150));
        game.addJewels(new Fruit("mango", 145630));
        game.addJewels(new Fruit("melon", 16460));
        game.addJewels(new Fruit("nectarine", 145640));
        game.addJewels(new Fruit("orange", 16460));
        game.addJewels(new Fruit("passion fruit", 14640));
        game.addJewels(new Fruit("papaya", 14640));
        game.addJewels(new Fruit("peach", 1460));
        game.addJewels(new Fruit("pear", 14640));
        game.addJewels(new Fruit("persimmon", 14640));
        game.addJewels(new Fruit("pineapple", 14640));
        game.addJewels(new Fruit("plum", 1460));
        game.addJewels(new Fruit("pomegranate", 104));
        game.addJewels(new Fruit("pomelo", 6464));
        game.addJewels(new Fruit("quince", 1046));
        game.addJewels(new Fruit("tangerine", 14640));
        game.addJewels(new Berries("barberry", 140));
        game.addJewels(new Berries("blackberry", 64466));
        game.addJewels(new Berries("black chokeberry", 4));
        game.addJewels(new Berries("blueberry ", 1046));
        game.addJewels(new Berries("buckthorn", 1460));
        game.addJewels(new Berries("cherry", 1460));
        game.addJewels(new Berries("cloudberry", 104));
        game.addJewels(new Berries("cowberry", 1640));
        game.addJewels(new Berries("cranberry", 1467670));
        game.addJewels(new Berries("currant", 1760));
        game.addJewels(new Berries("date", 10767));
        game.addJewels(new Berries("dogwood", 1076));
        game.addJewels(new Berries("elder", 17670));
        game.addJewels(new Berries("fig", 1076));
        game.addJewels(new Berries("grape", 1076));
        game.addJewels(new Berries("goji berry", 10767));
        game.addJewels(new Berries("gooseberry", 17670));
        game.addJewels(new Berries("raspberry", 107));
        game.addJewels(new Berries("ros hip", 1076));
        game.addJewels(new Berries("rowan", 10767));
        game.addJewels(new Berries("strawberry", 1076));
        game.addJewels(new Berries("sweet cherry", 1760));
        game.addJewels(new Berries("viburnum", 1076));
        game.addJewels(new Berries("wild strawberry", 1760));
        game.addJewels(new Vegetables("watermelon", 1760));
        game.addJewels(new Vegetables("asparagus", 176));
        game.addJewels(new Vegetables("beans", 1760));
        game.addJewels(new Vegetables("beet", 1076));
        game.addJewels(new Vegetables("broccoli", 1076));
        game.addJewels(new Vegetables("brussels sprouts", 1076));
        game.addJewels(new Vegetables("cabbage", 1076));
        game.addJewels(new Vegetables("carrot", 1076));
        game.addJewels(new Vegetables("cauliflower", 1076));
        game.addJewels(new Vegetables("celery", 1067));
        game.addJewels(new Vegetables("chili", 1670));
        game.addJewels(new Vegetables("chinese cabbage", 1760));
        game.addJewels(new Vegetables("corn", 1760));
        game.addJewels(new Vegetables("cucumber", 1760));
        game.addJewels(new Vegetables("daikon", 1760));
        game.addJewels(new Vegetables("eggplant", 1760));
        game.addJewels(new Vegetables("garlic", 17660));
        game.addJewels(new Vegetables("green bea", 1066));
        game.addJewels(new Vegetables("kale", 15870));
        game.addJewels(new Vegetables("lettuce", 1280));
        game.addJewels(new Vegetables("okra", 1280));
        game.addJewels(new Vegetables("onion", 120));
        game.addJewels(new Vegetables("parsley", 1280));
        game.addJewels(new Vegetables("pepper", 1280));
        game.addJewels(new Vegetables("peas", 1028));
        game.addJewels(new Vegetables("potato", 12880));
        game.addJewels(new Vegetables("pumpkin ", 1082));
        game.addJewels(new Vegetables("radish", 1028));
        game.addJewels(new Vegetables("spinach", 1280));
        game.addJewels(new Vegetables("tomatoes", 109));
        game.addJewels(new Nuts("turnips", 1029));
        game.addJewels(new Nuts("acorn", 1360));
        game.addJewels(new Nuts("almond ", 1036));
        game.addJewels(new Nuts("beechnut", 1036));
        game.addJewels(new Nuts("cashew", 1036));
        game.addJewels(new Nuts("chestnut", 1036));
        game.addJewels(new Nuts("coconut", 1036));
        game.addJewels(new Nuts("hazelnut", 1036));
        game.addJewels(new Nuts("nutmeg", 1036));
        game.addJewels(new Nuts("peanut", 1063));
        game.addJewels(new Nuts("pecan", 1063));
        game.addJewels(new Nuts("pine nut", 1280));
        game.addJewels(new Nuts("pistachio", 1380));
        game.addJewels(new Nuts("walnut", 12580));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 - Jewels viewing, 2 - The choice of the most expensive jewels, " +
                    "3 - The choice of jewels of a specific sum, 4 - Exit");
            long variant = scanner.nextLong();
            if (variant == 1) {
                System.out.println("Jewels viewing: ");
                game.viewingJewels();
            } else if (variant == 2) {
                System.out.println("The most expensive jewels: ");
                game.maxPriceJewels();


            } else if (variant == 3) {
                System.out.println("Jewels of a specific sum: ");
                game.getSumJewels(10);
            }
            break;

        }

    }

}
