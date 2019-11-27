package module2Algorithmization.decompositionUsingMethods;

import module2Algorithmization.Service;

import java.util.Arrays;


/**
 * Дано натуральное число N. Написать метод (методы) для формирования массива,
 * элементами которого являются цифры числа N.
 */
public class Task10 {

    public static void main(String[] args) {
        long a;
        String s = "Input long number";

        a = Service.getLongValue(s);

        System.out.println(Arrays.toString(elements(a)));
    }


    private static long[] elements(long a) {
        int count = 0, i = 0;
        long b = a;
        while (b > 0) {
            b = b / 10;
            count++;
        }

        long[] output = new long[count];

        while (a > 0) {
            output[i] = a % 10;
            i++;
            a /= 10;
        }
        return output;
    }

}
