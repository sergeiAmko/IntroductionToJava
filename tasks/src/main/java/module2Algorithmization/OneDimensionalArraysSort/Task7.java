package module2Algorithmization.OneDimensionalArraysSort;


import java.util.Arrays;

import static module2Algorithmization.Service.getIncreasingArrayOfInt;

/**
 * Пусть даны две неубывающие последовательности действительных чисел
 * a[1]<=a[2]<=...<=a[n] и b[1]<=b[2]<=...<=b[m]. Требуется указать те места, на которые
 * нужно вставлять элементы последовательности b[1]<=b[2]<=...<=b[m] в первую последовательность
 * так, чтобы новая последовательность оставалась возрастающей.
 */
public class Task7 {


    public static void main(String[] args) {

        int[] a, b;

        a = getIncreasingArrayOfInt("Input the number of elements in the  array a ");
        b = getIncreasingArrayOfInt("Input the number of elements in the  array b ");

        System.out.println("Места в массиве А, для вставки массива В- " + Arrays.toString(indexInsert(a, b)));
    }

    private static int[] indexInsert(int[] a, int[] b) {

        int[] massIndexes = new int[b.length];
        int number = 0;

        int bI = 0;

        for (int i = 0; i < a.length; i++) {

            while (bI != b.length && a[i] > b[bI]) {

                massIndexes[number] = i + bI;
                bI++;
                number++;


            }

            if (i == a.length - 1) {

                i++;

                while (true) {
                    if (bI == b.length) break;

                    massIndexes[number] = i + bI;
                    number++;
                    bI++;

                }


            }

        }


        return massIndexes;

    }
}
