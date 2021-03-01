package module4.TheSimplestClassesAndObjects.Task5;

/**
 * Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу
 * в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
 * Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние.
 * Написать код, демонстрирующий все возможности класса.
 */

public class Counter {
    private int currentValue;
    private final int minValue;
    private final int maxValue;

    public Counter() {
        this.currentValue = 0;
        this.minValue = 0;
        this.maxValue = 10;
    }

    public Counter(int currentValue, int minValue, int maxValue) {
        this.currentValue = currentValue;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public void increaseValue() {
        currentValue++;
        if (currentValue == maxValue) {
            System.out.println("Upper Range Reached");
        } else if (currentValue > maxValue) {
            System.out.println("Invalid overshoot of the range");
            currentValue--;
        }
    }

    public void reduceValue() {
        currentValue--;
        if (currentValue == minValue) {
            System.out.println("Upper Range Reached");
        } else if (currentValue < minValue) {

            System.out.println("Invalid overshoot of the range");
            currentValue++;
        }
    }
}
