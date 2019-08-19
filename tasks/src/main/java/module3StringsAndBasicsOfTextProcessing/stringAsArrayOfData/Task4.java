package module3StringsAndBasicsOfTextProcessing.stringAsArrayOfData;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String s = "Input string";
        String a = getString(s);

        System.out.println((countNumbersInLine(a)));
    }

    private static int countNumbersInLine(String s) {
        char[] sChars = s.toCharArray();
        int count = 0;

        for (int i = 0; i < sChars.length; i++) {
            if (isDigits(sChars[i])){
                i++;
                while (i<sChars.length){
                    if (!isDigits(sChars[i])){
                        break;
                    }
                    i++;
                }
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

    private static boolean isDigits(char c){
        return Character.isDigit(c);
    }
}
