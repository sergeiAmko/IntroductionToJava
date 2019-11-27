package module2Algorithmization.arraysOfArrays;

import static module2Algorithmization.Service.getIntValue;


/**
 * Сформировать квадратную матрицу порядка n по заданному образцу (N- четное):
 * 1    1     1    ...  1   1   1
 * 0    1     1    ...  1   1   0
 * 0    0     1    ...  1   0   0
 * .    .     .    ...  ...
 * .    .     .    ...  ...
 * .    .     .    ...  ...
 * 0    1     1    ...  1   1   0
 * 1    1     1    ...  1   1   1
 */
public class Task6 {
    public static void main(String[] args) {
        int n = 0;
        int[][] a;
        String s = "Input array's size n- even number";


        while (n <= 0) {
            n = getIntValue(s);
            if (n % 2 == 1) {
                n = 0;
            }
        }
        a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < n / 2 && j < n / 2 && i - j > 0) {
                    a[i][j] = 0;
                } else if (i < n / 2 && j >= n / 2 && i + j >= n) {
                    a[i][j] = 0;
                } else if (i >= n / 2 && j < n / 2 && i + j < n - 1) {
                    a[i][j] = 0;
                } else if (i >= n / 2 && j >= n / 2 && i - j < 0) {
                    a[i][j] = 0;
                } else {
                    a[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
    }



}
