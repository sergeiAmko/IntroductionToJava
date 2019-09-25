package module4ProgrammingWithClasses.elementaryClassesAndObjects.task10;

import javax.print.DocFlavor;
import java.io.Console;
import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int choice, inner;

        AirlineUtils airlineUtils = new AirlineUtils();

        String infoChoice = "\nInput number:\n" +
                "1- create and add new airline\n" +
                "2- get all airlines\n" +
                "3- list of airlines by specified destination\n" +
                "4- list of airlines by specified day of week\n" +
                "5- list of airlines by specified day of week after specified time\n" +
                "other- exit";

        String infoDestination = "Input destination of airline";
        String infoFlightNumber = "Input flight number of airline";
        String infoType = "Input type of airlines";
        String infoTimeOfDeparture = "Input time of departure airlines";
        String infoCountDaysOfWeek = "Input number days of weed airline";
        String infoDayOfWeek = "Input day of week airline";

        String infoListOfFlightsForDestination = "Input destination for filter";
        String infoListOfFlightsForDayOfWeek = "Input day for filter";
        String infoListOfFlightsForDayOfWeekAfterSpecifyTimeDay = "Input day for filter";
        String infoListOfFlightsForDayOfWeekAfterSpecifyTimeTime = "Input time for filter";


        while (true) {

            choice = (int) getPositiveLongValue(infoChoice);

            switch (choice) {
                case 1:
                    String paramDestination = getStringValue(infoDestination);
                    int paramFlightNumber = (int) getPositiveLongValue(infoFlightNumber);
                    String paramType = getStringValue(infoType);
                    LocalTime paramTimeOfDeparture = getLocalTime(infoTimeOfDeparture);
                    int paramCountDaysOfWeek = (int) getPositiveLongValue(infoCountDaysOfWeek, 0, 7);
                    DayOfWeek[] paramDaysOfWeeks = getDaysOfWeek(infoDayOfWeek, paramCountDaysOfWeek);


                    airlineUtils.add(new Airline(paramDestination, paramFlightNumber, paramType,
                            paramTimeOfDeparture, paramDaysOfWeeks));

                    break;

                case 2:
                    System.out.println("All airlines:");
                    AirlineUtils.print(airlineUtils.getAirlines());

                    break;

                case 3:
                    AirlineUtils.print(airlineUtils.listOfFlightsForDestination(getStringValue(infoListOfFlightsForDestination)));
                    break;

                case 4:
                    AirlineUtils.print(airlineUtils.listOfFlightsForDayOfWeek(
                            DayOfWeek.of((int) getPositiveLongValue(infoListOfFlightsForDayOfWeek, 1, 7))));

                    break;
                case 5:

                    AirlineUtils.print(airlineUtils.listOfFlightsForDayOfWeekAfterSpecifyTime(
                            DayOfWeek.of((int) getPositiveLongValue(infoListOfFlightsForDayOfWeekAfterSpecifyTimeDay, 1, 7)),
                            getLocalTime(infoListOfFlightsForDayOfWeekAfterSpecifyTimeTime)));
                    break;

                default:

                    System.exit(0);
                    break;


            }
        }


    }


    private static long getPositiveLongValue(String message, long startLimit, long endLimitInclude) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);

        while (true) {
            long a;
            if (scanner.hasNextLong()) {
                a = scanner.nextLong();

                if (a >= startLimit && a <= endLimitInclude)
                    return a;
            } else if (scanner.hasNext()) {
                System.out.println("You have entered an invalid number, input real number");
                scanner.next();
            }
        }

    }

    private static long getPositiveLongValue(String message) {
        return getPositiveLongValue(message, 0, Long.MAX_VALUE);
    }

    private static String getStringValue(String message) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(message);

        while (true) {
            if (scanner.hasNext("\\D+")) {
                return scanner.next("\\D+");
            } else {
                System.out.println("You have entered an invalid string, input string only letters");
                scanner.next();
            }
        }
    }

    private static LocalTime getLocalTime(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message + " hour");

        int hour = -1, minute = -1;

        boolean flagHour = false;
        while (hour < 0 || hour > 23) {
            if (flagHour) {
                System.out.println("You have entered an invalid number, input 0 <= number < 24");

            }
            if (scanner.hasNextInt()) {
                hour = scanner.nextInt();
                flagHour = true;

            } else if (scanner.hasNext()) {
                System.out.println("You have entered an invalid number, input 0 <= number < 24");
                scanner.next();
            }

        }


        System.out.println(message + " minute");

        boolean flagMinute = false;
        while (minute < 0 || minute > 59) {
            if (flagMinute) {
                System.out.println("You have entered an invalid number, input 0 <= number < 60 ");
            }
            if (scanner.hasNextInt()) {
                minute = scanner.nextInt();
                flagMinute = true;

            } else if (scanner.hasNext()) {
                System.out.println("You have entered an invalid number, input 0 <= number < 60 ");
                scanner.next();
            }

        }
        return LocalTime.of(hour, minute);
    }

    private static DayOfWeek[] getDaysOfWeek(String message, int countDays) {

        DayOfWeek[] paramDaysOfWeek = new DayOfWeek[countDays];

        for (int i = 0; i < countDays; i++) {

            int p;
            while (true) {
                p = (int) getPositiveLongValue("" + message + " " + "Input 0 < number <= 7: " + (i + 1));

                if (p > 0 && p <= 7) {

                    if (DayOfWeekUtils.containsElement(paramDaysOfWeek, DayOfWeek.of(p))) {
                        message = "Input a unique days of the week";
                    } else {
                        break;
                    }
                }

            }

            paramDaysOfWeek[i] = DayOfWeek.of(p);

        }
        return paramDaysOfWeek;
    }

}
