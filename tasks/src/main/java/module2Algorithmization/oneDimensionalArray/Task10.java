package module2Algorithmization.oneDimensionalArray;

import java.util.Arrays;

import static module2Algorithmization.Service.getArrayInt;


/**
 * Дан целочисленный массив с количеством элементов n. Сжать массив,
 * выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).
 * Примечание: дополнительный массив не искользовать
 */
public class Task10 {
    public static void main(String[] args) {

        int[] a = getArrayInt("Input array:");

        System.out.println("new massive- " + Arrays.toString(removeOnZero(a)));


    }

    private static int[] removeOnZero(int[] ints) {
        int k = 1;
        for (int i = 0; i < ints.length; i++) {
            if (i % 2 != 0 && i != ints.length - 1) {
                ints[k] = ints[i + 1];
                k++;
            }
        }

        for (int i = k; i < ints.length; i++) {
            ints[i] = 0;
        }
        return ints;
    }


}
