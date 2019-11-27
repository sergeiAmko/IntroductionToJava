package module1BasicOfSoftwareCodeDevelopment.linearPrograms;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static module1BasicOfSoftwareCodeDevelopment.Service.getDoubleValue;

/**
 * Вычислить значения выражения по формуле (все переменные принимают действительные значения):
 * (b + sqrt(pow(b, 2) + 4 * a * c)) / (2 * a) - pow(a, 3) * c + pow(b, -2)
 **/
public class Task2 {
    public static void main(String[] args) {

        double a, b, c, z;

        a = getDoubleValue("Input real number a");
        b = getDoubleValue("Input real number b");
        c = getDoubleValue("Input real number c");

        z = (b + sqrt(pow(b, 2) + 4 * a * c)) / (2 * a) - pow(a, 3) * c + pow(b, -2);

        System.out.println("the expression is: " + z);


    }


}


