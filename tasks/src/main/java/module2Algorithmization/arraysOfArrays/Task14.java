package module2Algorithmization.arraysOfArrays;

import java.util.Random;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        int m=0,n=0;
        String s="Input the number m*n";
        Scanner scanner=new Scanner(System.in);
        while (m <= 0) {
            m= getIntValue(scanner, s);
        }

        while (n <= 0) {
            n = getIntValue(scanner, s);
        }

        printArray(getRandomArrayWithZeroAndOne(m,n));
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

    private static int[][] getRandomArrayWithZeroAndOne(int m, int n) {
        Random rand = new Random();
        int[][] a = new int[m][n];

        for (int j = 0; j < n; j++) {
            int count = 0;
            for (int i = 0; i < m; i++) {
                int r = rand.nextInt(100) % 2 == 0 ? 0 : 1;
                if (r == 1 && count < j) {
                    a[i][j] = r;
                    count++;
                }
            }

            while (count != j+1) {
                int p=rand.nextInt(m);
                if (a[p][j] != 1) {
                    a[p][j] = 1;
                    count++;
                }else if (a[m-p-1][j]!=1){
                    a[m-p-1][j]=1;
                    count++;
                }

            }
        }

        return a;
    }

}
