package module1BasicOfSoftwareCodeDevelopment.cycles;

import static java.lang.Math.abs;
import static module1BasicOfSoftwareCodeDevelopment.Service.getIntValue;


/**
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */
public class Task8 {
    public static void main(String[] args) {
        int m, n, k, m1;


        m = getIntValue("Input real number m");
        n = getIntValue("Input real number n");
        System.out.print("Overal figure: ");
        m1 = abs(m);
        while (m1 > 0) {
            k = m1 % 10;
            int n1 = abs(n);
            while (n1 > 0) {
                int t = n1 % 10;
                if (k == t) {
                    System.out.print(k + ", ");
                }
                n1 /= 10;
            }
            m1 /= 10;
        }


    }

}
