package module2Algorithmization.oneDimensionalArray;

import java.util.Arrays;

import static module2Algorithmization.Service.*;


/**
 *Даны действительные числа а[1], а[2], а[3],..., а[n]. Поменять местами наибольший и наименьший элементы
 */
public class Task4 {
    public static void main(String[] args) {

        int  maxIndex=0, minIndex=0;
        double max, min;
        double[] a, input;

        a=getArrayDouble("Input double array");
        input = new double[a.length];

        System.arraycopy(a, 0, input, 0, a.length);

        max = a[0];
        min = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                maxIndex=i;
            } else if (a[i] < min) {
                min = a[i];
                minIndex=i;
            }
        }

        a[maxIndex]=min;
        a[minIndex]=max;

        System.out.println("Array input- " + Arrays.toString(input));
        System.out.println("min= " + min);
        System.out.println("max= " + max);
        System.out.println("Array output- " + Arrays.toString(a));
    }


}
