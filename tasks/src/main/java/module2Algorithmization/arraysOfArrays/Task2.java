package module2Algorithmization.arraysOfArrays;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        int[][] a=getSquareArray("Input size n array");


        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i][i]+" ");
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
            for (int j = 0; j < n; j++) {
                a[i][j] = getIntValue(scanner, "Input the number " + i + "*" + j);
            }
        }
        return a;
    }
}
