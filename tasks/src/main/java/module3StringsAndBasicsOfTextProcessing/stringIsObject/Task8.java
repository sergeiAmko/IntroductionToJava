package module3StringsAndBasicsOfTextProcessing.stringIsObject;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        String a = "Input string";
        String s = getString(a);

        System.out.println(theLongestWord(s));


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

    private static String theLongestWord(String stringInput){
        int maxLength=0;
        String masWord;
        String[] strings=stringInput.trim().split(" ");

        masWord=strings[0];

        for (String s:strings) {
            if (s.length()>maxLength){
                maxLength=s.length();
                masWord=s;
            }
        }

        return masWord;

    }
}
