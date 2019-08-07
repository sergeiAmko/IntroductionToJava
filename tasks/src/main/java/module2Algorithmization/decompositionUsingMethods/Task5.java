package module2Algorithmization.decompositionUsingMethods;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        int[] a = getArray("Input the number of elements in the  array");

        System.out.println("pre-max= "+preMaximum(a));
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

    private static int preMaximum(int[] a){
        int max=a[0];
        int preMax=Integer.MIN_VALUE;

        for (int i = 1; i < a.length; i++) {
            if (a[i]>max){
                preMax=max;
                max=a[i];
            }
        }

        return preMax;
    }
}
