package module2Algorithmization.OneDimensionalArraysSort;

import module2Algorithmization.Service;

import java.util.Arrays;


/**
 * Сортировка обменами. Дана последовательность чисел a[1]<=a[2]<=...<=a[n]. Требуется
 * переставить числа в порядке возрастания. Для этого сравниваются два соседних числа a[i] и a[i+1],
 * то делается перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в
 * порядке возрастания. Составить алгорится сортировки, подсчитывая при этом количества перестановок.
 */
public class Task4 {
    public static void main(String[] args) {
        int[] a;

        a = Service.getIncreasingArrayOfInt("Input the  array");

        System.out.println(Arrays.toString(sortBySelection(a)));

    }


    private static int[] sortBySelection(int a[]) {
        int count = 0;

        while (true) {
            boolean isIncreasingNot = true;

            for (int i = 1; i < a.length; i++) {
                if (a[i - 1] > a[i]) {
                    int r = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = r;
                    isIncreasingNot = false;
                    count++;
                }


            }
            if (isIncreasingNot) {
                break;
            }

        }

        System.out.println("Count= " + count);

        return a;
    }
}
