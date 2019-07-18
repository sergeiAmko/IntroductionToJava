package module2Algorithmization.oneDimensionalArray;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        int n = 0;
        int[] a;
        Scanner scanner = new Scanner(System.in);

        while (n <= 0) {
            n = getIntValue(scanner, "Input the number of elements in the array ");
        }
        a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = getIntValue(scanner, "Input the number 0");
        }

        System.out.print("a[i]>i - ");
        for (int i = 0; i < n; i++) {
            if (a[i]>i){
                System.out.print(a[i]+", ");
            }
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
