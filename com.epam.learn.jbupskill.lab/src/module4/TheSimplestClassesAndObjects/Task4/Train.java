package module4.TheSimplestClassesAndObjects.Task4;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам
 * поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
 * Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны
 * быть упорядочены по времени отправления.
 */
public class Train {
    private final String nameOfDestination;
    private final String number;
    private final LocalTime timeOfDeparture;

    public Train(String nameOfDestination, String number, String timeOfDeparture) {
        this.nameOfDestination = nameOfDestination;
        this.number = number;
        this.timeOfDeparture = LocalTime.parse(timeOfDeparture, DateTimeFormatter.ofPattern("H.m"));
    }

    public String getNameOfDestination() {
        return nameOfDestination;
    }

    public String getNumber() {
        return number;
    }

    public LocalTime getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public int compareToNumberOfTrain(Train o) {
        return this.number.compareTo(o.number);
    }

    @Override
    public String toString() {
        return "Train{" +
                "nameOfDestination='" + nameOfDestination + '\'' +
                ", number='" + number + '\'' +
                ", timeOfDeparture='" + timeOfDeparture + '\'' +
                '}';
    }

    public int compareToTimeOfDeparture(Train o) {
        int i = this.getNameOfDestination().compareTo(o.getNameOfDestination());
        if (i == 0) {
            return this.getTimeOfDeparture().compareTo(o.getTimeOfDeparture());
        } else {
            return i;
        }
    }
}