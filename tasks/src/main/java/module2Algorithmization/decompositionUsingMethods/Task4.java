package module2Algorithmization.decompositionUsingMethods;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.*;

public class Task4 {

    public static void main(String[] args) {
        int[][] l;
        double max = 0;
        int maxPoint1=0, maxPoint2=0;

        l = getArrayTwo("Input the number of points");

        for (int i = 0; i < l.length; i++) {
            for (int j = i + 1; j < l.length; j++) {
                double v = distanceBetweenPoints(l[i][0], l[i][1], l[j][0], l[j][1]);
                if (v > max) {
                    max = v;
                    maxPoint1 = i;
                    maxPoint2 = j;
                }
            }
        }

        System.out.println("max distance between points- "+maxPoint1+" - "+maxPoint2+" = "+max);

    }

    private static int[][] getArrayTwo(String s) {
        int[][] a;
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        while (n <= 0) {
            n = getIntValue(scanner, s);
        }

        a = new int[n][2];

        for (int i = 0; i < n; i++) {
            a[i][0] = getIntValue(scanner, "Input x[" + i + "]");
            a[i][1] = getIntValue(scanner, "Input y[" + i + "]");

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

    private static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(String.format("%3d ", a[i][j]) + " ");
            }
            System.out.println();
        }
    }

    private static double distanceBetweenPoints(int x0, int y0, int x1, int y1) {
        return sqrt(pow((x1 - x0), 2) + pow((y1 - y0), 2));
    }

}
