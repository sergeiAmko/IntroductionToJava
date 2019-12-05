package module2Algorithmization.OneDimensionalArraysSort;

import java.util.Arrays;

import static module2Algorithmization.Service.*;


/**
 * Заданы два одномерных массива с различным количеством элементов и натуральное число k.
 * * Объединить их в один массив, включая второй массив между k-м и (k+1)-м элементами первого,
 * * при этом не используя дополнительный массив.
 */
public class Task1 {

    public static void main(String[] args) {
        int[] a, b;
        int aSize;
        int k;


        b = getArrayInt("Input the  array b");

        aSize = getPositiveIntValue("Input size of array a");

        a = new int[aSize + b.length];

        for (int i = 0; i < aSize; i++) {
            a[i] = getIntValue("Input natural a[" + (i + 1) + "] ");
        }


        do {
            k = getPositiveIntValue("Input natural k");
        } while (k >= a.length);


        System.out.println(Arrays.toString(mergeTwoArraysWithKInA(a, b, k)));


    }


    private static int[] mergeTwoArraysWithKInA(int[] a, int[] b, int k) {

        for (int i = a.length - 1; i >= k - 1 + b.length; i--) {

            a[i] = a[i - b.length];

        }

        for (int i = k - 1, p = 0; i < k - 1 + b.length; p++, i++) {

            a[i] = b[p];

        }
        return a;
    }

}
