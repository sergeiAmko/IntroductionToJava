package module2Algorithmization.arraysOfArrays;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int n = 0;
        int[][] a;
        String s="Input array's size n- even number";

        Scanner scanner = new Scanner(System.in);

        while (n <= 0) {
            n = getIntValue(scanner, s);
            if (n%2==1){
                n=0;
            }
        }
        a=new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i<n/2&&j<n/2&&i-j>0){
                    a[i][j]=0;
                }else if(i<n/2&&j>=n/2&&i+j>=n) {
                    a[i][j]=0;
                }else if (i>=n/2&&j<n/2&&i+j<n-1){
                    a[i][j]=0;
                }else if (i>=n/2&&j>=n/2&&i-j<0){
                    a[i][j]=0;
                }
                else {
                    a[i][j]=1;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]+"  ");
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
}
