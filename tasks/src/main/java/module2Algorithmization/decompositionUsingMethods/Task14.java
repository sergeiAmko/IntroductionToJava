package module2Algorithmization.decompositionUsingMethods;

import java.util.Arrays;

import static module2Algorithmization.Service.getDigitsOfNumber;
import static module2Algorithmization.Service.getIntValue;


/**
 * Натуральное число, в записи которого n цифр, называется числом Амстронга, если сумма
 * его цифр, возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k.
 * Для решения задачи использовать декомпозицию
 */
public class Task14 {
    public static void main(String[] args) {
        int k;
        String s = "Input number";
        k = getIntValue(s + " n");


        System.out.println("Numbers of Armstrong from 1 to " + k + "- " + Arrays.toString(numbersArmstrong(1, k)));


    }


    private static int[] numbersArmstrong(int start, int end) {
        int[] arrayNumberOfArmstrong = new int[(end - start) / 2];
        int[] out;
        int k = 0;

        for (int i = start; i <= end; i++) {
            int sum;
            int[] a;

            a = getDigitsOfNumber(i);
            sum = sumDigits(a, a.length);

            if (sum == i) {
                arrayNumberOfArmstrong[k] = i;
                k++;
            }
        }

        out = new int[k];

        for (int i = 0; i < k; i++) {
            out[i] = arrayNumberOfArmstrong[i];
        }

        return out;

    }



    private static int sumDigits(int[] a, int n) {
        int sum = 0;
        for (int j = 0; j < a.length; j++) {
            sum += Math.pow(a[j], n);
        }
        return sum;
    }
}
