package module2Algorithmization.arraysOfArrays;

import java.util.Random;

import static module2Algorithmization.Service.getPositiveIntValue;
import static module2Algorithmization.Service.printArray;


/**
 * Сформировать случайную матрицу m*n, состоящую из нулей и единиц, причем в
 * каждом столбце число единиц равно номеру столбца
 */
public class Task14 {
    public static void main(String[] args) {
        int m, n;
        String s = "Input the number";
        m = getPositiveIntValue(s + " m");
        n = getPositiveIntValue(s + " n");

        printArray(getRandomArrayWithZeroAndOne(m, n));
    }


    private static int[][] getRandomArrayWithZeroAndOne(int m, int n) {
        Random rand = new Random();
        int[][] a = new int[m][n];

        for (int j = 0; j < n; j++) {
            int count = 0;
            for (int i = 0; i < m; i++) {
                int r = rand.nextInt(100) % 2 == 0 ? 0 : 1;
                if (r == 1 && count < j) {
                    a[i][j] = r;
                    count++;
                }
            }

            while (count != j + 1) {
                int p = rand.nextInt(m);
                if (a[p][j] != 1) {
                    a[p][j] = 1;
                    count++;
                } else if (a[m - p - 1][j] != 1) {
                    a[m - p - 1][j] = 1;
                    count++;
                }

            }
        }

        return a;
    }

}
