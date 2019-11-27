package module2Algorithmization.oneDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

import static module2Algorithmization.Service.*;


/**
 * Даны действительные числа а[1], а[2], а[3],..., а[n]. Найтии
 * max(a[1]+a[2n], a[2]+a[2n-1],...,a[n]+a[n+1]).
 */
public class Task7 {
    public static void main(String[] args) {
        double[] a;


        a = getArrayDouble("Input double array");
        System.out.println(max(a));


    }


    private static double max(double[] a) {
        double max = a[0] + a[a.length - 1];
        int aSize = a.length;
        double[] mass = new double[a.length % 2 == 0 ? a.length / 2 : a.length / 2 + 1];
        for (int i = 0; i < (aSize % 2 == 0 ? aSize / 2 : aSize / 2 + 1); i++) {
            if (i == aSize - 1 - i) {
                mass[i] = a[i];
            } else {
                mass[i] = a[i] + a[aSize - 1 - i];
            }
        }
        System.out.println("massive a= " + Arrays.toString(a));
        System.out.println("massive mass= " + Arrays.toString(mass));

        for (double t : mass) {
            if (t > max) {
                max = t;
            }
        }
        return max;
    }
}
