package module2Algorithmization.decompositionUsingMethods;

import java.util.Arrays;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        int k;
        String s = "Input numer";
        k = getIntValue(s + " n");


        System.out.println("Numbers of Amstrong from 1 to " + k + "- " + Arrays.toString(numbersAmstrong(1, k)));


    }

    private static int getIntValue(String message) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(message);
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else if (scanner.hasNext()) {
                System.out.println("You have entered an invalid number, input real number");
                scanner.next();
            }
        }

    }

    private static int[] numbersAmstrong(int start, int end) {
        int[] arrayNumberOfAmstrong = new int[(end - start) / 2];
        int[] out;
        int k = 0;

        for (int i = start; i <= end; i++) {
            int sum;
            int[] a;
            int elavet;

            a = getDigitsOfNumber(i);
            sum = sumDigits(a, a.length);

            if (sum == i) {
                arrayNumberOfAmstrong[k] = i;
                k++;
            }
        }

        out = new int[k];

        for (int i = 0; i < k; i++) {
            out[i] = arrayNumberOfAmstrong[i];
        }

        return out;

    }

    private static int[] getDigitsOfNumber(int n) {
        int count = countDigits(n);
        int[] digits;
        int i = 0;

        digits = new int[count];
        for (int j = 0; j < count; j++) {
            {
                digits[i] = n % 10;
                n /= 10;
                i++;
            }

        }
        return digits;
    }

    private static int countDigits(int n) {
        int count = 0;

        while (n % 10 > 0) {
            n /= 10;
            count++;
        }
        return count;

    }

    private static int sumDigits(int[] a, int n) {
        int sum = 0;
        for (int j = 0; j < a.length; j++) {
            sum += Math.pow(a[j], n);
        }
        return sum;
    }
}
