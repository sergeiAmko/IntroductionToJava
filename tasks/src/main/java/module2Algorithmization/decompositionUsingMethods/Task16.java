package module2Algorithmization.decompositionUsingMethods;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.pow;

public class Task16 {
    public static void main(String[] args) {
        int n, sum, countEvenNumber;
        int[] a;
        String s = "Input";

        n = getIntValue(s + " n");
        a = getAllOddNumbers(n);
        sum = sumNumbersOfArray(a);
        countEvenNumber = countEvenNumber(sum);

        System.out.println("Array- " + Arrays.toString(a));
        System.out.println("sum of array= " + sum);
        System.out.println("Number of even number at sum= " + countEvenNumber);


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

    private static boolean isOddNumber(int n) {
        int countDigits = countDigits(n);
        int[] a;

        a = getDigitsOfNumber(n);
        for (int i = 0; i < countDigits; i++) {
            if (a[i] % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    private static int[] getAllOddNumbers(int n) {
        int[] a, b;
        int k = 0;

        a = new int[(int) pow(10, n)];

        for (int i = (int) pow(10, n - 1); i < (int) pow(10, n) - 1; i++) {
            if (isOddNumber(i)) {
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

    private static int sumNumbersOfArray(int[] a) {
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    private static int countEvenNumber(int n) {
        int countDigits = countDigits(n);
        int count = 0;
        int[] a;

        a = getDigitsOfNumber(n);
        for (int i = 0; i < countDigits; i++) {
            if (a[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
