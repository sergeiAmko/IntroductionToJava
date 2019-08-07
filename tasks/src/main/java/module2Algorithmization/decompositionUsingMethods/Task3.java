package module2Algorithmization.decompositionUsingMethods;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        double n = 0;
        double area;
        String s = "Input length hexagon >0";

        Scanner scanner = new Scanner(System.in);

        while (n <= 0) {
            n = getIntValue(scanner, s);
        }

        area = areaOfEquilateralTriangle(n) * 6;

        System.out.println("Area hexagon with sides " + n + "= " + String.format("%.3f",area));

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

    private static double areaOfEquilateralTriangle(double a) {
        return a * a * 3 * Math.sqrt(3) / 2;
    }
}
