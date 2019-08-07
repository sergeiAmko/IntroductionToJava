package module2Algorithmization.arraysOfArrays;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        int[][] a;
        String s = "Input array's size n-even  number";

        a = getArray(s);

        System.out.println(maxIndexInArray(sumArray(a)));


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

    private static int[] sumArray(int[][] a){
        int[]sumArray = new int[a.length];

        for (int j = 0; j < a[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < a.length; i++) {
                sum += a[i][j];
            }
            sumArray[j] = sum;
        }

        return sumArray;
    }

    private static int maxIndexInArray(int[] a){
        int max=a[0];
        int index=0;

        for (int i = 0; i < a.length; i++) {
            if (a[i]>max){
                max=a[i];
                index=i+1;
            }
        }

        return index;
    }

}
