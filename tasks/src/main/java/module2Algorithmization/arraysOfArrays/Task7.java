package module2Algorithmization.arraysOfArrays;

import java.util.Scanner;

import static java.lang.Math.*;

public class Task7 {
    public static void main(String[] args) {
        int n = 0;
        double[][] a;
        String s = "Input array's size n-even number";

        Scanner scanner = new Scanner(System.in);

        while (n <= 0) {
            n = getIntValue(scanner, s);
            if (n%2!=0){
                n=0;
            }
        }
        a = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j]=sin(toRadians((pow(i, 2) - pow(j, 2) - n)));
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(String.format("%6.3f  ",a[i][j]));
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

}
