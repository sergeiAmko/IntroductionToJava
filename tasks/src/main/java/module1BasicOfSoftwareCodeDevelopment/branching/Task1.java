package module1BasicOfSoftwareCodeDevelopment.branching;

import static module1BasicOfSoftwareCodeDevelopment.Service.getIntValue;

/**
 * Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
 * и если да, то будет ли он прямоугольным
 */
public class Task1 {
    public static void main(String[] args) {
        int alfa = 0, beta = 0, gamma;
        int maxDegree = 180;
        int rightAngle = 90;
        boolean isRightTriangle = false;


        while (alfa <= 0) {
            alfa = getIntValue("Input real number >0 angle alfa");
        }
        while (beta <= 0) {
            beta = getIntValue("Input real number >0 angle beta");
        }

        if (alfa + beta >= maxDegree) {
            System.out.println("Triangle isn't exists with such angles:\n" +
                    "alfa= " + alfa + "\n" +
                    "beta= " + beta);
        } else {
            gamma = maxDegree - alfa - beta;

            if (alfa == rightAngle || beta == rightAngle || gamma == rightAngle) {
                isRightTriangle = true;
            }

            System.out.println("The triangle is " + (isRightTriangle ? " right " : " not right") + " triangle with such angles:\n" +
                    "alfa= " + alfa + "\n" +
                    "beta= " + beta + "\n" +
                    "gamma= " + gamma);
        }


    }


}
