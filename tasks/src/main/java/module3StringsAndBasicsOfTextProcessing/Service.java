package module3StringsAndBasicsOfTextProcessing;

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

    public static String[] getArrayString(String message) {
        int n = 0;
        String[] a;
        String s = "Input the number of element in array string";

        while (n <= 0) {
            n = getIntValue(s);
        }
        a = new String[n];

        for (int i = 0; i < n; i++) {
            a[i] = getString(message);
        }
        return a;
    }

    public static String getChar(String message) {
        String s = "ss";
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        while (s.length() != 1) {
            if (scanner.hasNextLine()) {
                s = scanner.nextLine();
            }
            if (s.length() != 1) {
                System.out.println("Input one char");
            }
        }
        return s;
    }
}
