package module2Algorithmization.arraysOfArrays;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        int[][] a;
        String s = "Input array's size n-even   number";

        a = getSquareArray(s);

        for (int i = 0; i < a.length; i++) {
            if (a[i][i] > 0) {
                System.out.print(a[i][i] + " ");
            }
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


}
