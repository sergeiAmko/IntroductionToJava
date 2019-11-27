package module2Algorithmization.decompositionUsingMethods;

import static module2Algorithmization.Service.getLongValue;


/**
 * Написать метод (методы), определяющий, в каком из даннх двух чисел больше цифр
 */
public class Task11 {

    public static void main(String[] args) {
        long a, b;
        String s = "Input number";

        a = getLongValue(s + " a");
        b = getLongValue(s + " b");

        System.out.println(compareElements(a, b));
    }


    private static long compareElements(long a, long b) {
        return countElements(a) > countElements(b) ? a : b;
    }

    private static int countElements(long a) {
        int count = 0;
        long b = a;
        while (b > 0) {
            b = b / 10;
            count++;
        }
        return count;
    }

}
