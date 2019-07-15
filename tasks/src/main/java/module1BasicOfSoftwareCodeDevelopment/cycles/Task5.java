package module1BasicOfSoftwareCodeDevelopment.cycles;

import java.util.Scanner;

import static java.lang.Math.*;

public class Task5 {
    public static void main(String[] args) {
        int n;
        double e, a, sum = 0;
        Scanner scanner = new Scanner(System.in);


        n = getIntValue(scanner, "Input real number n");
        e = getDoubleValue(scanner, "Input number e");

        for (int i = 0; i <= n; i++) {
            a = 1 / pow(2, i) + 1 / pow(3, i);

            if (abs(a) >= e) {
                sum += a;
            }
        }

        System.out.println("sum= " + sum);

    }

    private static double getDoubleValue(Scanner scanner, String message) {
        System.out.println(message);
        while (true) {
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else if (scanner.hasNext()) {
                System.out.println(
                        "You have entered an invalid number, input real number");
                scanner.next();
            }
        }

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
