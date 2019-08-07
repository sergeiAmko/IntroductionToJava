package module2Algorithmization.OneDimensionalArraysSort;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        int[] a, b;
        int k = 0;

        Scanner scanner=new Scanner(System.in);

        a = getArray("Input the number of elements in the  array a");
        b = getArray("Input the number of elements in the  array b");

        while (k<=0||k>a.length) {
            k = getIntValue(scanner, "Input natural k");
        }

        System.out.println(Arrays.toString(mergeTwoArraysWithK(a, b, k)));

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

    private static int[] getArray(String s) {
        int n = 0;
        int[] a;

        Scanner scanner = new Scanner(System.in);

        while (n <= 0) {
            n = getIntValue(scanner, s);
        }
        a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = getIntValue(scanner, "Input the number " + i);
        }
        return a;
    }

    private static int[] mergeTwoArraysWithK(int a[], int[] b, int k) {
        int[] r = new int[a.length + b.length];

        if (k > 0 && k <= a.length) {
            for (int i = 0, p = 0; i < r.length; i++, p++) {
                if (i + 1 == k) {
                    r[i] = a[p];
                    i++;
                    for (int j = 0; j < b.length; j++) {
                        r[i] = b[j];
                        i++;
                    }
                    i--;
                } else {
                    r[i] = a[p];
                }
            }
        }
        return r;
    }

//            int[] a={1,2,3,12,15,25,6,4,5,6,7,8,9,10};
}
