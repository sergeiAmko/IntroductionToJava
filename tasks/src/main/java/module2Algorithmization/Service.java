package module2Algorithmization;

import java.util.Scanner;

public class Service {

    /**
     * Запрашивает у пользователя целое число.
     */
    public static int getIntValue(String message) {
        System.out.println(message);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else if (scanner.hasNext()) {
                System.out.println("You have entered an invalid number, input real number");
                scanner.next();
            }
        }

    }

    public static int getPositiveIntValue(String message) {

        int t;
        System.out.print(message + ": ");
        while (true) {
            t = getIntValue("input positive integer number");

            if (t > 0) {
                return t;
            }
        }

    }

    /**
     * Запрашивает у пользователя целое длинное число.
     */
    public static long getLongValue(String message) {
        System.out.println(message);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (scanner.hasNextLong()) {
                return scanner.nextLong();
            } else if (scanner.hasNext()) {
                System.out.println("You have entered an invalid number, input real number");
                scanner.next();
            }
        }

    }

    /**
     * Запрашивает у пользователя число.
     */
    public static double getDoubleValue(String message) {
        System.out.println(message);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else if (scanner.hasNext()) {
                System.out.println("You have entered an invalid number, input real number");
                scanner.next();
            }
        }

    }

    public static int[] getArrayInt(String s) {
        int n;
        int[] a;

        System.out.println(s);

        n = getPositiveIntValue("Input size the array");

        a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = getIntValue("Input the number " + i);
        }
        return a;
    }

    public static long[] getArrayLong(String s) {
        int n;
        long[] a;

        System.out.println(s);

        n = getPositiveIntValue("Input the number of elements in the array");

        a = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = getLongValue("Input the long number " + i);
        }
        return a;
    }

    public static double[] getArrayDouble(String s) {
        int n;
        double[] a;

        System.out.println(s);

        n = getPositiveIntValue("Input the number of elements in the array");

        a = new double[n];

        for (int i = 0; i < n; i++) {
            a[i] = getDoubleValue("Input double number " + i);
        }
        return a;
    }

    public static int[][] getDoubleArrayOfInt(String s) {
        int m, n;
        int[][] a;

        System.out.println(s);

        m = getPositiveIntValue("Input size m of array");
        n = getPositiveIntValue("Input size n of array");

        a = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = getIntValue("Input the number " + i + "*" + j);
            }
        }
        return a;
    }


    public static int[][] getDoubleArrayOfPositiveInt(String s) {
        int m, n;
        int[][] a;

        System.out.println(s);

        m = getPositiveIntValue("Input size m of array");
        n = getPositiveIntValue("Input size n of array");

        a = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = getPositiveIntValue("Input the number " + i + "*" + j);
            }
        }
        return a;
    }


    public static int[][] getDoubleSquareArray(String s) {
        int n;
        int[][] a;

        n = getPositiveIntValue("Input size n array");

        a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = getIntValue("Input the number " + i + "*" + j);
            }
        }
        return a;
    }

    public static int[] getIncreasingArrayOfInt(String s) {
        int[] a;

        a = new int[getPositiveIntValue(s)];

        System.out.println(s);
        for (int i = 0; i < a.length; i++) {
            String t = "Input", s1 = "Input the number more than previous- ";
            boolean isMore = false;
            if (i == 0) {
                a[i] = getIntValue("Input [" + i + "]");
            } else {
                while (!isMore) {
                    a[i] = getIntValue("Input [" + i + "]");
                    if (a[i] >= a[i - 1]) {
                        isMore = true;
                    }
                    t = s1;
                }
            }
        }
        return a;
    }

    public static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(String.format("%3d ", a[i][j]) + " ");
            }
            System.out.println();
        }
    }

    public static int[] getDigitsOfNumber(int n) {
        int count = countDigits(n);
        int[] digits;
        int i = count - 1;

        digits = new int[count];
        for (int j = 0; j < count; j++) {
            {
                digits[i] = n % 10;
                n /= 10;
                i--;
            }

        }
        return digits;
    }

    public static int countDigits(int n) {
        int count = 0;

        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;

    }
}
