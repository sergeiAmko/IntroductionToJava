package module1BasicOfSoftwareCodeDevelopment.module2Algorithmization.oneDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        int n = 0;
        double sum = 0;
        double[] a;
        boolean isSimple = true;

        Scanner scanner = new Scanner(System.in);

        while (n <= 0) {
            n = getIntValue(scanner, "Input the number of elements in the array ");
        }
        a = new double[n];

        for (int i = 0; i < n; i++) {
            a[i] = getDoubleValue(scanner, "Input the number 0");
        }

        System.out.print("new massive");
        for (int i = 0; i < n; i++) {
            if (i == 1) {
                sum += a[i];
            }else if (i == 2) {
                sum += a[i];
            }else if (i == 0) {

            } else {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isSimple = false;
                    }
                }
                if (isSimple) {
                    sum += a[i];
                }
                isSimple = true;


            }
        }


        System.out.println("Array input- " + Arrays.toString(a));
        System.out.println("sum= " + sum);
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
