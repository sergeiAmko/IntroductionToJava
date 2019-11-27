package module2Algorithmization.arraysOfArrays;

import static module2Algorithmization.Service.getDoubleSquareArray;


/**
 * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */
public class Task2 {

    public static void main(String[] args) {
        int[][] a= getDoubleSquareArray("Input size n array");


        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i][i]+" ");
        }

    }




}
