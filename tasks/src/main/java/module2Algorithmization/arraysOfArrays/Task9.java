package module2Algorithmization.arraysOfArrays;

import module2Algorithmization.Service;


/**
 * Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
 * Определить, какой столбец содержит максимальную сумму.
 */
public class Task9 {
    public static void main(String[] args) {
        int[][] a;
        String s = "Input array";

        a = Service.getDoubleArrayOfPositiveInt(s);

        System.out.println(maxIndexInArray(sumArray(a)));


    }


    private static int[] sumArray(int[][] a){
        int[]sumArray = new int[a.length];

        for (int j = 0; j < a[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < a.length; i++) {
                sum += a[i][j];
            }
            sumArray[j] = sum;
        }

        return sumArray;
    }

    private static int maxIndexInArray(int[] a){
        int max=a[0];
        int index=0;

        for (int i = 0; i < a.length; i++) {
            if (a[i]>max){
                max=a[i];
                index=i+1;
            }
        }

        return index;
    }

}
