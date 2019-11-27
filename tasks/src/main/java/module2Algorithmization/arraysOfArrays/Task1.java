package module2Algorithmization.arraysOfArrays;

import static module2Algorithmization.Service.getDoubleArrayOfInt;


/**
 * Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего
 */
public class Task1 {
    public static void main(String[] args) {
        int[][] a = getDoubleArrayOfInt("Input the double array");

        int columnCount = a[0].length;
        int rowCount = a.length;
        int[][] neww = new int[rowCount][columnCount];
        int count = 0;

        for (int j = 0; j < columnCount; j++) {
            if (j % 2 == 0) {
                if (a[0][j] > a[rowCount - 1][j]) {
                    for (int k = 0; k < columnCount; k++) {
                        neww[k][count] = a[k][j];
                    }
                    count++;
                }
            }
        }

        int[][] finish = new int[neww.length][count];

        for (int i = 0; i < neww.length; i++) {
            if (count >= 0) System.arraycopy(neww[i], 0, finish[i], 0, count);
        }

        for (int[] ints : finish) {
            for (int j = 0; j < count; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

}
