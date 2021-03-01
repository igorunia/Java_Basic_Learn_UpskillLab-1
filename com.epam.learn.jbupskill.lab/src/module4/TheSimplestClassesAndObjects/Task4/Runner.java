package module4.TheSimplestClassesAndObjects.Task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of the train");
        String numberOfTrain = scanner.next();

        Train train1 = new Train("Minsk", "3", "21.00");
        Train train2 = new Train("Brest", "8", "22.00");
        Train train3 = new Train("Gomel", "3", "23.00");
        Train train4 = new Train("Mogilev", "9", "20.00");
        Train train5 = new Train("Grodno", "5", "9.00");

        List<Train> trains = new ArrayList<>();

        trains.add(train1);
        trains.add(train2);
        trains.add(train3);
        trains.add(train4);
        trains.add(train5);

        System.out.println("Before sorting");
        for (Train tr : trains) {
            System.out.println(tr);
        }

        System.out.println("After sorting");
        trains.sort(Train::compareToNumberOfTrain);
        for (Train tr : trains) {
            System.out.println(tr);

        }

        System.out.println("----");

        for (Train tr : trains){
            if(tr.getNumber().equals(numberOfTrain)){
                System.out.println(tr);
            }
        }

        System.out.println("-----");

        System.out.println("Before sorting");
        for (Train tr : trains) {
            System.out.println(tr);
        }

        System.out.println("After sorting");
        trains.sort(Train::compareToTimeOfDeparture);

        for (Train tr : trains) {
            System.out.println(tr);

        }

    }
}




