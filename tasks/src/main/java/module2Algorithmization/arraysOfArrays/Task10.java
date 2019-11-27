package module2Algorithmization.arraysOfArrays;

import module2Algorithmization.Service;


/**
 * Найти положительные элементы главной диагонали квадратной матрицы
 */
public class Task10 {
    public static void main(String[] args) {
        int[][] a;
        String s = "Input array";

        a = Service.getDoubleArrayOfInt(s);

        for (int i = 0; i < a.length; i++) {
            if (a[i][i] > 0) {
                System.out.print(a[i][i] + " ");
            }
        }


    }




}
