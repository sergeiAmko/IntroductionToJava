package module1BasicOfSoftwareCodeDevelopment.branching;

import static java.lang.Math.pow;
import static module1BasicOfSoftwareCodeDevelopment.Service.getIntValue;


/**
 * Вычислить значение функции
 *     =x*x - 3x +9, если x<=3
 * F(x)
 *     =1/(x*x*x + 6), если x>3
 */
public class Task5 {
    public static void main(String[] args) {
        int x;
        double f;

        x = getIntValue("Input real number x");

        if (x <= 3) {
            f = pow(x, 2) - 3 * x + 9;
        } else {
            f = 1 / (pow(x, 3) + 6);
        }

        System.out.println("f= " + f);
    }

}
