package module2Algorithmization.decompositionUsingMethods;

import static module2Algorithmization.Service.getIntValue;


/**
 * Написать методы (методы) для нахождения наибольшего общего делителя и наименьшего общего
 * кратного двуч натуральных чисел:
 * НОК(А,В)= А*В / НОД(А,В)
 */
public class Task1 {

    public static void main(String[] args) {
        int a, b;
        String sA = "Input the A ";
        String sB = "Input the B ";


        a = getIntValue(sA);
        b = getIntValue(sB);

        System.out.println("НОД " + a + " и " + b + "= " + nod(a, b));
        System.out.println("НОК " + a + " и " + b + "= " + nok(a, b));


    }


    private static long nod(long a, long b) {
        return b == 0 ? a : nod(b, a % b);
    }

    private static long nok(long a, long b) {
        return a / nod(a, b) * b;
    }
}
