package module2Algorithmization.decompositionUsingMethods;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        int a, b;
        String sA = "Input the A ";
        String sB = "Input the B ";

        Scanner scanner = new Scanner(System.in);

        a = getIntValue(scanner, sA);
        b = getIntValue(scanner, sB);

        System.out.println("НОД " + a + " и " + b + "= " + gcd(a, b));
        System.out.println("НОК " + a + " и " + b + "= " + lcm(a, b));


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

    private static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    private static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }
}
