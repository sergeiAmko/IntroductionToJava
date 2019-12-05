package module2Algorithmization.OneDimensionalArraysSort;

import java.util.Arrays;

import static module2Algorithmization.Service.*;

/**
 * Даны две последовательности a[1]<=a[2]<=...<=a[n] и b[1]<=b[2]<=...<=b[m].
 * Образовать из них новую последовательность чисел так, чтобы она тоже была
 * неубывающей.
 * Примечание: дополнительный массив не использовать
 */
public class Task2 {
    public static void main(String[] args) {
        int[] a, b;
        int aSize;

        b = getIncreasingArrayOfInt("Input the  array b ");

        aSize = getPositiveIntValue("Input size of array a");

        a = new int[aSize + b.length];

        for (int i = 0; i < aSize; i++) {
            boolean isMore = false;
            if (i == 0) {
                a[i] = getIntValue("Input [" + i + "]");
            } else {
                while (!isMore) {
                    a[i] = getIntValue("Input [" + i + "]");
                    if (a[i] >= a[i - 1]) {
                        isMore = true;
                    }
                }
            }
        }


        System.out.println(Arrays.toString(mergeTwoArraysAscendingOrder(a, b)));

    }


    private static int[] mergeTwoArraysAscendingOrder(int a[], int[] b) {

        for (int i = 0, bInd = 0; i < a.length; i++) {

            if (bInd != b.length &&
                    a[i] > b[bInd]) {

                for (int j = a.length - 1; j > i; j--) {

                    a[j] = a[j - 1];

                }
                a[i] = b[bInd];
                bInd++;

            }

        }

        return a;
    }
}