package module2Algorithmization.arraysOfArrays;

import java.util.Scanner;

import static java.lang.Math.*;
import static java.lang.Math.pow;

public class Task8 {
    public static void main(String[] args) {
        int n = 0,column1=-1,column2=-1;
        int[][] a;
        String s = "Input array's size n-even  number";
        String sColumn1="Input column 1";
        String sColumn2="Input column 2";

        Scanner scanner = new Scanner(System.in);

        while (n <= 0) {
            n = getIntValue(scanner, s);
        }
        a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (i + j + 1) * 3;
            }
        }

        printArray(a);

        while (column1 < 0) {
            column1 = getIntValue(scanner, sColumn1);
        }

        while (column2< 0) {
            column2 = getIntValue(scanner, sColumn2);
        }

        for (int i = 0; i < a.length; i++) {
            int r=a[i][column1-1];
            a[i][column1-1]=a[i][column2-1];
            a[i][column2-1]=r;

        }

        printArray(a);

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

    private static void printArray(int[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(String.format("%3d ",a[i][j])+ " ");
            }
            System.out.println();
        }
    }
}
