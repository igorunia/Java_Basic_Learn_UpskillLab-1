package module4.TheSimplestClassesAndObjects.Task10;

import java.text.ParseException;
import java.time.DayOfWeek;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws ParseException {
        FlightSchedule flightSchedule = new FlightSchedule("Minsk");

        flightSchedule.addAirline("Berlin", "B2 111", "Embr",
                "13:00", new DayOfWeek[]{DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY,
                        DayOfWeek.THURSDAY, DayOfWeek.FRIDAY, DayOfWeek.SUNDAY});
        flightSchedule.addAirline("Moscow", "B2 222", "Boeing",
                "8:05", new DayOfWeek[]{DayOfWeek.SUNDAY});
        flightSchedule.addAirline("Minsk", "B2 333", "Boeing",
                "10:05", new DayOfWeek[]{DayOfWeek.SUNDAY});

        System.out.println("List of flights with destination Berlin:");
        List<Airline> airlinesToBrussels = flightSchedule.airlinesToDestination("Berlin");
        for (Airline airline : airlinesToBrussels) {
            System.out.println(airline);
        }

        System.out.println("--------------------------------------------------------");

        System.out.println("The list of flights departing on Sunday:");
        List<Airline> airlinesOnSunday = flightSchedule.flightDays(DayOfWeek.SUNDAY);
        for (Airline airline : airlinesOnSunday) {
            System.out.println(airline);
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("List of flights departing after 13:00 Tuesday:");
        List<Airline> airlinesOnTuesday = flightSchedule.flightDays(DayOfWeek.TUESDAY, "13:00");
        for (Airline airline : airlinesOnTuesday) {
            System.out.println(airline);
        }
    }
}
