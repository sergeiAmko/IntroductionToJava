package module2Algorithmization.decompositionUsingMethods;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int[] a;
        String s = "Input the number elements of array";

        a = getArray(s);

        for (int i = 0; i < a.length; i = i + 2) {
            System.out.println("sum from D[" + i + "] to D[" + (i + 2) + "]= " + summNumbersOfArrayFromStartToEnd(a, i, i + 3));

        }

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

    private static int[] getArray(String s) {
        int n = 0;
        int[] a;

        Scanner scanner = new Scanner(System.in);

        while (n <= 0) {
            n = getIntValue(scanner, s);
        }
        a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = getIntValue(scanner, "Input the number " + i);
        }
        return a;
    }

    private static int summNumbersOfArrayFromStartToEnd(int[] a, int start, int end) {
        int sum = 0;
        if (end > a.length) {
            end = a.length;
        }
        System.out.print("Values from D[" + start + "] to D[" + end + "]= [");
        for (int i = start; i < end; i++) {
            sum += a[i];
            System.out.print(a[i] + ", ");
        }
        System.out.print("]\n");

        return sum;
    }
}
