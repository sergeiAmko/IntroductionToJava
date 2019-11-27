package module2Algorithmization.arraysOfArrays;

import module2Algorithmization.Service;

import static module2Algorithmization.Service.printArray;


/**
 * Найдите наибольший элемент матрицы и заменить все нечетные элементы на него
 */
public class Task15 {
    public static void main(String[] args) {
        int[][] a;
        String s = "Input array's size n-even   number";

        a = Service.getDoubleSquareArray(s);

        printArray(replaceAllOddElements(a, max(a)));


    }


    private static int max(int[][] a) {
        int maxValue = a[0][0];
        for (int[] ints : a) {
            for (int j = 0; j < a[0].length; j++) {
                if (ints[j] > maxValue) {
                    maxValue = ints[j];
                }
            }
        }
        return maxValue;
    }

    private static int[][] replaceAllOddElements(int[][] a, int max) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] % 2 != 0) {
                    a[i][j] = max;
                }
            }
        }
        return a;
    }
}
