package module3StringsAndBasicsOfTextProcessing.stringIsObject;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        String s = "Input string";
        String a = getString(s);

        System.out.println(countConsecutiveGaps(a));
    }

    private static String getString(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        while (true) {
            if (scanner.hasNextLine()) {
                return scanner.nextLine();
            }
        }
    }

    private static int countConsecutiveGaps(String s) {

        int maxindex = 0;
        int maxCount = 0;
        int count = 1;

        while (s.indexOf(' ', maxindex+1) != -1) {

            if (s.indexOf(' ', maxindex+1) - maxindex == 1) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 1;
            }

            maxindex = s.indexOf(' ', maxindex+1);
        }
        return maxCount;

    }
}
