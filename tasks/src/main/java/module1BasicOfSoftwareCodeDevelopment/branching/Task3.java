package module1BasicOfSoftwareCodeDevelopment.branching;

import static java.lang.Math.*;
import static module1BasicOfSoftwareCodeDevelopment.Service.getIntValue;


/**
 * Даны три точки A(x1,y1), B(x2,y2) и C(x3,y3).
 * Определить, будут ли они расположены на одной прямой
 */
public class Task3 {
    public static void main(String[] args) {

        int x1, x2, x3, y1, y2, y3;
        double a, b, c, p, s, delta = 1e-6;

        x1 = getIntValue("Input real number x1");
        y1 = getIntValue("Input real number y1");
        x2 = getIntValue("Input real number x2");
        y2 = getIntValue("Input real number y2");
        x3 = getIntValue("Input real number x3");
        y3 = getIntValue("Input real number y3");

        a = sqrt(pow(abs(x1 - x2), 2) + pow(abs(y1 - y2), 2));
        b = sqrt(pow(abs(x2 - x3), 2) + pow(abs(y2 - y3), 2));
        c = sqrt(pow(abs(x1 - x3), 2) + pow(abs(y1 - y3), 2));

        p = (a + b + c) / 2;
        System.out.println(s = sqrt(p * (p - a) * (p - b) * (p - c)));

        if (s <= delta) {
            System.out.println("All points have  the line");
        } else {
            System.out.println("All points haven't the line");
        }
        System.out.println(s);
    }

}
