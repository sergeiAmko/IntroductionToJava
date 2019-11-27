package module4ProgrammingWithClasses.elementaryClassesAndObjects.task10;

import java.time.DayOfWeek;
import java.time.LocalTime;

import static module2Algorithmization.Service.getPositiveIntValue;
import static module4ProgrammingWithClasses.Service.*;
import static module4ProgrammingWithClasses.elementaryClassesAndObjects.task10.AirlineUtils.print;


/**
 * Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы,
 * set- и get- методы и метод toString(). Создать второй класс, агрегирующий массив типа
 * Airline, с подходящими конструкторами и методами. Задать критерии выбора данных и вывести
 * эти данные на консоль.
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 * Найти и вывести:
 * a) список рейсов для заданного пункта назначения;
 * b) список рейсов для заданного дня недели;
 * c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */
public class Main {

    public static void main(String[] args) {

        int choice;

        AirlineUtils airlineUtils = new AirlineUtils();

        String infoChoice = "\nInput number:\n" +
                "1- create and add new airline\n" +
                "2- get all airlines\n" +
                "3- list of airlines by specified destination\n" +
                "4- list of airlines by specified day of week\n" +
                "5- list of airlines by specified day of week after specified time\n" +
                "other- exit";


        while (true) {

            choice = getPositiveIntValue(infoChoice);

            switch (choice) {
                case 1:
                    String paramDestination = getStringValue("Input destination of airline");
                    int paramFlightNumber = getPositiveIntValue("Input flight number of airline");
                    String paramType = getStringValue("Input type of airlines");
                    LocalTime paramTimeOfDeparture = getLocalTime("Input time of departure airlines");

                    int paramCountDaysOfWeek;

                    do {
                        paramCountDaysOfWeek = getPositiveIntValue("Input day for filter");

                    } while (paramCountDaysOfWeek <= 0 || paramCountDaysOfWeek >= 8);

                    DayOfWeek[] paramDaysOfWeeks = getDaysOfWeek("Input day of week airline", paramCountDaysOfWeek);


                    airlineUtils.add(new Airline(paramDestination, paramFlightNumber, paramType,
                            paramTimeOfDeparture, paramDaysOfWeeks));

                    break;

                case 2:
                    System.out.println("All airlines:");
                    print(airlineUtils.getAirlines());

                    break;

                case 3:
                    print(airlineUtils.listOfFlightsForDestination(getStringValueWithoutNumbers("Input destination for filter")));
                    break;

                case 4:

                    int p;

                    do {
                        p = getPositiveIntValue("Input day for filter");
                    } while (p <= 0 || p >= 8);

                    print(airlineUtils.listOfFlightsForDayOfWeek(
                            DayOfWeek.of(p)));

                    break;
                case 5:

                    int n;

                    do {
                        n = getPositiveIntValue("Input day for filter");
                    } while (n <= 0 || n >= 8);

                    print(airlineUtils.listOfFlightsForDayOfWeekAfterSpecifyTime(
                            DayOfWeek.of(n),
                            getLocalTime("Input time for filter")));
                    break;

                default:

                    System.exit(0);
                    break;


            }
        }


    }


}
