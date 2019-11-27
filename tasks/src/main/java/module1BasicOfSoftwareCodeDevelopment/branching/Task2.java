package module1BasicOfSoftwareCodeDevelopment.branching;

import static module1BasicOfSoftwareCodeDevelopment.Service.getIntValue;


/**
 * Найти max{min(a,b),min(c,d)}
 */
public class Task2 {
    public static void main(String[] args) {
        int a, b, c, d;


        a = getIntValue("Input real number a");
        b = getIntValue("Input real number b");
        c = getIntValue("Input real number c");
        d = getIntValue("Input real number d");

        System.out.println("max{min(a,b),min(c,d)}= " + max(min(a, b), min(c, d)));
    }

    private static int max(int a, int b) {
        return a >= b ? a : b;
    }

    private static int min(int a, int b) {
        return a <= b ? a : b;
    }

}
