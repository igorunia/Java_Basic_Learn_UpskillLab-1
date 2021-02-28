package module4.TheSimplestClassesAndObjects.Task10;

/*
 * Создать класс Airline, спецификация которого приведена ниже. Определить конст рукторы, set- и get- методы
 * и метод  toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
 * методами. Задать критерии выбора данных и вывести эти данные на консоль.
 *    Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 *    Найти и вывести:
 *    a) список рейсов для заданного пункта назначения;
 *    b) список рейсов для заданного дня недели;
 *    c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.Arrays;

public class Airline {
    private final String destination;
    private final String flightNumber;
    private final String planeType;
    private final LocalTime departureTime;
    private final DayOfWeek[] dayOfWeek;

    Airline(String destination, String flightNumber, String planeType, LocalTime departureTime, DayOfWeek[] dayOfWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.planeType = planeType;
        this.departureTime = departureTime;
        this.dayOfWeek = dayOfWeek;
    }


    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                ", planeType='" + planeType + '\'' +
                ", departureTime=" + departureTime +
                ", dayOfWeek=" + Arrays.toString(dayOfWeek) +
                '}';
    }

    public String getDestination() {
        return destination;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public DayOfWeek[] getDayOfWeek() {
        return dayOfWeek;
    }

}



