package module2Algorithmization.arraysOfArrays;

import static java.lang.Math.*;
import static module2Algorithmization.Service.getIntValue;


/**
 * Сформировать квадратную матрицу порядка N по правилу и подсчитать количество положительных элементов в ней
 * A[I,J]=sin( (I*I-J*J) / N)
 */
public class Task7 {
    public static void main(String[] args) {
        int n = 0;
        double[][] a;
        String s = "Input array's size n-even number";

        while (n <= 0) {
            n = getIntValue(s);
            if (n % 2 != 0) {
                n = 0;
            }
        }
        a = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sin(toRadians((pow(i, 2) - pow(j, 2) - n)));
            }
        }

        for (double[] doubles : a) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(String.format("%6.3f  ", doubles[j]));
            }
            System.out.println();
        }
    }


}
