package module2Algorithmization.OneDimensionalArraysSort;

import static module2Algorithmization.Service.getArrayLong;


/**
 * Даны дроби p[1]/q[1], p[2]/q[2], ... p[n]/q[n] (p[i], q[i]. Составить программу,
 * которая приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания.
 */
public class Task8 {
    public static void main(String[] args) {
        long[] q, p;
        long[] pCommon;
        String s = "Input the  array ";

        p = getArrayLong(s + "p");
        q = getArrayLong(s + "q");


        pCommon = numeratorWithCommonDenominator(p, q);

        System.out.println("Max value= " + max(pCommon) + "/" + commonDenominator(q));


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

        for (long l : a) {
            if (l > max) {
                max = l;
            }
        }
        return max;
    }
}