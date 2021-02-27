package module4.AggregationAndComposition.Task2;

import java.util.ArrayList;
import java.util.Arrays;

public class Car {
    private String modelName;
    private Engine engine;
    private ArrayList<Wheel> wheels;
    private boolean isFuel;

    public Car(String modelName) {
        this.modelName = modelName;
        this.wheels = new ArrayList<>(4);
        this.isFuel = true;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

   public ArrayList<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(Wheel w1, Wheel w2, Wheel w3, Wheel w4) {
        this.wheels = new ArrayList<>(Arrays.asList(w1, w2, w3, w4));
    }

    public String getModelName() {
        return modelName;
    }

    public void changeWheel() {
        for(int i = 0; i < 4; i++) {
            if (!wheels.get(i).isGood()) {
                System.out.println("Wheel number is changed " + i + 1);
                int wheelD = this.getWheels().get(i).getDiameter();
                this.getWheels().set(i, new Wheel(wheelD));
            }
        }
    }

    public void setFuel(boolean fuel) {
        this.isFuel = fuel;
    }

    public void refuel() {
        this.isFuel = true;
        System.out.println("The car is refueled");
    }


   public void run() {
        int wheelCounter = 0;
        String message = "";
        boolean isEngine = false;

        for (Wheel wheel : wheels) {
            if (wheel != null) {
                wheelCounter++;
            }
        }
        if (wheelCounter == 0) {
            message = "Wheels are not installed. please install 4 wheels ";
        } else if (wheelCounter == 1) {
            message = "Only 1 wheel installed. Please install 3 more wheels ";
        } else if (wheelCounter == 2 || wheelCounter == 3) {
            message = String.format("only %d wheels installed. please install %d more wheels\n", wheelCounter, 4 - wheelCounter);
        }
        System.out.print(message);

        if (engine == null) {
            System.out.println("Engine not installed. please install the engine");
        } else {
            isEngine = true;
        }

        if (isEngine && wheelCounter == 4) {
            boolean ready = true;
            for (int i = 0; i < 4; i++) {
                if (!wheels.get(i).isGood()) {
                    System.out.println("wheel number %d is broken. Please replace the wheel" + i + 1);
                    ready = false;
                }
            }
            if (!isFuel) {
                System.out.println("out of fuel. It is necessary to refuel.");
            } else if (ready) {
                System.out.println("the car goes on the road!");
            }
        }

    }
}
