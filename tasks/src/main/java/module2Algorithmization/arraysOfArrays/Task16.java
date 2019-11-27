package module2Algorithmization.arraysOfArrays;

import java.util.Scanner;


/**
 * Магическим квадратом порядка n называется квадратная матрица n*n, составленная из чисел
 * 1,2,3...,n*n, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей
 * равны между собой. Построить такой квадрат. Пример магического квадрата порядка 3:
 * 6 1 8
 * 7 5 3
 * 2 9 4
 */
public class Task16 {
    public static void main(String[] args) {
        int[][] a;
        int n = 0;
        String s = "Input size array n";

        Scanner scanner = new Scanner((System.in));
        n = getIntValue(scanner, s);

        a = new int[n][n];
//        System.out.println(sumForNumber(n));
    }

    private static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(String.format("%3d ", a[i][j]) + " ");
            }
            System.out.println();
        }
    }

    private static int getIntValue(Scanner scanner, String message) {
        System.out.println(message);
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else if (scanner.hasNext()) {
                System.out.println("You have entered an invalid number, input real number");
                scanner.next();
            }
        }

    }

//    private static int[][] createSquareArray(int n){
//        int[][] a =new int[n][n];
//        int[] numbers=createLinearArray(n);
//        int maxSumRow=sumForNumber(n)/n;
//        int sumRowWithout;
//
//        int sum=sumForNumber(n);
//
//        Random random=new Random();
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//
//            }
//            a[i][n-1]=sum;
//        }
//
//
//    }

    private static int sumForNumber(int n) {

        return (int) (n * (Math.pow(n, 2) + 1)) / 2;
    }

    private static int[] createLinearArray(int n) {
        int[] a = new int[n * n];
        for (int i = 0; i < n * n; i++) {
            a[i] = i + 1;
        }
        return a;
    }
}
