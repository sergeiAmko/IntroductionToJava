package module2Algorithmization.decompositionUsingMethods;

import static module2Algorithmization.Service.getIntValue;


/**
 * Написать метод (методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */
public class Task2 {

    public static void main(String[] args) {
        int n = 4;
        long[] p = new long[n];

        for (int i = 0; i < n; i++) {
            p[i] = getIntValue("Input number");
        }

        System.out.println(gcdFromArray(p));


    }


    private static long nod(long a, long b) {
        return b == 0 ? a : nod(b, a % b);
    }

    private static long gcdFromArray(long[] q) {
        long r = q[0];
        for (int i = 1; i < q.length; i++) {
            r = nod(r, q[i]);
        }
        return r;
    }
}
