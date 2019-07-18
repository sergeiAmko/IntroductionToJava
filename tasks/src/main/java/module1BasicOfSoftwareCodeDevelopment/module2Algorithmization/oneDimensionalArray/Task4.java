package module1BasicOfSoftwareCodeDevelopment.module2Algorithmization.oneDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        int n = 0, maxIndex=0, minIndex=0;
        double max, min;
        double[] a, input;
        Scanner scanner = new Scanner(System.in);

        while (n <= 0) {
            n = getIntValue(scanner, "Input the number of elements in the array ");
        }
        a = new double[n];
        input = new double[n];

        for (int i = 0; i < n; i++) {
            a[i] = getDoubleValue(scanner, "Input the number 0");
            input[i] = a[i];
        }

        max = a[0];
        min = a[0];

        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
                maxIndex=i;
            } else if (a[i] < min) {
                min = a[i];
                minIndex=i;
            }
        }

        a[maxIndex]=min;
        a[minIndex]=max;

        System.out.println("Array input- " + Arrays.toString(input));
        System.out.println("min= " + min);
        System.out.println("max= " + max);
        System.out.println("Array output- " + Arrays.toString(a));
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
