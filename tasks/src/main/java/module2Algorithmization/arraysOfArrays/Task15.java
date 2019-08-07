package module2Algorithmization.arraysOfArrays;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        int[][] a;
        String s = "Input array's size n-even   number";

        a = getSquareArray(s);

        printArray(replaceAllOddElements(a, max(a)));


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

    private static int[][] getSquareArray(String s) {
        int n = 0;
        int[][] a;

        Scanner scanner = new Scanner(System.in);

        while (n <= 0) {
            n = getIntValue(scanner, s);
        }
        a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = getIntValue(scanner, "Input the number " + i + "*" + j);
            }
        }
        return a;
    }

    private static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(String.format("%3d ", a[i][j]) + " ");
            }
            System.out.println();
        }
    }

    private static int max(int[][] a) {
        int maxValue = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] > maxValue) {
                    maxValue = a[i][j];
                }
            }
        }
        return maxValue;
    }

    private static int[][] replaceAllOddElements(int[][] a, int max) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] % 2 != 0) {
                    a[i][j] = max;
                }
            }
        }
        return a;
    }
}
