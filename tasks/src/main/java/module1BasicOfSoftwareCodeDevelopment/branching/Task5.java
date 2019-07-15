package module1BasicOfSoftwareCodeDevelopment.branching;

import java.util.Scanner;

import static java.lang.Math.*;

public class Task5 {
    public static void main(String[] args) {
        int x;
        double f;
        Scanner scanner = new Scanner(System.in);

        x = getIntValue(scanner, "Input real number x");

        if (x <= 3) {
            f = pow(x, 2) - 3 * x + 9;
        } else {
            f = 1 / (pow(x, 3) + 6);
        }

        System.out.println("f= " + f);
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
