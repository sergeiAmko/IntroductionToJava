package module1BasicOfSoftwareCodeDevelopment.branching;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int a, b, x, y, z, areaInlet, areaXY, areaYZ, areaXZ;
        double delta = 1e-6;
        boolean isPass = false;

        Scanner scanner = new Scanner(System.in);

        a = getIntValue(scanner, "Input real number A");
        b = getIntValue(scanner, "Input real number B");
        x = getIntValue(scanner, "Input real number x");
        y = getIntValue(scanner, "Input real number y");
        z = getIntValue(scanner, "Input real number z");

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

    private static int getIntValue(Scanner scanner, String message) {
        System.out.println(message);
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else if (scanner.hasNext()) {
                System.out.println("You have entered an invalid number, input real number");
                scanner.next();
            }
        }

    }


    private static int max(int a, int b) {
        return a >= b ? a : b;
    }

}
