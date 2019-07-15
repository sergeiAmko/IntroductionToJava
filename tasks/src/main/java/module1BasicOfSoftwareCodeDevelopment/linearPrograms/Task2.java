package module1BasicOfSoftwareCodeDevelopment.linearPrograms;

import java.util.Scanner;

import static java.lang.Math.*;

public class Task2 {
    public static void main(String[] args) {

        double a, b, c, z;
        Scanner scanner = new Scanner(System.in);


        a = getDoubleValue(scanner, "Input real number a");
        b = getDoubleValue(scanner, "Input real number b");
        c = getDoubleValue(scanner, "Input real number c");

        z = (b + sqrt(pow(b, 2) + 4 * a * c)) / (2 * a) - pow(a, 3) * c + pow(b, -2);

        System.out.println("the expression is: " + z);


    }

    private static double getDoubleValue(Scanner scanner, String message) {
        System.out.println(message);
        while (true) {
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            }else if (scanner.hasNext()) {
                System.out.println("You have entered an invalid number, input real number");
                scanner.next();
            }
        }

    }
}


