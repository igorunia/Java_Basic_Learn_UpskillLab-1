package module5.BasicOfOOP.task4;

import java.util.Collections;
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

        game.addJewels(new Jewels("Gold", 10));
        game.addJewels(new Jewels("Silver", 15));
        game.addJewels(new Jewels("Bronze", 20));
        game.addJewels(new Jewels("Platinum", 30));
        game.addJewels(new Jewels("Iron", 40));
        game.addJewels(new Jewels("Diamond", 50));
        game.addJewels(new Jewels("Apple", 60));
        game.addJewels(new Jewels("Banana", 70));
        game.addJewels(new Jewels("Box", 80));
        game.addJewels(new Jewels("Arm", 90));
        game.addJewels(new Jewels("Heart", 100));
        game.addJewels(new Jewels("Eye", 1110));
        game.addJewels(new Jewels("Hair", 110));
        game.addJewels(new Jewels("Leg", 1110));
        game.addJewels(new Jewels("Head", 1550));
        game.addJewels(new Jewels("Brains", 1550));
        game.addJewels(new Jewels("Car", 1510));
        game.addJewels(new Jewels("House", 15150));
        game.addJewels(new Jewels("Gun", 145630));
        game.addJewels(new Jewels("Tea", 16460));
        game.addJewels(new Jewels("Coffee", 145640));
        game.addJewels(new Jewels("Furniture", 16460));
        game.addJewels(new Jewels("Cooker", 14640));
        game.addJewels(new Jewels("Computer", 14640));
        game.addJewels(new Jewels("Sink", 1460));
        game.addJewels(new Jewels("Meat", 14640));
        game.addJewels(new Jewels("Fish", 14640));
        game.addJewels(new Jewels("Desk", 14640));
        game.addJewels(new Jewels("Horn", 1460));
        game.addJewels(new Jewels("Cow", 104));
        game.addJewels(new Jewels("Cat", 6464));
        game.addJewels(new Jewels("Dog", 1046));
        game.addJewels(new Jewels("Bird", 14640));
        game.addJewels(new Jewels("Horse", 140));
        game.addJewels(new Jewels("Pig", 64466));
        game.addJewels(new Jewels("Frog", 4));
        game.addJewels(new Jewels("Egg", 1046));
        game.addJewels(new Jewels("Mobile", 1460));
        game.addJewels(new Jewels("TV", 1460));
        game.addJewels(new Jewels("Bed", 104));
        game.addJewels(new Jewels("Sofa", 1640));
        game.addJewels(new Jewels("Chair", 1467670));
        game.addJewels(new Jewels("Window", 1760));
        game.addJewels(new Jewels("Door", 10767));
        game.addJewels(new Jewels("Battery", 1076));
        game.addJewels(new Jewels("Pen", 17670));
        game.addJewels(new Jewels("Flash card", 1076));
        game.addJewels(new Jewels("Flower", 1076));
        game.addJewels(new Jewels("Tree", 10767));
        game.addJewels(new Jewels("Boat", 17670));
        game.addJewels(new Jewels("Boot", 107));
        game.addJewels(new Jewels("Wallet", 1076));
        game.addJewels(new Jewels("Mushroom", 10767));
        game.addJewels(new Jewels("Paper", 1076));
        game.addJewels(new Jewels("Pepper", 1760));
        game.addJewels(new Jewels("Sugar", 1076));
        game.addJewels(new Jewels("Salt", 1760));
        game.addJewels(new Jewels("Flour", 1760));
        game.addJewels(new Jewels("Flat", 176));
        game.addJewels(new Jewels("Shit", 1760));
        game.addJewels(new Jewels("Cup", 1076));
        game.addJewels(new Jewels("Vino", 1076));
        game.addJewels(new Jewels("Vodka", 1076));
        game.addJewels(new Jewels("Ball", 1076));
        game.addJewels(new Jewels("Calendar", 1076));
        game.addJewels(new Jewels("Umbrella", 1076));
        game.addJewels(new Jewels("Skirt", 1067));
        game.addJewels(new Jewels("Cake", 1670));
        game.addJewels(new Jewels("Peach", 1760));
        game.addJewels(new Jewels("Melon", 1760));
        game.addJewels(new Jewels("Grapes", 1760));
        game.addJewels(new Jewels("Pencil", 1760));
        game.addJewels(new Jewels("Jeans", 1760));
        game.addJewels(new Jewels("Jacket", 17660));
        game.addJewels(new Jewels("Ring", 1066));
        game.addJewels(new Jewels("Chain", 15870));
        game.addJewels(new Jewels("Plain", 1280));
        game.addJewels(new Jewels("Ship", 1280));
        game.addJewels(new Jewels("Jeep", 120));
        game.addJewels(new Jewels("Mirror", 1280));
        game.addJewels(new Jewels("Bag", 1280));
        game.addJewels(new Jewels("Carpet", 1028));
        game.addJewels(new Jewels("Bread", 12880));
        game.addJewels(new Jewels("Potato", 1082));
        game.addJewels(new Jewels("Water", 1028));
        game.addJewels(new Jewels("Coco-cola", 1280));
        game.addJewels(new Jewels("Pepsi", 109));
        game.addJewels(new Jewels("Tiger", 1029));
        game.addJewels(new Jewels("Lion", 1360));
        game.addJewels(new Jewels("Elephant", 1036));
        game.addJewels(new Jewels("Giraffe", 1036));
        game.addJewels(new Jewels("Wolf", 1036));
        game.addJewels(new Jewels("Bear", 1036));
        game.addJewels(new Jewels("Beer", 1036));
        game.addJewels(new Jewels("Card", 1036));
        game.addJewels(new Jewels("Fridge", 1036));
        game.addJewels(new Jewels("Pizza", 1063));
        game.addJewels(new Jewels("Cheese", 1063));
        game.addJewels(new Jewels("Cherry", 1280));
        game.addJewels(new Jewels("Camera", 1380));
        game.addJewels(new Jewels("Book", 12580));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 - Jewels viewing, 2 - The choice of the most expensive jewels, " +
                    "3 - The choice of jewels of a specific sum, 4 - Exit");
            long variant = scanner.nextLong();
            if (variant == 1) {
                System.out.println("Jewels viewing: ");
                game.viewingJewels();
            } else if (variant == 2) {
                System.out.println("The most expensive jewels: " );
                game.maxPriceJewels();


            } else if (variant == 3) {
                System.out.println("Jewels of a specific sum: ");
                game.getSumJewels(10);
            }
            break;

        }



    }

}
