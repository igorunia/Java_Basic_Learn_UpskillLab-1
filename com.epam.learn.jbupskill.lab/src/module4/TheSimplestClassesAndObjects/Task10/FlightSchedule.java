package module4.TheSimplestClassesAndObjects.Task10;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.time.DayOfWeek;
import java.util.List;

public class FlightSchedule {

    private static final DateTimeFormatter FT = DateTimeFormatter.ofPattern("H:m");

    private final String airportName;
    private final List<Airline> airlines;

    public FlightSchedule(String airportName) {
        this(airportName, new ArrayList<>());
    }

    public FlightSchedule(String airportName, List<Airline> airline) {
        this.airportName = airportName;
        this.airlines = airline;
    }

    void addAirline(String destination, String flightNumber, String planeType, String departureTime, DayOfWeek[] dayOfWeek) {
        airlines.add(new Airline(destination, flightNumber, planeType, getTime(departureTime), dayOfWeek));
    }

    List<Airline> airlinesToDestination(String destination) {
        ArrayList<Airline> airlines = new ArrayList<>();
        for (Airline airline : this.airlines) {
            if (airline.getDestination().equals(destination)) {
                airlines.add(airline);
            }
        }
        return airlines;
    }

    List<Airline> flightDays(DayOfWeek dayOfWeek) {
        List<Airline> airlines = new ArrayList<>();
        for (Airline airline : this.airlines) {
            for (DayOfWeek day : airline.getDayOfWeek()) {
                if (day == dayOfWeek) {
                    airlines.add(airline);
                }
            }
        }
        return airlines;
    }

    List<Airline> flightDays(DayOfWeek dayOfWeek, String departureTimeString) {
        LocalTime departureTime = getTime(departureTimeString);
        List<Airline> airlines = new ArrayList<>();
        for (Airline airline : this.airlines) {
            for (DayOfWeek day : airline.getDayOfWeek()) {
                if (day == dayOfWeek && airline.getDepartureTime().isAfter(departureTime)) {
                    airlines.add(airline);
                }
            }
        }
        return airlines;
    }

    public String getAirportName() {
        return airportName;
    }

    private static LocalTime getTime(String time) {
        return LocalTime.parse(time, FlightSchedule.FT);
    }
}

