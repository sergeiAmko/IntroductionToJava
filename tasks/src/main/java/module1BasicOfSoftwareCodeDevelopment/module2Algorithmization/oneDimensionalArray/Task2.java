package module1BasicOfSoftwareCodeDevelopment.module2Algorithmization.oneDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        int n = 0, z, count = 0;
        double[] a,input;
        Scanner scanner = new Scanner(System.in);

        while (n <= 0) {
            n = getIntValue(scanner, "Input the number of elements in the array ");
        }
        a = new double[n];
        input = new double[n];

        for (int i = 0; i < n; i++) {
            a[i] = getDoubleValue(scanner, "Input the number ");
        }

        System.out.println("_________________________________________________________");
        z = getIntValue(scanner, "Input z");


        for (int i = 0; i < n; i++) {
            input[i]=a[i];
            if (a[i] > z ) {
                a[i]=z;
                count++;
            }
        }

        System.out.println("Array input- "+Arrays.toString(input));
        System.out.println("count numbers > z= " + count);
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
