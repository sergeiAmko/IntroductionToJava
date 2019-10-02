package module4ProgrammingWithClasses.aggregationAndComposition.task5;

import module4ProgrammingWithClasses.aggregationAndComposition.task2.CarType;
import module4ProgrammingWithClasses.aggregationAndComposition.task2.Wheel;

import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int choice;

        Tours tours = new Tours();
        List<Tour> newTours;


        String infoMenu = "\nInput the number:\n" +
                "1-choice the type\n" +
                "2-choice the transport\n" +
                "3-choice the food\n" +
                "4-input the number of count days\n" +
                "5-sort the tours\n" +
                "6-get all the tours\n" +
                "other- exit";

        StringBuffer request = new StringBuffer();


        while (true) {

            choice = getIntValue(infoMenu);
            newTours = tours.getCopyTours();
            switch (choice) {
                case 1:
                    Type type = getType("Choice the type of tour");

                    newTours = tours.getToursByType(newTours, type);

                    System.out.println(request.append(type + " "));
//                    System.out.println(newTours);


                    break;

                case 2:
                    Transport transport = getTransport("Choice the transport of tour");

                    newTours = tours.getToursByTransport(newTours, transport);

                    System.out.println(request.append(transport + " "));
                    System.out.println(newTours);

                    break;

                case 3:

                    Food food = getFood("Choice the food of tour");
                    newTours = tours.getToursByFoods(newTours, food);

                    System.out.println(request.append(food + " "));
//                    System.out.println(newTours);
                    break;

                case 4:

                    int start = getIntValue("Input start count of days");
                    int endInclude = getIntValue("Input end count of days include");

                    newTours = tours.getToursByCountDays(newTours, start, endInclude);

                    System.err.println(request.append(start + "-" + endInclude));
//                    System.out.println(newTours);

                    break;
                case 5:

                    String s = "\nInput the number:\n" +
                            "1-sort by ID\n" +
                            "2-sort by name\n" +
                            "other-sort by price\n";
                    tours.sort(getIntValue(s));

                    System.out.println("Sorted");

                    break;

                case 6:
                    System.out.println(newTours);
                    break;
                default:

                    System.exit(0);
                    break;


            }
        }


    }

    private static int getIntValue(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);

        while (true) {
            int a;
            if (scanner.hasNextInt()) {
                a = scanner.nextInt();
                return a;
            } else if (scanner.hasNext()) {
                System.out.println("You have entered an invalid number, input real number");
                scanner.next();
            }
        }

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

    private static Type getType(String message) {

        int choice, number = 1;
        System.out.println(message);


        for (Type type : Type.values()) {

            System.out.println("    " + number++ + "- " + type);

        }

        choice = getIntValue("");

        switch (choice) {
            case 1:
                return Type.REST;
            case 2:
                return Type.EXCURSIONS;
            case 3:
                return Type.TREATMENT;
            case 4:
                return Type.SHOPPING;
            case 5:
                return Type.CRUISE;
            default:
                return Type.OTHER;
        }


    }

    private static Transport getTransport(String message) {

        int choice, number = 1;
        System.out.println(message);


        for (Transport type : Transport.values()) {

            System.out.println("    " + number++ + "- " + type);

        }

        choice = (int) getIntValue("");

        switch (choice) {
            case 1:
                return Transport.PLANE;
            case 2:
                return Transport.TRAIN;
            case 3:
                return Transport.BUS;
            default:
                return Transport.SHIP;
        }


    }

    private static Food getFood(String message) {

        int choice, number = 1;
        System.out.println(message);


        for (Food food : Food.values()) {

            System.out.println("    " + number++ + "- " + food);

        }

        choice = (int) getIntValue("");

        switch (choice) {
            case 1:
                return Food.WITHOUT_MEALS;
            case 2:
                return Food.BREAKFAST;
            case 3:
                return Food.BREAKFAST_DINNER;
            case 4:
                return Food.BREAKFAST_LUNCH_DINNER;
            default:
                return Food.ALL_INCLUSIVE;
        }


    }

}
