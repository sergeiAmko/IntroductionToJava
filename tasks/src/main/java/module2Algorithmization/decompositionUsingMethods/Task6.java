package module2Algorithmization.decompositionUsingMethods;

import static module2Algorithmization.Service.getIntValue;


/**
 * Написать метод (методы), проверяющий, являются ли данные три числа взаимно простыми
 */
public class Task6 {
    public static void main(String[] args) {
        int[] a;
        int simple = 1;
        boolean isComposite = false;
        String s = "Input 3 numbers";

        a = getThreeNumbers(s);

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (gcd(a[i], a[j]) != simple) {
                    isComposite = true;
                }
            }
        }

        if (!isComposite) {
            System.out.println("numbers is mutually simple");
        } else {
            System.out.println("Numbers isn't mutually simple");
        }
    }

    private static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }


    private static int[] getThreeNumbers(String s) {
        int n = 3;
        int[] a;

        a = new int[n];

        System.out.println(s);

        for (int i = 0; i < n; i++) {
            a[i] = getIntValue("Input the number " + i);
        }
        return a;
    }
}
