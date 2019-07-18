package module1BasicOfSoftwareCodeDevelopment.module2Algorithmization.oneDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        int n = 0;
        int[] a;

        Scanner scanner = new Scanner(System.in);

        while (n <= 0) {
            n = getIntValue(scanner, "Input the number of elements in the array");
        }
        a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = getIntValue(scanner, "Input the number 0");
        }


        System.out.println("min= " + min(maximumNumber(countNumbers(a))));


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

    private static int[][] countNumbers(int[] input) {
        int count = 0;
        int[][] test = new int[input.length][2];
        int[][] output;


        for (int i = 0; i < input.length; i++) {
            boolean isHaveInArray = false;
            for (int j = 0; j < count; j++) {
                if (test[j][0] == input[i]) {
                    test[j][1] = test[j][1] + 1;
                    isHaveInArray = true;
                }
            }

            if (!isHaveInArray) {
                test[count][0] = input[i];
                test[count][1] = 1;
                count++;
            }

        }

        output = new int[count][2];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < test[0].length; j++) {
                output[i][j] = test[i][j];
            }
        }
        return output;
    }

    private static int min(int[] input) {
        int min = input[0];
        for (int i = 0; i < input.length; i++) {
            if (input[i] < min) {
                min = input[i];
            }
        }

        return min;
    }

    private static int[] maximumNumber(int[][] input) {
        int[] maxOutput, max = new int[input.length];
        int maxValue = input[0][0];
        int countMaxValue = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i][1] > maxValue) {
                maxValue = input[i][1];
            }
        }

        for (int i = 0; i < input.length; i++) {
            if (input[i][1] == maxValue) {
                countMaxValue++;
            }
        }

        maxOutput = new int[countMaxValue];

        for (int i = 0, j = 0; i < input.length; i++) {
            if (input[i][1] == maxValue) {
                maxOutput[j] = input[i][0];
                j++;
            }
        }
        return maxOutput;
    }

}
