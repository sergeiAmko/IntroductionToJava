package module2Algorithmization.oneDimensionalArray;

import java.util.Arrays;

import static module2Algorithmization.Service.*;


/**
 * Задана последовательность N вещественных чисел. Вычислить сумму чисел,
 * порядковые номера которых являются простыми числами
 */
public class Task6 {
    public static void main(String[] args) {

        double sum = 0;
        double[] a;
        double[] simpleA;
        boolean isSimple = true;


        a = getArrayDouble("Input double array");

        simpleA = new double[a.length];


        int k = 0;

        for (int i = 0; i < a.length; i++) {
            if (i == 1) {

                sum += a[i];
                simpleA[k] = a[i];
                k++;

            } else if (i == 2) {

                sum += a[i];
                simpleA[k] = a[i];
                k++;

            } else if (i != 0) {


                for (int j = 2; j < i; j++) {

                    if (i % j == 0) {
                        isSimple = false;
                    }

                }
                if (isSimple) {

                    sum += a[i];
                    simpleA[k] = a[i];
                    k++;
                }

                isSimple = true;


            }
        }

        double[] out = new double[k--];

        for (int i = 0; i <= k; i++) {

            out[i] = simpleA[i];

        }

        System.out.println("Array input- " + Arrays.toString(a));
        System.out.println("Array output- " + Arrays.toString(out));
        System.out.println("sum= " + sum);
    }

}
