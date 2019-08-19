package module3StringsAndBasicsOfTextProcessing.stringIsObject;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        String a = "Input string";
        String s = getString(a);

        char countingLetter='a';

        System.out.println(countCharacherInLine(s,countingLetter));
    }

    private static int countCharacherInLine(String stringToCount,char characterCount){
        int count=0;
        for (char c:stringToCount.toCharArray()) {
            if (c==characterCount){
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
