package module2Algorithmization.oneDimensionalArray;

import java.util.Arrays;

import static module2Algorithmization.Service.*;


/**
 * Дан масив действительнх чисел, размерность которого N.
 * Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов
 */
public class Task3 {
    public static void main(String[] args) {

        int  countPositive = 0, countNegative = 0, countZero = 0;
        double[] a;

        a=getArrayDouble("Input double array");

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                countNegative++;
            } else if (a[i] > 0) {
                countPositive++;
            } else {
                countZero++;
            }
        }

        System.out.println("Array input- " + Arrays.toString(a));
        System.out.println("count negative numbers= " + countNegative);
        System.out.println("count numbers of zero= " + countZero);
        System.out.println("count positive numbers= " + countPositive);


    }


}
