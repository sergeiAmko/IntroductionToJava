package module2Algorithmization.OneDimensionalArraysSort;

import java.util.Arrays;

import static module2Algorithmization.Service.getArrayInt;
import static module2Algorithmization.Service.getPositiveIntValue;


/**
 * Заданы два одномерных массива с различным количеством элементов и натуральное число k.
 * Объединить их в один массив, включая второй массив между k-м и (k+1)-м элементами первого,
 * при этом не используя дополнительный массив.
 */
public class Task1 {

    public static void main(String[] args) {
        int[] a, b;
        int k ;


        a = getArrayInt("Input the array a");
        b = getArrayInt("Input the  array b");

        do {
            k = getPositiveIntValue("Input natural k");
        } while (k >= a.length);

        System.out.println(Arrays.toString(mergeTwoArraysWithK(a, b, k)));

    }


    private static int[] mergeTwoArraysWithK(int[] a, int[] b, int k) {
        int[] r = new int[a.length + b.length];

        if (k > 0 && k <= a.length) {
            for (int i = 0, p = 0; i < r.length; i++, p++) {
                if (i + 1 == k) {
                    r[i] = a[p];
                    i++;
                    for (int value : b) {
                        r[i] = value;
                        i++;
                    }
                    i--;
                } else {
                    r[i] = a[p];
                }
            }
        }
        return r;
    }

}
