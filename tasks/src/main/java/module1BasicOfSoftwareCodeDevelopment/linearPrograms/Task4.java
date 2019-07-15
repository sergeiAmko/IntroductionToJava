package module1BasicOfSoftwareCodeDevelopment.linearPrograms;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        double r, newNumber;
        int integerPart;
        Scanner scanner = new Scanner(System.in);
        r = getDoubleValue(scanner, "Input number formats nnn.ddd");

        integerPart = (int) Math.round(((r - (int) r) * 1000));
        newNumber = integerPart + (double) ((int) r / 1000);

        System.out.println(newNumber);
    }

    private static double getDoubleValue(Scanner scanner, String message) {
        System.out.println(message);
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
