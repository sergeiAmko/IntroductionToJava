package module2Algorithmization.decompositionUsingMethods;

import static module2Algorithmization.Service.getIntValue;
import static module2Algorithmization.Service.printArray;


/**
 * Два простых числа называются "близнецами", если они отличаются друг от друга на 2
 * (например, 41 и 43). Найти и напечатать все пары "близнецов" из отрезка [n,2n],
 * где n - заданное натуральное число больше 2. Для решения задачи использовать
 * декомпозицию.
 */
public class Task13 {
    public static void main(String[] args) {
        int n;
        String s = "Input number";

        n = getIntValue(s + " n");

        printArray(twinsSimples(n));

    }


    private static boolean isSimple(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static int[][] twinsSimples(int n) {
        int k = 0, count = 0, m = 2;
        int[][] a = new int[n][m];
        int[][] out;

        for (int i = n; i < 2 * n - 2; i++) {
            if (isSimple(i) && isSimple(i + 2)) {
                a[k][0] = i;
                a[k][1] = i + 2;
                k++;
                count++;
            }
        }

        out = new int[count][m];

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < out[0].length; j++) {
                out[i][j] = a[i][j];
            }
        }
        return out;
    }


}
