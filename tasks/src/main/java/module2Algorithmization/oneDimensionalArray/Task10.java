package module2Algorithmization.oneDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        int[] a=getArray("Input the number of elements in the  array");

        System.out.println("new massive- "+ Arrays.toString(removeOnZero(a)));


    }

    private static int[] removeOnZero(int[] ints){
        for (int i = 0; i < ints.length; i++) {
            if (i==0||i%2==0){
                ints[i]=0;
            }
        }
        return ints;
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

    private static int[] getArray(String s){
        int n = 0;
        int[] a;

        Scanner scanner = new Scanner(System.in);

        while (n <= 0) {
            n = getIntValue(scanner, s);
        }
        a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = getIntValue(scanner, "Input the number 0");
        }
        return a;
    }
}
