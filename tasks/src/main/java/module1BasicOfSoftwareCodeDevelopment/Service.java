package module1BasicOfSoftwareCodeDevelopment;

import java.util.Scanner;

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
        System.out.println(message);

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

    /**
     * Запрашивает у пользователя число.
     */
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

}
