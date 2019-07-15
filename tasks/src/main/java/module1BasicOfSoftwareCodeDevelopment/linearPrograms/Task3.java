package module1BasicOfSoftwareCodeDevelopment.linearPrograms;

import java.util.Scanner;

import static java.lang.Math.*;

public class Task3 {

    public static void main(String[] args) {
        double x, y;
        double delta = 1e-10;

        Scanner scanner = new Scanner(System.in);
        x = getDoubleValue(scanner, "Input real number x in degrees");
        y = getDoubleValue(scanner, "Input real number y in degrees");

        if (cos(toRadians(x)) - sin(toRadians(y)) >= delta && x * y != 90) {
            System.out.println(((sin(toRadians(x)) + cos(toRadians(y))) / (cos(toRadians(x)) - sin(toRadians(y)))) * tan(toRadians(x * y)));
        } else {
            System.out.println("You have inputed uncorrectly numers x and y  ");

        }


//        System.out.println(((sin(toRadians(x)) + cos(toRadians(y))) / (cos(toRadians(x)) - sin(toRadians(y)))) * tan(toRadians(x * y)));


    }

    private static double getDoubleValue(Scanner scanner, String message) {
        System.out.println(message);
        while (true) {
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else if (scanner.hasNext()) {
                System.out.println("Н" +
                        "You have entered an invalid number, input real number");
                scanner.next();
            }
        }

    }
}
