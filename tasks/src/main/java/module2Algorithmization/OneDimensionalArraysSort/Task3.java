package module2Algorithmization.OneDimensionalArraysSort;

import module2Algorithmization.Service;

import java.util.Arrays;


/**
 * Сортировка выбором. Дана последовательность чисел a[1]<=a[2]<=...<=a[n]. Требуется
 * переставить элементы так, чтобы они были расположены по убыванию. Для этого в массиве,
 * начиная  первого, выбирается наибольший элемент и ставится на первое место, а первый-
 * на место наибольшего. Затем, начиная со второго, эта процедура повторяется. Написать
 * алгорится сортировки выбором.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] a;

        a = Service.getIncreasingArrayOfInt("Input the array a ");


        System.out.println(Arrays.toString(sortBySelection(a)));

    }


    private static int[] sortBySelection(int a[]) {

        for (int i = 0; i < a.length; i++) {
            int maxIndex = maxStartingAtNIndex(a, i);
            if (a[i] < a[maxIndex]) {
                int r = a[i];
                a[i] = a[maxIndex];
                a[maxIndex] = r;
            }

        }
        return a;
    }

    private static int maxStartingAtNIndex(int[] a, int start) {
        int maxValue = a[start];
        int maxIndex = start;

        if (a.length - 1 == start) {
            return start;
        }
        for (int i = start + 1; i < a.length; i++) {
            if (a[i] > maxValue) {
                maxValue = a[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
