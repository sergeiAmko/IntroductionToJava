package module1BasicOfSoftwareCodeDevelopment.module2Algorithmization.oneDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int n = 0;
        double sum = 0;
        double[] a;
        boolean isSimple = true;

        Scanner scanner = new Scanner(System.in);

        while (n <= 0) {
            n = getIntValue(scanner, "Input the number of elements in the array");
        }
        a = new double[n];

        for (int i = 0; i < n; i++) {
            a[i] = getDoubleValue(scanner, "Input the number 0");
        }

        System.out.println(max(a));


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

    private static double max(double[] a) {
        double max = a[0] + a[a.length - 1];
        int aSize = a.length;
        double[] mass = new double[a.length % 2 == 0 ? a.length / 2 : a.length / 2 + 1];
        for (int i = 0; i < (aSize % 2==0 ? aSize / 2 : aSize / 2 + 1); i++) {
            if (i == aSize - 1 - i) {
                mass[i] = a[i];
            } else {
                mass[i] = a[i] + a[aSize - 1 - i];
            }
        }
        System.out.println("massive a= " + Arrays.toString(a));
        System.out.println("massive mass= " + Arrays.toString(mass));

        for (double t : mass) {
            if (t > max) {
                max = t;
            }
        }
        return max;
    }
}
