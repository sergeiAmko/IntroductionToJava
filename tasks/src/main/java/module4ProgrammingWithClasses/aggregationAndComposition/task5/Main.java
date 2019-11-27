package module4ProgrammingWithClasses.aggregationAndComposition.task5;

import java.util.List;

import static module4ProgrammingWithClasses.Service.getIntValue;


/**
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической
 * путевки различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального
 * выбора. Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и
 * сортировку путевок.
 */
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

        StringBuffer request = new StringBuffer("You choice ");

        newTours = tours.getCopyTours();

        while (true) {

            choice = getIntValue(infoMenu);
            switch (choice) {
                case 1:
                    Type type = getType();

                    newTours = Tours.getToursByType(newTours, type);

                    System.out.println(request.append(type).append(" "));


                    break;

                case 2:
                    Transport transport = getTransport();

                    newTours = Tours.getToursByTransport(newTours, transport);

                    System.out.println(request.append(transport).append(" "));
                    System.out.println(newTours);

                    break;

                case 3:

                    Food food = getFood();
                    newTours = Tours.getToursByFoods(newTours, food);

                    System.err.println(request.append(food).append(" "));
                    break;

                case 4:

                    int start = getIntValue("Input start count of days");
                    int endInclude = getIntValue("Input end count of days include");

                    newTours = tours.getToursByCountDays(newTours, start, endInclude);

                    System.err.println(request.append(start).append("-").append(endInclude));

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


    private static Type getType() {

        int choice, number = 1;
        System.out.println("Choice the type of tour");


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

    private static Transport getTransport() {

        int choice;
        System.out.println("Choice the transport of tour");


        int number = 1;
        for (Transport type : Transport.values()) {

            System.out.println("    " + number++ + "- " + type);

        }

        choice = getIntValue("");

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

    private static Food getFood() {

        int choice, number = 1;
        System.out.println("Choice the food of tour");


        for (Food food : Food.values()) {

            System.out.println("    " + number++ + "- " + food);

        }

        choice = getIntValue("");

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
