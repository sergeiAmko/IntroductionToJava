package module1BasicOfSoftwareCodeDevelopment.linearPrograms;

import static java.lang.Math.*;
import static module1BasicOfSoftwareCodeDevelopment.Service.getDoubleValue;

/**
 * Вычислить значения выражения по формуле (все переменные принимают действительные значения):
 * (sin(x) +cos(y))/(cos(x)-sin(y)*tg(xy)
 */
public class Task3 {

    public static void main(String[] args) {
        double x, y;
        double delta = 1e-10;

        x = getDoubleValue("Input real number x in degrees");
        y = getDoubleValue("Input real number y in degrees");

        double v = cos(toRadians(x)) - sin(toRadians(y));
        if (v >= delta && x * y != 90) {
            System.out.println(((sin(toRadians(x)) + cos(toRadians(y))) / v) * tan(toRadians(x * y)));
        } else {
            System.out.println("You have introduced non correct numbers x and y  ");

        }


    }

}
