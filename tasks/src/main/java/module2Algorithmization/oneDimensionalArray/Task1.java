package module2Algorithmization.oneDimensionalArray;

import java.util.Arrays;

import static module2Algorithmization.Service.getArrayInt;
import static module2Algorithmization.Service.getIntValue;


/**
 * В массив A[N] занесены натуральные числа.
 * Найти сумму тех эелементов, которые кратны данному К.
 */
public class Task1 {
    public static void main(String[] args) {

        int  k, sum = 0;
        int[] a;

        a = getArrayInt("Input the array");

        System.out.println("_________________________________________________________");

        k = getIntValue("Input k");


        for (int i = 0; i < a.length; i++) {
            if (a[i] % k == 0) {
                sum += a[i];
            }
        }

        System.out.println("Array- " + Arrays.toString(a));
        System.out.println("sum of multiple " + k + "= " + sum);


    }


}
