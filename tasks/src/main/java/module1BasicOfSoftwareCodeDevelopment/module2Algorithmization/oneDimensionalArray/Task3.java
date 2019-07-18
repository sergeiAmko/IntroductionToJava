package module1BasicOfSoftwareCodeDevelopment.module2Algorithmization.oneDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        int n = 0, countPositive = 0,countNegative=0,countZero=0;
        double[] a;
        Scanner scanner = new Scanner(System.in);

        while (n <= 0) {
            n = getIntValue(scanner, "Input the number of  elements in the array ");
        }
        a = new double[n];

        for (int i = 0; i < n; i++) {
            a[i] = getDoubleValue(scanner, "Input the number");
        }

        for (int i = 0; i < n; i++) {
            if (a[i]<0){
                countNegative++;
            }else if (a[i]>0){
                countPositive++;
            }else {
                countZero++;
            }
        }

        System.out.println("Array input- "+Arrays.toString(a));
        System.out.println("count negative numbers= " + countNegative);
        System.out.println("count numbers of zero= " + countZero);
        System.out.println("count positive numbers= " + countPositive);


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

    private static double getDoubleValue(Scanner scanner, String message) {
        System.out.println(message);
        while (true) {
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else if (scanner.hasNext()) {
                System.out.println("You have entered an invalid number, input real number");
                scanner.next();
            }
        }


    }
}
