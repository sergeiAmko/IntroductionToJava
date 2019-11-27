package module4ProgrammingWithClasses.elementaryClassesAndObjects.task10;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class AirlineUtils {
    private Airline[] airlines;
    private int count = 0;

    public AirlineUtils() {
        airlines = new Airline[16];
    }

    public Airline[] getAirlines() {
        return airlines;
    }

    public void add(Airline airline) {
        if (count == airlines.length) {
            Airline[] middleAirlines= new Airline[airlines.length * 2];

            System.arraycopy(airlines, 0, middleAirlines, 0, airlines.length);

            airlines = middleAirlines;

        }

        airlines[count++] = airline;
    }




    public Airline[] listOfFlightsForDestination(String searchDestination) {

        int countSearchAirlines=0;
        Airline[] searchedAirlines=new Airline[count];
        Airline[] outAirlines;

        for (int i = 0; i < count; i++) {
            if (airlines[i].getDestination().equals(searchDestination)){

                searchedAirlines[countSearchAirlines++]=airlines[i];
            }

        }

        outAirlines=new Airline[countSearchAirlines];

        for (int i = 0; i < countSearchAirlines; i++) {
            outAirlines[i]=searchedAirlines[i];

        }

        return outAirlines;
    }

    public Airline[] listOfFlightsForDayOfWeek(DayOfWeek searchDayOfWeek){

        int countSearchAirlines=0;
        Airline[] searchedAirlines=new Airline[count];
        Airline[] outAirlines;

        for (int i = 0; i < count; i++) {
            DayOfWeek[] daysOfWeek = airlines[i].getDaysOfWeek();

            for (DayOfWeek dayOfWeek : daysOfWeek) {
                if (dayOfWeek == searchDayOfWeek) {
                    searchedAirlines[countSearchAirlines++] = airlines[i];
                    break;
                }

            }
        }

        outAirlines=new Airline[countSearchAirlines];

        for (int i = 0; i < countSearchAirlines; i++) {
            outAirlines[i]=searchedAirlines[i];

        }

        return outAirlines;
    }

    public Airline[] listOfFlightsForDayOfWeekAfterSpecifyTime(DayOfWeek searchDayOfWeek, LocalTime specifyTime){

        int countSearchAirlines=0;
        Airline[] searchedAirlines=new Airline[count];
        Airline[] outAirlines;

        for (int i = 0; i < count; i++) {
            DayOfWeek[] daysOfWeek = airlines[i].getDaysOfWeek();

            for (int j = 0; j < daysOfWeek.length; j++) {
                if (airlines[i].getTimeOfDeparture().compareTo(specifyTime)<=0){
                    break;
                }else if (daysOfWeek[j]==searchDayOfWeek){
                    searchedAirlines[countSearchAirlines++]=airlines[i];
                    break;
                }

            }
        }

        outAirlines=new Airline[countSearchAirlines];

        for (int i = 0; i < countSearchAirlines; i++) {
            outAirlines[i]=searchedAirlines[i];

        }

        return outAirlines;
    }


    public static void print(Airline[] airlines) {
        if (airlines.length != 0) {

            for (int i = 0; i < airlines.length; i++) {
                if (airlines[0]==null){
                    System.out.println("List is empty");
                    return;
                }else if (airlines[i]==null){
                    return;
                }else {
                    System.out.println(airlines[i]);
                }
            }
        }else {
            System.out.println("List airlines is empty\n");
        }
    }

}
