package module2Algorithmization.decompositionUsingMethods;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        long[] p;
        String s = "Input the number of elements in the  array n ";

        p = getArray(s);

        System.out.println(gcdFromArray(p));



    }

    private static long[] getArray(String s) {
        long[] a;
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        while (n <= 0) {
            n = getIntValue(scanner, s);
        }

        a = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = getIntValue(scanner, "Input a[" + i + "]");
        }
        return a;
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

    private static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    private static long gcdFromArray(long[] q) {
        long r = q[0];
        for (int i = 1; i < q.length; i++) {
            r = gcd(r, q[i]);
        }
        return r;
    }
}
