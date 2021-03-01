package module4.TheSimplestClassesAndObjects.Task6;

public class Runner {
    public static void main(String[] args) {
        Time time = new Time(22, 55, 15);
        System.out.println("Initial time: " + time.getTime());

        System.out.print("Set hour ");
        time.setHour(5);
        System.out.println(time.getTime());
        System.out.println("----------------");

        System.out.print("Set minute ");
        time.setMinute(2);
        System.out.println(time.getTime());
        System.out.println("----------------");


        System.out.print("Set seconds ");
        time.setSecond(20);
        System.out.println(time.getTime());
        System.out.println("----------------");

        System.out.print("ChangeHour ");
        time.changeHour(3);
        System.out.println(time.getTime());
        System.out.println("----------------");

        System.out.print("ChangeMinute ");
        time.changeMinute(35);
        System.out.println(time.getTime());
        System.out.println("------------------");

        System.out.print("ChangeSecond ");
        time.changeSecond(2556);
        System.out.println(time.getTime());
    }

}

