package module2Algorithmization.decompositionUsingMethods;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        int x = 0, y = 0, z = 0, t = 0;
        String s = "Input side ";

        while (x <= 0) {
            x = getIntValue(s + "x");
        }

        while (y <= 0) {
            y = getIntValue(s + "y");
        }
        while (z <= 0) {
            z = getIntValue(s + "z");
        }

        while (t <= 0) {
            t = getIntValue(s + "t");
        }

        System.out.println(areaOfQuadrilateral(x, y, z, t));


    }

    private static double areaOfQuadrilateral(int x, int y, int z, int t) {

        return (double) x * (y + t) / 2;

    }

    private static int getIntValue(String message) {
        Scanner scanner = new Scanner(System.in);

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

}
