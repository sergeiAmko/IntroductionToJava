package module4ProgrammingWithClasses.elementaryClassesAndObjects.task10;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.Arrays;

import static module4ProgrammingWithClasses.elementaryClassesAndObjects.task10.DayOfWeekUtils.containsElement;
import static module4ProgrammingWithClasses.elementaryClassesAndObjects.task10.DayOfWeekUtils.countUniqueElements;

public class Airline {

    private String destination;
    private int flightNumber;
    private String typeOfAirline;
    private LocalTime timeOfDeparture;
    private DayOfWeek[] daysOfWeek;

    public Airline(String destination, int flightNumber, String typeOfAirline, LocalTime timeOfDeparture, DayOfWeek[] daysOfWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.typeOfAirline = typeOfAirline;
        this.timeOfDeparture = timeOfDeparture;


        this.daysOfWeek = new DayOfWeek[countUniqueElements(daysOfWeek)];
        int p = 0;

        for (int i = 0; i < daysOfWeek.length; i++) {
            if (!containsElement(this.daysOfWeek, daysOfWeek[i])) {
                this.daysOfWeek[p++] = daysOfWeek[i];
            }
        }

    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getTypeOfAirline() {
        return typeOfAirline;
    }

    public void setTypeOfAirline(String typeOfAirline) {
        this.typeOfAirline = typeOfAirline;
    }

    public LocalTime getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public void setTimeOfDeparture(LocalTime timeOfDeparture) {
        this.timeOfDeparture = timeOfDeparture;
    }

    public DayOfWeek[] getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(DayOfWeek[] daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    @Override
    public String toString() {
        return "destination='" + destination + '\'' +
                ", flightNumber=" + flightNumber +
                ", typeOfAirline='" + typeOfAirline + '\'' +
                ", timeOfDeparture=" + timeOfDeparture +
                ", daysOfWeek=" + Arrays.toString(daysOfWeek) + "\n";
    }

}
