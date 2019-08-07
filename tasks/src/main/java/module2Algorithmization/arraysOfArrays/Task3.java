package module2Algorithmization.arraysOfArrays;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        int[][] a = getArray("Input the number m*n");


        printColumn(a,3);
        printRow(a,4);

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

    private static int[][] getArray(String s) {
        int m = 0, n = 0;
        int[][] a;

        Scanner scanner = new Scanner(System.in);

        while (m <= 0) {
            m = getIntValue(scanner, s);
        }

        while (n <= 0) {
            n = getIntValue(scanner, s);
        }
        a = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = getIntValue(scanner, "Input the number " + i + "*" + j);
            }
        }
        return a;
    }

    private static void printRow(int[][] ints, int k) {
        for (int j = 0; j < ints[0].length; j++) {
            System.out.print(ints[k-1][j] + " ");
        }
        System.out.println();
    }

    private static void printColumn(int[][] ints, int p) {
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i][p-1] + " ");
        }
    }


}
