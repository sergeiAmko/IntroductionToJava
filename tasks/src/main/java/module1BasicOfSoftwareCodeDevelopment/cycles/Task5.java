package module1BasicOfSoftwareCodeDevelopment.cycles;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static module1BasicOfSoftwareCodeDevelopment.Service.getDoubleValue;
import static module1BasicOfSoftwareCodeDevelopment.Service.getIntValue;


/**
 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,
 * модуль которых больше или равен заданному е. Общий чле ряда имеет вид:
 * An=1/pow(2,n)+1/3pow(3,n)
 */
public class Task5 {
    public static void main(String[] args) {
        int n;
        double e, a, sum = 0;


        n = getIntValue("Input real number n");
        e = getDoubleValue("Input number e");

        for (int i = 0; i <= n; i++) {
            a = 1 / pow(2, i) + 1 / pow(3, i);

            if (abs(a) >= e) {
                sum += a;
            }
        }

        System.out.println("sum= " + sum);

    }

}
