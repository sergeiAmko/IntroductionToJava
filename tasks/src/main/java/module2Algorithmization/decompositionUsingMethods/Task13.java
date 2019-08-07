package module2Algorithmization.decompositionUsingMethods;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        int n;
        String s = "Input numer";

        n = getIntValue(s + " n");

        printDoubleArray(twinsSimples(n));

    }

    private static int getIntValue(String message) {
        Scanner scanner = new Scanner(System.in);

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

    private static boolean isSimple(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static int[][] twinsSimples(int n){
        int k=0,count=0,m=2;
        int[][] a=new int[n][m];
        int[][] out;

        for (int i = n; i <2*n-2 ; i++) {
            if (isSimple(i)&&isSimple(i+2)){
                a[k][0]=i;
                a[k][1]=i+2;
                k++;
                count++;
            }
        }

        out=new int[count][m];

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < out[0].length; j++) {
                out[i][j]=a[i][j];
            }
        }
        return out;
    }

    private static void printDoubleArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(String.format("%3d ", a[i][j]) + " ");
            }
            System.out.println();
        }
    }


}
