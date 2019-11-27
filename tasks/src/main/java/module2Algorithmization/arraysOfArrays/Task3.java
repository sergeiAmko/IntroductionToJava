package module2Algorithmization.arraysOfArrays;

import static module2Algorithmization.Service.getDoubleArrayOfInt;
import static module2Algorithmization.Service.getIntValue;

/**
 * Дана матрица. Вывести k-ю строку и р-й столбец матрицы
 */
public class Task3 {

    public static void main(String[] args) {
        int[][] a = getDoubleArrayOfInt("Input the number m*n");


        printColumn(a, getIntValue("Input number of column for print the column"));
        printRow(a, getIntValue("Input number of row for print the row"));

    }


    private static void printRow(int[][] ints, int k) {
        for (int j = 0; j < ints[0].length; j++) {
            System.out.print(ints[k - 1][j] + " ");
        }
        System.out.println();
    }

    private static void printColumn(int[][] ints, int p) {
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i][p - 1] + " ");
        }
    }


}
