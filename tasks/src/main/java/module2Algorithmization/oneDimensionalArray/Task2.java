package module2Algorithmization.oneDimensionalArray;

import java.util.Arrays;

import static module2Algorithmization.Service.*;


/**
 * Дана послежовательность действительных чисел а[1], а[2], а[3],..., а[n]. Заменить все ее члены, большие данного Z,
 * этим числом. Подсчитать количество замен
 */
public class Task2 {
    public static void main(String[] args) {

        int z, count = 0;
        double[] a, input;

        a = getArrayDouble("Input double array");

        input = new double[a.length];

        System.out.println("_________________________________________________________");
        z = getIntValue("Input z");

        for (int i = 0; i < a.length; i++) {
            input[i] = a[i];
            if (a[i] > z) {
                a[i] = z;
                count++;
            }
        }

        System.out.println("Array input- " + Arrays.toString(input));
        System.out.println("count numbers > z= " + count);
        System.out.println("Array output- " + Arrays.toString(a));


    }

}
