package module2Algorithmization.decompositionUsingMethods;


import java.util.Arrays;

import static module2Algorithmization.Service.*;

/**
 * Даны натуральные числа K и N. Написать метод (методы) формирования массива А,
 * элементами которого являются числа, сумма цифр которых равна K и которые не больше N
 */
public class Task12 {


    public static void main(String[] args) {
        int k, n;
        String s = "Input number";

        k = getPositiveIntValue(s + " k");
        n = getPositiveIntValue(s + " n");

        System.out.println("Arrays:");
        System.out.println(Arrays.toString(createK(k, n)));
    }

    private static int[] createK(int k, int n) {

        int[] outWithZero = new int[n];
        int[] out;
        int[] middle;
        int count = 0;

        if (k < 1 && n < 1) {
            return null;
        }

        for (int i = 1; i < n; i++) {
            int sum = 0;
            middle = getDigitsOfNumber(i);

            for (int value : middle) {
                sum += value;
            }

            if (sum == k) {
                outWithZero[count] = i;
                count++;
            }


        }

        out = new int[count];

        System.arraycopy(outWithZero, 0, out, 0, out.length);

        return out;
    }

}
