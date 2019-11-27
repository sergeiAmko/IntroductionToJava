package module2Algorithmization.oneDimensionalArray;

import java.util.Arrays;

import static module2Algorithmization.Service.getArrayInt;


/**
 * Дана последовательность целых чисел а[1], а[2], а[3],..., а[n]. Образовать новую последовательность,
 * выбрасив из исходной те члены, которые равны min(а[1], а[2], а[3],..., а[n]).
 */
public class Task8 {
    public static void main(String[] args) {
        int[] a;

        a = getArrayInt("Input array");


        System.out.println("array after remove- " + Arrays.toString(remove(a, min(a))));
    }

    private static int[] remove(int[] massive, double removable) {
        int[] output;
        int count = 0;
        for (int value : massive) {
            if (value == removable) {
                count++;
            }
        }

        if (count == 0) {
            return massive;
        }

        output = new int[massive.length - count];
        int iOutput = 0;

        for (int value : massive) {
            if (value != removable) {
                output[iOutput] = value;
                iOutput++;
            }
        }
        System.out.println("massive- " + Arrays.toString(massive));
        System.out.println("output- " + Arrays.toString(output));

        return output;
    }

    private static int min(int[] massive) {
        int min = massive[0];
        for (int value : massive) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }


}
