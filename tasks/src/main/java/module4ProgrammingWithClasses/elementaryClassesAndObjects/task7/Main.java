package module4ProgrammingWithClasses.elementaryClassesAndObjects.task7;

import static module4ProgrammingWithClasses.Service.getIntValue;


/**
 * Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов,
 * вычисления площади, периметра и точки пересечения медиан.
 */
public class Main {
    public static void main(String[] args) {

        int choiceTriangle, inner;

        Triangle triangle;

        String choiceCreateTriangele = "Input number:\n" +
                "1- create your triangle\n" +
                "other number - create defaults triangle";
        String infoActive = "Input number:\n" +
                "1-get perimeter\n" +
                "2-get area\n" +
                "3-get point of intersection of medians\n" +
                "other number-exit";
        String strParameter1 = "Input point A";
        String strParameter2 = "Input point B";
        String strParameter3 = "Input point C";
        String strX = " X";
        String strY = " Y";

        choiceTriangle = getIntValue(choiceCreateTriangele);

        switch (choiceTriangle) {
            case 1:
                int parAX = getIntValue(strParameter1 + strX);
                int parAY = getIntValue(strParameter1 + strY);

                int parBX = getIntValue(strParameter2 + strX);
                int parBY = getIntValue(strParameter2 + strY);

                int parCX = getIntValue(strParameter3 + strX);
                int parCY = getIntValue(strParameter3 + strY);

                triangle = Triangle.creTriangle(new Point(parAX, parAY), new Point(parBX, parBY), new Point(parCX, parCY));

                break;
            default:

                triangle = Triangle.createTriangle();
                break;

        }

        while (true) {
            inner = getIntValue(infoActive);
            switch (inner) {
                case 1:
                    System.out.println("Perimeter= " + triangle.perimeter());
                    break;
                case 2:
                    System.out.println("Area= " + triangle.area());
                    break;
                case 3:
                    System.out.println("Point of intersection of medians= " + triangle.pointOfIntersectionOfMedians().toString());
                    break;
                default:
                    System.exit(0);
            }
        }


    }

}
