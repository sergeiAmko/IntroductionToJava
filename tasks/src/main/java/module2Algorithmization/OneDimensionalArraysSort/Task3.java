package module2Algorithmization.OneDimensionalArraysSort;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int[] a;

        a = getIncreasingArray("Input the number of elements in the  array a ");


        System.out.println(Arrays.toString(sortBySelection(a)));

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

    private static int[] getIncreasingArray(String s) {
        int n = 0;
        int[] a;

        Scanner scanner = new Scanner(System.in);

        while (n <= 0) {
            n = getIntValue(scanner, s);
        }
        a = new int[n];

        for (int i = 0; i < n; i++) {
            String t = s, s1 = "Input the number more than previous-  ";
            boolean isMore = false;
            if (i == 0) {
                a[i] = getIntValue(scanner, "Input a[" + i + "] ");
            } else {
                while (!isMore) {
                    a[i] = getIntValue(scanner, t + a[i - 1]);
                    if (a[i] >= a[i - 1]) {
                        isMore = true;
                    }
                    t = s1;
                }
            }
        }
        return a;
    }

    private static int[] sortBySelection(int a[]) {

        for (int i = 0; i < a.length; i++) {
            int maxIndex = maxStartingAtNIndex(a, i);
            if (a[i] < a[maxIndex]) {
                int r = a[i];
                a[i] = a[maxIndex];
                a[maxIndex] = r;
            }

        }
        return a;
    }

    private static int maxStartingAtNIndex(int[] a, int start) {
        int maxValue = a[start];
        int maxIndex = start;

        if (a.length - 1 == start) {
            return start;
        }
        for (int i = start + 1; i < a.length; i++) {
            if (a[i] > maxValue) {
                maxValue = a[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
