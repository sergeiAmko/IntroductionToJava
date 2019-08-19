package module3StringsAndBasicsOfTextProcessing.stringAsArrayOfData;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        String s = "Input string";
        String a = getString(s);

        System.out.println((countDigitsInLine(a)));
    }

    private static int countDigitsInLine(String s) {
        char[] sChars = s.toCharArray();
        int count = 0;

        for (char k : sChars) {
            if (Character.isDigit(k)) {
                count++;
            }
        }
        return count;
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

}
