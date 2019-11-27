package module2Algorithmization.decompositionUsingMethods;

import static module2Algorithmization.Service.getPositiveIntValue;


/**
 * Даны числа X,Y,Z,T - длины сторон четырехугольника. Написать метод вычисления его площади,
 * если угол между сторонами длиной X и Y - прямой.
 */
public class Task9 {

    public static void main(String[] args) {
        int x, y, z, t;
        String s = "Input side ";

        x = getPositiveIntValue(s + "x");
        y = getPositiveIntValue(s + "y");
        z = getPositiveIntValue(s + "z");
        t = getPositiveIntValue(s + "t");

        System.out.println(areaOfQuadrilateral(x, y, z, t));


    }

    private static double areaOfQuadrilateral(int x, int y, int z, int t) {

        return (double) x * (y + t) / 2;

    }


}
