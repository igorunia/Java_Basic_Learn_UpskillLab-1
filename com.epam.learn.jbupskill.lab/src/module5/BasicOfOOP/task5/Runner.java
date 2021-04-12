package module5.BasicOfOOP.task5;

import module5.BasicOfOOP.task5.present.Present;
import module5.BasicOfOOP.task5.present.PresentBuilder;
import module5.BasicOfOOP.task5.products.Candy;

/**
 * Создать консольное приложение, удовлетворяющее следующим требованиям:
 * Корректно спроектируйте и реализуйте предметную область задачи.
 * Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов проектирования.
 * Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
 * для проверки корректности переданных данных можно применить регулярные выражения.
 * Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
 * Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
 * Вариант A. Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции
 * (объект, представляющий собой цветочную композицию). Составляющими цветочной композиции являются цветы и упаковка.
 * Вариант B. Подарки. Реализовать приложение, позволяющее создавать подарки (объект, представляющий собой подарок).
 * Составляющими целого подарка являются сладости и упаковка.
 */

public class Runner {
    public static void main(String[] args) {


        Action action = new Action();

        Present present = PresentBuilder.newBuilder()
                .withName("Happy Birthday")
                .withWrap(new Wrap("Box"))
                .addProduct(new Candy("Mars", 15))
                .addProduct(new Candy("Snickers", 11))
                .build();
        action.addPresents(present);
        action.printPresents();

    }
}
