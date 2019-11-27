package module2Algorithmization.arraysOfArrays;

import java.util.Random;

import static module2Algorithmization.Service.printArray;


/**
 * Матрицу 10*20 заполнить случайными числами от 0 до 15. Вывести на экран
 * саму матрицу и номер строк, в которых число 5 встречается три и более раз
 */
public class Task11 {
    public static void main(String[] args) {
        int m = 10, n = 20;
        int[][] a = getRandomSquareArray(m, n);

        printArray(a);

        System.out.print("rows with the number of fives more than 3- ");
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] == 5) {
                    count++;
                }
            }
            if (count >= 3) {
                System.out.print((i + 1) + ", ");
            }

        }


    }

    private static int[][] getRandomSquareArray(int m, int n) {
        Random rand = new Random();
        int[][] a = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = rand.nextInt(16);
            }
        }

        return a;
    }




}
