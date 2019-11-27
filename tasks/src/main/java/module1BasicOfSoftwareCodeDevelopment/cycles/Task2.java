package module1BasicOfSoftwareCodeDevelopment.cycles;

import static module1BasicOfSoftwareCodeDevelopment.Service.*;


/**
 * Вычислить значения функии на отрезке [a,b] с шагом h:
 * y=x, x>2
 * y=-x, x>=2
 */
public class Task2 {
    public static void main(String[] args) {
        int a, b;
        double h = 0, delta = 1e-10;

        a = getIntValue("Input real number a");
        b = getIntValue("Input real number b");
        while (h <= 0) {
            h = getDoubleValue("Input number h>0");
        }

        for (double i = a; b - i >= delta; i = i + h) {

            if (i > 2) {
                System.out.println(String.format("%.2g%n", (i)));
            } else {
                System.out.println(String.format("%.2g%n", (-i)));
            }
        }


    }


}
