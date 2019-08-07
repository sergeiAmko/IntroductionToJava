package module2Algorithmization.decompositionUsingMethods;

import java.util.Arrays;
import java.util.Scanner;

public class Task11 {

        public static void main(String[] args) {
            long a, b;
            String s = "Input numer";

            a = getIntValue(s + " a");
            b = getIntValue(s + " b");

            System.out.println(compareElements(a, b));
        }

        private static long getIntValue(String message) {
            Scanner scanner = new Scanner(System.in);

            System.out.println(message);
            while (true) {
                if (scanner.hasNextLong()) {
                    return scanner.nextLong();
                } else if (scanner.hasNext()) {
                    System.out.println("You have entered an invalid number, input real number");
                    scanner.next();
                }
            }

        }

        private static long compareElements(long a, long b) {
            return countElements(a) > countElements(b) ? a : b;
        }

        private static int countElements(long a) {
            int count = 0;
            long b = a;
            while (b > 0) {
                b = b / 10;
                count++;
            }
            return count;
        }

}
