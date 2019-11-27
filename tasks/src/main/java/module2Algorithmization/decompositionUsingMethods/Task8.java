package module2Algorithmization.decompositionUsingMethods;

import module2Algorithmization.Service;


/**
 * Задан массив D. Определить следующие суммы:
 * D[1]+D[2]+D[3]; D[3]+D[4]+D[5]; D[4]+D[5]+D[6].
 * Пояснение. Составить метод (методы) для вычисления суммы трех последовательно расположенных элементов
 * массива с номерами от k до m
 */
public class Task8 {
    public static void main(String[] args) {
        int[] a;
        String s = "Input array";

        a = Service.getArrayInt(s);

        for (int i = 0; i < a.length; i = i + 2) {
            int k = 3;
            if (i + k - 1 > a.length) {
                k = a.length - i;
            }
            System.out.println("sum from D[" + (i+1) + "] to D[" + (i + k ) + "]= " + sumNumbersOfArrayFromStartToEnd(a, i, i + k));

        }

    }


    private static int sumNumbersOfArrayFromStartToEnd(int[] a, int start, int end) {
        int sum = 0;
        if (end > a.length) {
            end = a.length;
        }
        System.out.print("Values from D[" + (start+1) + "] to D[" + end + "]= [");
        for (int i = start; i < end; i++) {
            sum += a[i];
            System.out.print(a[i] + ", ");
        }
        System.out.print("]\n");

        return sum;
    }
}
