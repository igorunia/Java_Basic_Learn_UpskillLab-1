package module4.TheSimplestClassesAndObjects.Task5;

public class Runner {
    public static void main(String[] args) {
        Counter firstCounter = new Counter();
        System.out.println("Current value of counter №1 - " + firstCounter.getCurrentValue());
        System.out.println("------------------------");
        System.out.print("Current value of counter reduces -  ");
        firstCounter.reduceValue();
        System.out.println("------------------------");
        System.out.print("Current value of counter increases - ");
        for (int i = 1; i <= 9; i++) {
            firstCounter.increaseValue();
        }
        System.out.println("Current value of counter №1 - " + firstCounter.getCurrentValue());
        System.out.println("------------------------------");
        System.out.print("Current value of counter increases - ");
        firstCounter.increaseValue();
        System.out.println("---------------------------------");
        System.out.println("Current value of counter №1 - " + firstCounter.getCurrentValue());
        System.out.println("---------------------------------");
        System.out.print("Current value of counter increases - ");
        firstCounter.increaseValue();
        System.out.println("------------------------------------");
        System.out.println("Current value of counter №1 - " + firstCounter.getCurrentValue());

    }
}
