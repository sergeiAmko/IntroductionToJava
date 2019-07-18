package module2Algorithmization.oneDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        int n = 0, k, p = 0, sum = 0;
        int[] a;
        Scanner scanner = new Scanner(System.in);

        while (n <= 0) {
            n = getIntValue(scanner, "Input the number of elements in the array >0");
        }
        a = new int[n];

        for (int i = 0; i < n; i++) {
            while (p <= 0) {
                p = getIntValue(scanner, "Input the number >0");
            }

            a[i] = p;
            p = 0;

        }

        System.out.println("_________________________________________________________");
        k = getIntValue(scanner, "Input k");


        for (int i = 0; i < n; i++) {
            if (a[i] % k == 0) {
                sum += a[i];
            }
        }

        System.out.println("Array- " + Arrays.toString(a));
        System.out.println("sum of multiple " + k + "= " + sum);


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
