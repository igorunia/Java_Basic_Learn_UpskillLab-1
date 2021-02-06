package module4.TheSimplestClassesAndObjects;

/**
 * Создайте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами.
 * Добавьте конструктор, инициализирующий члены класса по умолчанию.
 * Добавьте set- и get- методы для полей экземпляра класса.
 */

public class Task2 {
    public static void main(String args[]) {


    }
}

class Test2 {
    int a = 1;
    int b = 2;

    Test2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    Test2() {
        this.a = 1;
        this.b = 2;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}



