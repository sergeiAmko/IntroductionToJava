package module5BasicOfOOP;

import java.util.Scanner;

public class Service {

    public static int getIntValue(String message) {
        return getIntValue(message, false, Integer.MIN_VALUE, Integer.MAX_VALUE);

    }

    public static int getIntValue(String message, int startLimit, int endLimitInclude) {
        return getIntValue(message, true, startLimit, endLimitInclude);

    }

    public static int getIntValue(String message, boolean isInclude, int startLimit, int endLimitInclude) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (isInclude) {
                System.out.println(startLimit + " >= " + message + " <= " + endLimitInclude);

            } else {
                System.out.println(" " + message + " ");
            }
            int a;
            if (scanner.hasNextInt()) {
                a = scanner.nextInt();
                if (a >= startLimit && a <= endLimitInclude) {
                    return a;
                }
            } else if (scanner.hasNext()) {
                System.out.println("You have entered an invalid number, input real number");
                scanner.next();
            }
        }

    }

    public static String getStringValue(String message) {
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

    public static String getStringLine(String message) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(message);

        while (true) {
            if (scanner.hasNextLine()) {
                return scanner.nextLine();
            } else {
                System.out.println("You have entered an invalid string, input string only letters");
                scanner.next();
            }
        }
    }

    public static boolean getBoolean(String message) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(message);

            boolean a;

            if (scanner.hasNextBoolean()) {
                return scanner.nextBoolean();

            } else if (scanner.hasNext()) {
                System.out.println("You have entered an invalid value, input boolean value");
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

    public static double getDoublePositiveValue(String message) {
        System.out.println(message);

        Scanner scanner = new Scanner(System.in);
        double t=-1;
        while (true) {
            if (scanner.hasNextDouble()) {
                t = scanner.nextDouble();
            } else if (scanner.hasNext()) {
                System.out.println("You have entered an invalid number, input real number");
                scanner.next();
            }
            if (t > 0) {
                return t;
            }
        }

    }

    public static int getPositiveIntValue(String message) {

        int t;
        System.out.print(message + ": ");
        while (true) {
            t = getIntValue("input positive integer number");

            if (t > 0) {
                return t;
            }
        }

    }

}
