package module4.TheSimplestClassesAndObjects.Task10;

import java.util.ArrayList;
import java.util.Date;
import java.time.DayOfWeek;

public class FlightSchedule {
    private final String airportName;
    private final ArrayList<Airline> airlines;

    FlightSchedule(String airportName, ArrayList<Airline> airline) {
        this.airportName = airportName;
        this.airlines = airline;
    }

    void addAirline(String destination, String flightNumber, String planeType, Date departureTime, DayOfWeek[] dayOfWeek) {
        airlines.add(new Airline(destination, flightNumber, planeType, departureTime, dayOfWeek));
    }

    ArrayList<Airline> airlinesToDestination(String destination) {
        ArrayList<Airline> airlines = new ArrayList<>();
        for (Airline airline : this.airlines) {
            if (airline.getDestination().equals(destination)) {
                airlines.add(airline);
            }
        }
        return airlines;
    }

    ArrayList<Airline> flightDays(DayOfWeek dayOfWeek) {
        ArrayList<Airline> airlines = new ArrayList<>();
        for (Airline airline : this.airlines) {
            for (DayOfWeek day : airline.getDayOfWeek()) {
                if (day == dayOfWeek) {
                    airlines.add(airline);
                }
            }
        }
        return airlines;
    }

    ArrayList<Airline> flightDays(DayOfWeek dayOfWeek, Date departureTime) {
        ArrayList<Airline> airlines = new ArrayList<>();
        for (Airline airline : this.airlines) {
            for (DayOfWeek day : airline.getDayOfWeek()) {
                if (day == dayOfWeek) {
                    if (airline.getDepartureTime().compareTo(departureTime) >= 0) {
                        airlines.add(airline);
                    }
                }
            }
        }
        return airlines;
    }

}

