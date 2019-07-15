package module1BasicOfSoftwareCodeDevelopment.linearPrograms;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        int a, b, c;
        double z;
        boolean isSet = false;

        Scanner scanner = new Scanner(System.in);

        a = getIntValue(scanner, "Input real number a");
        b = getIntValue(scanner, "Input real number b");
        c = getIntValue(scanner, "Input real number c");

        z = ((a - 3) * (double) b / 2) + c;
        System.out.println("the expression is: " + z);


    }

    private static int getIntValue(Scanner scanner, String message) {
        System.out.println(message);
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            }else if (scanner.hasNext()) {
                System.out.println("You have entered an invalid number, input real number");
                scanner.next();
            }
        }

    }
}
