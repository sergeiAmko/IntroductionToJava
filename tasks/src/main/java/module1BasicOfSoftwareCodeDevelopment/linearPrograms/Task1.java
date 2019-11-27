package module1BasicOfSoftwareCodeDevelopment.linearPrograms;

import static module1BasicOfSoftwareCodeDevelopment.Service.getIntValue;

/**
 * Найдите значение функции: z=((a-3)*b/2)+c
 */
public class Task1 {

    public static void main(String[] args) {

        int a, b, c;
        double z;

        a = getIntValue("Input real number a");
        b = getIntValue("Input real number b");
        c = getIntValue("Input real number c");

        z = ((a - 3) * (double) b / 2) + c;
        System.out.println("the expression is: " + z);


    }


}
