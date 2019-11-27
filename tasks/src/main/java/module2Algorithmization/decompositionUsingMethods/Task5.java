package module2Algorithmization.decompositionUsingMethods;

import static module2Algorithmization.Service.getArrayInt;


/**
 * Составить программу, которая в массиве A[N] находит второе по величине число
 * (вывести на печать число, которое меньше максимального элемента массива,
 * но больше всех других элементов).
 */
public class Task5 {
    public static void main(String[] args) {

        int[] a = getArrayInt("Input  the  array");

        System.out.println("pre-max= " + preMaximum(a));
    }


    private static int preMaximum(int[] a) {
        int max = a[0];
        int preMax = Integer.MIN_VALUE;

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                preMax = max;
                max = a[i];
            }
        }

        return preMax;
    }
}
