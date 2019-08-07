package module2Algorithmization.decompositionUsingMethods;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.pow;

public class Task17 {
    public static void main(String[] args) {
        int n, sum, countEvenNumber;
        int[] a;
        String s = "Input";

        n = getIntValue(s + " n");
        sum = numberOfSubstraction(n);

        System.out.println("sum of array= " + sum);

        String s1 = " adasdasd";
        for (char c : s1.toCharArray()) {
            if (Character.isUpperCase(c)){

            }
        }

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

    private static int sumNumbersOfArray(int[] a) {
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    private static int numberOfSubstraction(int n) {
        int count = 0;

        while (n != 0) {
            int sum = sumNumbersOfArray(getDigitsOfNumber(n));
            n -= sum;
            count++;
        }

        return count;

    }

}
