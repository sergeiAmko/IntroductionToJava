package module2Algorithmization.decompositionUsingMethods;

import java.util.Arrays;

import static java.lang.Math.pow;
import static module2Algorithmization.Service.getIntValue;


/**
 * Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
 * последовательность (например, 1234,5789). Для решения задачи использовать декомпозицию
 */
public class Task15 {
    public static void main(String[] args) {
        int n;
        String s = "Input";

        n = getIntValue(s + " n");

        System.out.println(Arrays.toString(getAllIncreasingNumbers(n)));


    }


    private static int[] getDigitsOfNumber(int n) {
        int count = countDigits(n);
        int[] digits;
        int i = count - 1;

        digits = new int[count];
        for (int j = 0; j < count; j++) {
            {
                digits[i] = n % 10;
                n /= 10;
                i--;
            }

        }
        return digits;
    }

    private static int countDigits(int n) {
        int count = 0;

        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;

    }

    private static boolean isIncreasingNumber(int n) {
        int countDigits = countDigits(n);
        int[] a;

        a = getDigitsOfNumber(n);
        for (int i = 1; i < countDigits; i++) {
            if (a[i] <= a[i - 1]) {
                return false;
            }
        }
        return true;
    }

    private static int[] getAllIncreasingNumbers(int n) {
        int[] a, b;
        int k = 0;

        a = new int[(int) pow(10, n)];

        for (int i = (int) pow(10, n - 1); i < (int) pow(10, n) - 1; i++) {
            if (isIncreasingNumber(i)) {
                a[k] = i;
                k++;
            }
        }
        b = new int[k];

        for (int i = 0; i < b.length; i++) {
            b[i] = a[i];
        }
        return b;
    }
}
