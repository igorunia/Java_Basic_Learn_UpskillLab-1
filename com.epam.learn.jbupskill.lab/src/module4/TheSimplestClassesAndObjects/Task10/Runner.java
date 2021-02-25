package module4.TheSimplestClassesAndObjects.Task10;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.time.DayOfWeek;

public class Runner {
    public static void main(String[] args) throws ParseException {
        FlightSchedule flightSchedule = new FlightSchedule("Minsk", new ArrayList<>());
        flightSchedule.addAirline("Berlin", "B2 111", "Embr",
                Airline.ft.parse("13:00"), new DayOfWeek[]{DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY,
                        DayOfWeek.THURSDAY, DayOfWeek.FRIDAY, DayOfWeek.SUNDAY});
        flightSchedule.addAirline("Moscow", "B2 222", "Boeing",
                Airline.ft.parse("8:05"), new DayOfWeek[]{DayOfWeek.SUNDAY});
        flightSchedule.addAirline("Minsk", "B2 333", "Boeing",
                Airline.ft.parse("10:05"), new DayOfWeek[]{DayOfWeek.SUNDAY});

        System.out.println("List of flights with destination Berlin:");
        ArrayList<Airline> airlinesToBrussels = flightSchedule.airlinesToDestination("Berlin");
        for (Airline airline : airlinesToBrussels) {
            System.out.println(airline);
        }

        System.out.println("--------------------------------------------------------");

        System.out.println("The list of flights departing on Sunday:");
        ArrayList<Airline> airlinesOnSunday = flightSchedule.flightDays(DayOfWeek.SUNDAY);
        for (Airline airline : airlinesOnSunday) {
            System.out.println(airline);
        }
        System.out.println("-------------------------------------------------------");

        System.out.println("List of flights departing after 13:00 Tuesday:");
        Date time = Airline.ft.parse("13:00");
        ArrayList<Airline> airlinesOnTuesday = flightSchedule.flightDays(DayOfWeek.TUESDAY, time);
        for (Airline airline : airlinesOnTuesday) {
            System.out.println(airline);
        }
    }
}
