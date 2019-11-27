package module2Algorithmization.decompositionUsingMethods;

import static module2Algorithmization.Service.getDigitsOfNumber;
import static module2Algorithmization.Service.getIntValue;


/**
 * Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифры и т.д.
 * Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать
 * декомпозицию
 */
public class Task17 {
    public static void main(String[] args) {
        int n, count;
        String s = "Input";

        n = getIntValue(s + " n");
        count = countOfSubstraction(n);

        System.out.println("count= " + count);


    }


    private static int sumNumbersOfArray(int[] a) {
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    private static int countOfSubstraction(int n) {
        int count = 0;

        while (n != 0) {
            int sum = sumNumbersOfArray(getDigitsOfNumber(n));
            n -= sum;
            count++;
        }

        return count;

    }

}
