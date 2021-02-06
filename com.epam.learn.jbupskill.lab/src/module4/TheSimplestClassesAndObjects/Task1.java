package module4.TheSimplestClassesAndObjects;

import java.sql.SQLOutput;

/**
 * Создайте класс Test1 двумя переменными.Добавьте метод вывода на экран и методы изменения этих переменных.
 * Добавьте метод,который находит сумму значений этих переменных,и метод,который находит наибольшее значение из
 * этих двух переменных.
 */
public class Task1 {
    public static void main(String args[]) {
        System.out.println();

    }
}

class Test1 {

    int a = 1;
    int b = 2;

    public void printTest1() {
        System.out.println("a = " + a + "b = " + b);
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getSum() {
        return a + b;
    }

    public int getMax() {
        if (a > b) {
            return a;
        }
        return b;
    }

}

