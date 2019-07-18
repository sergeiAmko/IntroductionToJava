package module1BasicOfSoftwareCodeDevelopment.module2Algorithmization.oneDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int n = 0;
        int[] a;

        Scanner scanner = new Scanner(System.in);

        while (n <= 0) {
            n = getIntValue(scanner, "Input  the number of elements in the array");
        }
        a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = getIntValue(scanner, "Input the number 0");
        }

        System.out.println("array after remove- " + Arrays.toString(remove(a, min(a))));
    }

    private static int[] remove(int[] massive, double removable) {
        int[] output;
        int count = 0;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] == removable) {
                count++;
            }
        }

        if (count == 0) {
            return massive;
        }

        output = new int[massive.length - count];
        int iOutput = 0;

        for (int i = 0; i < massive.length; i++) {
            if (massive[i] != removable) {
                output[iOutput] = massive[i];
                iOutput++;
            }
        }
        System.out.println("massive- " + Arrays.toString(massive));
        System.out.println("output- " + Arrays.toString(output));

        return output;
    }

    private static int min(int[] massive) {
        int min = massive[0];
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] < min) {
                min = massive[i];
            }
        }
        return min;
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
