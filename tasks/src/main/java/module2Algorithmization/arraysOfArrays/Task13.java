package module2Algorithmization.arraysOfArrays;

import static module2Algorithmization.Service.getDoubleArrayOfInt;
import static module2Algorithmization.Service.printArray;


/**
 * Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов.
 */
public class Task13 {
    public static void main(String[] args) {
        int[][] a, ascend, descend;
        String s = "Input array";

        a = getDoubleArrayOfInt(s);

        System.out.println("original array: ");
        printArray(a);
        System.out.println();

        System.out.println("the array is sorted in ascending order: ");
        ascend = sortAscending(a);
        printArray(ascend);
        System.out.println();

        System.out.println("the array is sorted in descending order:");
        descend = sortDescending(a);
        printArray(descend);


    }

    private static int[][] sortAscending(int[][] a) {
        for (int j = 0; j < a[0].length; j++) {
            for (int i = a.length - 1; i > 0; i--) {
                for (int k = 0; k < i; k++) {
                    if (a[k][j] > a[k + 1][j]) {
                        int tmp = a[k][j];
                        a[k][j] = a[k + 1][j];
                        a[k + 1][j] = tmp;
                    }
                }
            }
        }
        return a;
    }

    private static int[][] sortDescending(int[][] a) {
        for (int j = 0; j < a[0].length; j++) {
            for (int i = a.length - 1; i > 0; i--) {
                for (int k = 0; k < i; k++) {
                    if (a[k][j] < a[k + 1][j]) {
                        int tmp = a[k][j];
                        a[k][j] = a[k + 1][j];
                        a[k + 1][j] = tmp;
                    }
                }
            }
        }
        return a;
    }
}
