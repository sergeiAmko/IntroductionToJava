package module2Algorithmization.oneDimensionalArray;

import static module2Algorithmization.Service.getArrayInt;


/**
 * В массиве целых чисел с количеством элементов n найти наиболее часто
 * встречающееся число. Если таких чисел несколько, то определить наименьшее из них
 */
public class Task9 {
    public static void main(String[] args) {
        int[] a;

        a = getArrayInt("Input array");

        System.out.println("min= " + min(maximumNumber(countNumbers(a))));


    }


    private static int[][] countNumbers(int[] input) {
        int count = 0;
        int[][] test = new int[input.length][2];
        int[][] output;


        for (int value : input) {
            boolean isHaveInArray = false;
            for (int j = 0; j < count; j++) {
                if (test[j][0] == value) {
                    test[j][1] = test[j][1] + 1;
                    isHaveInArray = true;
                }
            }

            if (!isHaveInArray) {
                test[count][0] = value;
                test[count][1] = 1;
                count++;
            }

        }

        output = new int[count][2];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < test[0].length; j++) {
                output[i][j] = test[i][j];
            }
        }
        return output;
    }

    private static int min(int[] input) {
        int min = input[0];
        for (int value : input) {
            if (value < min) {
                min = value;
            }
        }

        return min;
    }

    private static int[] maximumNumber(int[][] input) {
        int[] maxOutput;
        int maxValue = input[0][0];
        int countMaxValue = 0;

        for (int[] value : input) {
            if (value[1] > maxValue) {
                maxValue = value[1];
            }
        }

        for (int[] ints : input) {
            if (ints[1] == maxValue) {
                countMaxValue++;
            }
        }

        maxOutput = new int[countMaxValue];

        for (int i = 0, j = 0; i < input.length; i++) {
            if (input[i][1] == maxValue) {
                maxOutput[j] = input[i][0];
                j++;
            }
        }
        return maxOutput;
    }

}
