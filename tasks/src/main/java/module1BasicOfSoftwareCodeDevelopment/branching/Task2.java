package module1BasicOfSoftwareCodeDevelopment.branching;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int a, b, c, d;

        Scanner scanner = new Scanner(System.in);

        a = getIntValue(scanner, "Input real number a");
        b = getIntValue(scanner, "Input real number b");
        c = getIntValue(scanner, "Input real number c");
        d = getIntValue(scanner, "Input real number d");

        System.out.println("max{min(a,b),min(c,d)}= " +max(min(a,b),min(c,d)));
    }

    private static int max(int a, int b) {
        return a >= b ? a : b;
    }

    private static int min(int a, int b) {
        return a <= b ? a : b;
    }

    private static int getIntValue(Scanner scanner, String message) {
        System.out.println(message);
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else if (scanner.hasNext()) {
                System.out.println("You have entered an invalid number, input real number");
                scanner.next();
            }
        }

    }
}
