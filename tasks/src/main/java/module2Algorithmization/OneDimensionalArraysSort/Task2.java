package module2Algorithmization.OneDimensionalArraysSort;

import java.util.Arrays;

import static module2Algorithmization.Service.getIncreasingArrayOfInt;

/**
 * Даны две последовательности a[1]<=a[2]<=...<=a[n] и b[1]<=b[2]<=...<=b[m].
 * Образовать из них новую последовательность чисел так, чтобы она тоже была
 * неубывающей.
 * Примечание: дополнительный массив не использовать
 */
public class Task2 {
    public static void main(String[] args) {
        int[] a, b;

        a = getIncreasingArrayOfInt("Input the  array a ");
        b = getIncreasingArrayOfInt("Input the  array b ");

        System.out.println(Arrays.toString(mergeTwoArraysAscendingOrder(a, b)));

    }


    private static int[] mergeTwoArraysAscendingOrder(int a[], int[] b) {
        int[] outArray = new int[a.length + b.length];
        boolean isBEnd = false;

        for (int i = 0; i < a.length; i++) {
            outArray[i] = a[i];
        }


        for (int i = 0, bI = 0; i < outArray.length; i++) {

            if (outArray[i] >= b[bI]) {

                for (int j = outArray.length - 1; j > i; j--) {

                    outArray[j] = outArray[j - 1];

                }

                outArray[i] = b[bI];
                bI++;

            }


        }
        if (outArray[outArray.length - 1] < b[b.length - 1]) {
            outArray[outArray.length - 1] = b[b.length - 1];
        }
        return outArray;
    }
}