package module2Algorithmization.OneDimensionalArraysSort;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int[] a;

        a = getIncreasingArray("Input the number of elements in the  array a ");

        System.out.println(Arrays.toString(sortByShella(a)));

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

    private static int[] getIncreasingArray(String s) {
        int n = 0;
        int[] a;

        Scanner scanner = new Scanner(System.in);

        while (n <= 0) {
            n = getIntValue(scanner, s);
        }
        a = new int[n];

        for (int i = 0; i < n; i++) {
            String t = s, s1 = "Input the number more than previous-  ";
            boolean isMore = false;
            if (i == 0) {
                a[i] = getIntValue(scanner, "Input a[" + i + "] ");
            } else {
                while (!isMore) {
                    a[i] = getIntValue(scanner, t + a[i - 1]);
                    if (a[i] >= a[i - 1]) {
                        isMore = true;
                    }
                    t = s1;
                }
            }
        }
        return a;
    }

    private static int[] sortByShella(int a[]) {
        while (true){
            boolean isIncreasingNot=true;

            for (int i = 1; i < a.length; i++) {
                if (a[i-1]>a[i]){
                    int r = a[i];
                    a[i] = a[i-1];
                    a[i-1] = r;
                    int k=i-1;
                    while (k>0){
                        if (a[k-1]>a[k]){
                            int p=a[k];
                            a[k]=a[k-1];
                            a[k-1]=p;
                        }
                        k--;
                    }
                    isIncreasingNot=false;
                }


            }
            if (isIncreasingNot){
                break;
            }
        }
        return a;
    }
}
