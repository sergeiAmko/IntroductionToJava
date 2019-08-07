package module2Algorithmization.arraysOfArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[][] a = getArray("Input the number m*n");

        int columnCount = a[0].length;
        int rowCount = a.length;
        int[][] neww = new int[rowCount][columnCount];
        int count = 0;

        for (int j = 0; j < columnCount; j++) {
            if (j % 2 == 0) {
                if (a[0][j] > a[rowCount - 1][j]) {
                    for (int k = 0; k < columnCount; k++) {
                        neww[k][count] = a[k][j];
                    }
                    count++;
                }
            }
        }

        int[][] finish = new int[neww.length][count];

        for (int i = 0; i < neww.length; i++) {
            for (int j = 0; j < count; j++) {
                finish[i][j] = neww[i][j];
            }
        }

        for (int i = 0; i < finish.length; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print(finish[i][j] + " ");
            }
            System.out.println();
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

//    int[][] a = {
//            {1, 2, 8, 4, 5, 8},
//            {6, 7, 8, 9, 2, 3},
//            {3, 4, 6, 8, 9, 2},
//            {4, 2, 1, 0, 5, 1},
//            {8, 1, 4, 5, 7, 2},
//            {7, 1, 6, 5, 6, 3}
//    };
}
