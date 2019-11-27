package module4ProgrammingWithClasses;

import module4ProgrammingWithClasses.elementaryClassesAndObjects.task10.DayOfWeekUtils;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.Scanner;

import static module2Algorithmization.Service.getPositiveIntValue;

public class Service {

    /**
     * Запрашивает у пользователя целое число.
     */
    public static int getIntValue(String message) {
        System.out.println(message);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else if (scanner.hasNext()) {
                System.out.println("You have entered an invalid number, input real number");
                scanner.next();
            }
        }

    }

    /**
     * Запрашивает у пользователя целое длинное число.
     */
    public static long getLongValue(String message) {
        System.out.print(message+" ");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (scanner.hasNextLong()) {
                return scanner.nextLong();
            } else if (scanner.hasNext()) {
                System.out.println("You have entered an invalid number, input real number");
                scanner.next();
            }
        }

    }

    public static double getDoubleValue(String message) {
        System.out.println(message);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else if (scanner.hasNext()) {
                System.out.println("You have entered an invalid number, input real number");
                scanner.next();
            }
        }

    }

    public static String getString(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        while (true) {
            if (scanner.hasNextLine()) {
                return scanner.nextLine();
            }
        }
    }

    public static String getStringValue(String message) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.print(message + "  ");

            if (scanner.hasNext("\\w+")) {
                return scanner.next("\\w+");
            } else {
                System.err.println("You have entered an invalid string, input string only letters");
                scanner.nextLine();
            }
        }
    }

    public static String getStringValueWithoutNumbers(String message) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.print(message + "  ");

            if (scanner.hasNext("\\D+")) {
                return scanner.next("\\D+");
            } else {
                System.err.println("You have entered an invalid string, input string only letters");
                scanner.nextLine();
            }
        }
    }

    public static LocalTime getLocalTime(String message) {
        System.out.println(message);

        int hour, minute;

        do {

            hour = getPositiveIntValue("Input hour ");
        } while (hour < 0 || hour > 23);


        System.out.println(message + " minute");

        do {

            minute = getPositiveIntValue("Input minute ");
        } while (minute < 0 || minute > 59);
        return LocalTime.of(hour, minute);
    }

    public static DayOfWeek[] getDaysOfWeek(String message, int countDays) {

        DayOfWeek[] paramDaysOfWeek = new DayOfWeek[countDays];

        for (int i = 0; i < countDays; i++) {

            int p;
            while (true) {
                p = Service.getIntValue(message + " " + "Input 0 < number <= 7: ");

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
