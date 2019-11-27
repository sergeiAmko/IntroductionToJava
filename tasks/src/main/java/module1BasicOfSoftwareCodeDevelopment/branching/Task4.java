package module1BasicOfSoftwareCodeDevelopment.branching;


import static module1BasicOfSoftwareCodeDevelopment.Service.getIntValue;


/**
 * Задданы размеры А, B прямоугольного отверстия и размеры x,y,z кирпича.
 * Определить, пройдет ли корпич через отверстие.
 */
public class Task4 {
    public static void main(String[] args) {
        int a, b, x, y, z, areaInlet, areaXY, areaYZ, areaXZ;
        boolean isPass = false;

        a = getIntValue("Input real number A");
        b = getIntValue("Input real number B");
        x = getIntValue("Input real number x");
        y = getIntValue("Input real number y");
        z = getIntValue("Input real number z");

        areaInlet = a * b;
        areaXY = x * y;
        areaYZ = y * z;
        areaXZ = x * z;

        if (areaInlet >= areaXY && max(a, b) >= max(x, y)) {
            isPass = true;
        } else if (areaInlet >= areaYZ && max(a, b) >= max(y, z)) {
            isPass = true;
        } else if (areaInlet >= areaXZ && max(a, b) >= max(x, z)) {
            isPass = true;
        }

        System.out.println(isPass ? "passes" : "don't pass");

    }


    private static int max(int a, int b) {
        return a >= b ? a : b;
    }

}
