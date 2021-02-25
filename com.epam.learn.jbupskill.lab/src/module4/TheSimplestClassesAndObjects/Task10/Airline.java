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

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.Date;

public class Airline {
    private final String destination;
    private final String flightNumber;
    private final String planeType;
    private final Date departureTime;
    private final DayOfWeek[] dayOfWeek;

    static SimpleDateFormat ft = new SimpleDateFormat("HH:mm");

    Airline(String destination, String flightNumber, String planeType, Date departureTime, DayOfWeek[] dayOfWeek) {
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

    public Date getDepartureTime() {
        return departureTime;
    }

    public DayOfWeek[] getDayOfWeek() {
        return dayOfWeek;
    }

}



