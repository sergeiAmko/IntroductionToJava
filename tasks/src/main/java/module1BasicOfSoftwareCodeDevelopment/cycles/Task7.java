package module1BasicOfSoftwareCodeDevelopment.cycles;

import static module1BasicOfSoftwareCodeDevelopment.Service.getIntValue;


/**
 * Для каждого натурального числа в промежутке от m до n вывести все делители,
 * кроме единицы и самого числа.
 * m и n вводятся с клавиатуры
 */
public class Task7 {
    public static void main(String[] args) {

        int m = 0, n = 0;

        while (m <= 0) {
            m = getIntValue("Input real number m");
        }
        while (n <= 0) {
            n = getIntValue("Input real number n");
        }

        if (m > n) {
            int k = m;
            m = n;
            n = k;
        }

        for (int i = m; i <= n; i++) {
            if (i == 0 || i == 1) {
                continue;
            }
            System.out.print("All the divisors of " + i + "- ");
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.print(j + ", ");
                }
            }

            System.out.println();
        }

    }


}
