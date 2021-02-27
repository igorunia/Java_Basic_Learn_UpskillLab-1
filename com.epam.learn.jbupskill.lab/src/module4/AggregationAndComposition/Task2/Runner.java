package module4.AggregationAndComposition.Task2;

/*
 *  Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
 *  Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */
public class Runner {
    public static void main(String[] args) {
        Car volvoS80 = new Car("Volvo s80");
        System.out.println("My car:" + volvoS80.getModelName());
        volvoS80.run();

        Engine engine = new Engine(170, 2.4);
        volvoS80.setEngine(engine);
        System.out.println("The power of my car: " + engine.getPower());
        System.out.println("The volume of my car: " + engine.getVolume());
        volvoS80.run();

        int wheelDiameter = 17;
        volvoS80.setWheels(new Wheel(wheelDiameter), new Wheel(wheelDiameter), new Wheel(wheelDiameter), new Wheel(wheelDiameter));
        System.out.println("The wheels are installed : ");
        volvoS80.run();

        volvoS80.getWheels().get(1).breakWheel();
        System.out.println("STOP! Something broke:");
        volvoS80.run();

        volvoS80.changeWheel();
        System.out.println("Trying to drive:");
        volvoS80.run();

        System.out.println("The fuel empty: ");
        volvoS80.run();
        volvoS80.refuel();
        volvoS80.run();
    }
}
