package module2Algorithmization.OneDimensionalArraysSort;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[] a, b;

        a = getIncreasingArray("Input the number of elements in the  array a ");
        b = getIncreasingArray("Input the number of elements in the  array b ");

        System.out.println(Arrays.toString(mergeTwoArraysAscendingOrder(a, b)));

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
            String t = s, s1 = "Input the number more than previous- ";
            boolean isMore = false;
            if (i == 0) {
                a[i] = getIntValue(scanner, "Input a[" + i + "]");
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

    private static int[] mergeTwoArraysAscendingOrder(int a[], int[] b) {
        int[] r = new int[a.length + b.length];

        for (int i = 0, p = 0, k = 0; i < r.length; i++) {

            if (p < a.length && k < b.length && a[p] < b[k]) {
                r[i] = a[p];
                if (p - 1 < a.length) {
                    p++;
                }
            } else if (p < a.length && k < b.length && a[p] == b[k]) {
                r[i] = a[p];
                i++;
                r[i] = b[k];
                p++;
                k++;
            } else {
                r[i] = b[k];
                k++;
            }
        }
        return r;
    }
}
