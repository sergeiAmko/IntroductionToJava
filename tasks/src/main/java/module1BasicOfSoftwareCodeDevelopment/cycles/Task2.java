package module1BasicOfSoftwareCodeDevelopment.cycles;

import java.util.Scanner;

import static java.lang.Math.*;

public class Task2 {
    public static void main(String[] args) {
        int a,b;
        double h=0,delta=1e-10;
        Scanner scanner = new Scanner(System.in);

        a = getIntValue(scanner, "Input real number a");
        b = getIntValue(scanner, "Input real number b");
        while (h<=0){
            h = getDoubleValue(scanner, "Input number h>0");
        }

        for (double i = a; b-i>=delta ; i=i+h) {

            if (i>2){
                System.out.println(String.format("%.2g%n", (i)));
            }else {
                System.out.println(String.format("%.2g%n", (-i)));
            }
        }



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
