package module2Algorithmization.arraysOfArrays;

import static module2Algorithmization.Service.*;


/**
 * В числовой матрицы поменять местами два столбца, т.е.  все элементы одного столбца
 * поставить на соответствующие им позиции другого, а его элементы второго переместить в первый.
 * Номера столбцов вводит пользоатель с клавиатуры
 */
public class Task8 {
    public static void main(String[] args) {
        int column1, column2;
        int[][] a;
        String s = "Input array";
        String sColumn1 = "Input column 1";
        String sColumn2 = "Input column 2";


        a = getDoubleArrayOfInt(s);

        printArray(a);

        while (true) {
            column1 = getPositiveIntValue(sColumn1);

            if (column1 < a[0].length) {
                break;
            }
        }

        while (true) {
            column2 = getPositiveIntValue(sColumn2);

            if (column2 < a[0].length) {
                break;
            }
        }

        for (int i = 0; i < a.length; i++) {
            int r = a[i][column1 - 1];
            a[i][column1 - 1] = a[i][column2 - 1];
            a[i][column2 - 1] = r;

        }

        printArray(a);

    }


}
