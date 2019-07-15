package module1BasicOfSoftwareCodeDevelopment.branching;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int alfa = 0, beta = 0, gamma;
        int maxDegree = 180;
        int rightAngle = 90;
        boolean isRightTriangle = false;

        Scanner scanner = new Scanner(System.in);

        while (alfa <= 0) {
            alfa = getIntValue(scanner, "Input real number >0 angle alfa");
        }
        while (beta <= 0) {
            beta = getIntValue(scanner, "Input real number >0 angle beta");
        }

        if (alfa > 0 && beta > 0) {
            if (alfa + beta >= maxDegree) {
                System.out.println("Triangle isn't exists with such angles:\n" +
                        "alfa= " + alfa + "\n" +
                        "beta= " + beta);
            } else {
                gamma = maxDegree - alfa - beta;

                if (alfa == rightAngle || beta == rightAngle || gamma == rightAngle) {
                    isRightTriangle = true;
                }

                System.out.println("The triangle is " + (isRightTriangle ? " right " : " not right") + " triangle with such angles:\n" +
                        "alfe= " + alfa + "\n" +
                        "beta= " + beta + "\n" +
                        "gamma= " + gamma);
            }
        } else {
            System.out.println("The degrees can't be negative");
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
