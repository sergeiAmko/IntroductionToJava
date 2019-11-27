package module2Algorithmization.arraysOfArrays;

import static module2Algorithmization.Service.getDoubleSquareArray;
import static module2Algorithmization.Service.printArray;


/**
 * Отсортировать строки матрицы по возрастанию и убыванию значений элементов
 */
public class Task12 {
    public static void main(String[] args) {
        int[][] a, ascend, descend;
        String s = "Input array";

        a = getDoubleSquareArray(s);

        System.out.println("original array:");
        printArray(a);
        System.out.println();

        System.out.println("the array is sorted in ascending order:");
        ascend = sortAscending(a);
        printArray(ascend);
        System.out.println();

        System.out.println("the array is sorted in descending order:");
        descend = sortDescending(a);
        printArray(descend);


    }

    private static int[][] sortAscending(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = a[0].length - 1; j > 0; j--) {
                for (int k = 0; k < j; k++) {
                    if (a[i][k] > a[i][k + 1]) {
                        int tmp = a[i][k];
                        a[i][k] = a[i][k + 1];
                        a[i][k + 1] = tmp;
                    }
                }
            }
        }
        return a;
    }

    private static int[][] sortDescending(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = a[0].length - 1; j > 0; j--) {
                for (int k = 0; k < j; k++) {
                    if (a[i][k] < a[i][k + 1]) {
                        int tmp = a[i][k];
                        a[i][k] = a[i][k + 1];
                        a[i][k + 1] = tmp;
                    }
                }
            }
        }
        return a;
    }


}
