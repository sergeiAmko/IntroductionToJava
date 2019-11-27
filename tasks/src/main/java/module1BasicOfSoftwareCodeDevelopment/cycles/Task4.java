package module1BasicOfSoftwareCodeDevelopment.cycles;

import static java.lang.Math.pow;


/**
 * Составить программу нахождения произведения квадратов первых двухсот чисел
 */
public class Task4 {
    public static void main(String[] args) {
        long product = 1, a = 200;
        for (int i = 1; i <= a; i++) {
            product *= pow(i, 2);
        }

        System.out.println("product of the 100 numbers= " + product);
    }

}
