package module2Algorithmization.arraysOfArrays;

import static module2Algorithmization.Service.getIntValue;


/**
 * Сформировать квадратную матрицу порядка n по заданному образцу (N- четное):
 * 1    1     1    ...  1   1   1
 * 2    2     2    ...  2   2   0
 * 3    3     3    ...  3   0   0
 * .    .     .    ...  ...
 * .    .     .    ...  ...
 * .    .     .    ...  ...
 * n-1  n-1   0    ...  0   0   0
 * n    0     0    ...  0   0   0
 */
public class Task5 {
    public static void main(String[] args) {
        int n = 0;
        int[][] a;
        String s = "Input array's size n- even number ";


        while (n <= 0) {
            n = getIntValue(s);
            if (n % 2 == 1) {
                n = 0;
            }
        }
        a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (n - i - j - 1 < 0) {
                    a[i][j] = 0;
                } else {
                    a[i][j] = i + 1;
                }
            }
        }

        for (int[] ints : a) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(ints[j] + "  ");
            }
            System.out.println();
        }
    }


}
