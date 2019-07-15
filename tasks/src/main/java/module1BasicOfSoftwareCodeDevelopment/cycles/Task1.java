package module1BasicOfSoftwareCodeDevelopment.cycles;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner scanner = new Scanner(System.in);

        n = getIntValue(scanner, "Input real number");

        for (int i = 0; i <= n; i++) {
            sum += i;
        }

        System.out.println("n= " + n + "\n" +
                "sum= " + sum);

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
