package module2Algorithmization.decompositionUsingMethods;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static module2Algorithmization.Service.getIntValue;
import static module2Algorithmization.Service.getPositiveIntValue;


/**
 * На плоскости заданы своими координатами n точек. Написать метод (методы),
 * определяющие, между какими из пар точек самое большое расстояние.
 * Указание. Координаты точек занести в массив
 */
public class Task4 {

    public static void main(String[] args) {
        int[][] l;
        double max = 0;
        int maxPoint1 = 0, maxPoint2 = 0;

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

        System.out.println("max distance between points- " + maxPoint1 + " - " + maxPoint2 + " = " + max);

    }

    private static int[][] getArrayTwo(String s) {
        int[][] a;
        int n;

        n = getPositiveIntValue(s);

        a = new int[n][2];

        for (int i = 0; i < n; i++) {
            a[i][0] = getIntValue("Input x[" + i + "]");
            a[i][1] = getIntValue("Input y[" + i + "]");

        }
        return a;
    }


    private static double distanceBetweenPoints(int x0, int y0, int x1, int y1) {
        return sqrt(pow((x1 - x0), 2) + pow((y1 - y0), 2));
    }

}
