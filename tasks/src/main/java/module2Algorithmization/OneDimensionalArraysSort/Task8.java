package module2Algorithmization.OneDimensionalArraysSort;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        long[] q, p;
        long[] pCommon;
        int n = 0;
        String s = "Input the number of elements in the  array n ";

        Scanner scanner = new Scanner(System.in);
        while (n <= 0) {
            n = getIntValue(scanner, s);
        }
        p = getArray(scanner, n);
        q = getArray(scanner, n);


        pCommon = numeratorWithCommonDenominator(p, q);

        System.out.println("Max value= " + max(pCommon) + "/" + commonDenominator(q));


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

    private static long[] getArray(Scanner scanner, int n) {
        long[] a;


        a = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = getIntValue(scanner, "Input a[" + i + "]");
        }
        return a;
    }

    private static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    private static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }

    private static long commonDenominator(long[] q) {
        long r = q[0];
        for (int i = 1; i < q.length; i++) {
            r = lcm(r, q[i]);
        }
        return r;
    }

    private static long[] numeratorWithCommonDenominator(long[] p, long[] q) {
        long[] pCommon;
        long commonDenominator = commonDenominator(q);

        pCommon = new long[p.length];

        for (int i = 0; i < p.length; i++) {
            pCommon[i] = commonDenominator / q[i] * p[i];
        }
        return pCommon;
    }

    private static long max(long[] a) {
        long max = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
}