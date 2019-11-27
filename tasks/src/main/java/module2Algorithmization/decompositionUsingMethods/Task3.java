package module2Algorithmization.decompositionUsingMethods;

import module2Algorithmization.Service;


/**
 * Вычислить площадь правильного шестиугольника со строной а, используя
 * метод вычисления площади треугольника
 */
public class Task3 {

    public static void main(String[] args) {
        double n;
        double area;
        String s = "Input length hexagon >0";


        n = Service.getPositiveIntValue(s);

        area = areaOfEquilateralTriangle(n) * 6;

        System.out.println("Area hexagon with sides " + n + "= " + String.format("%.3f", area));

    }


    private static double areaOfEquilateralTriangle(double a) {
        return a * a * 3 * Math.sqrt(3) / 2;
    }
}
