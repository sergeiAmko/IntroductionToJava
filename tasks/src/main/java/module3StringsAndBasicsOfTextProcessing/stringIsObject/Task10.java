package module3StringsAndBasicsOfTextProcessing.stringIsObject;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        String a = "Input string";
        String s = getString(a);

        System.out.println("count of sentences in line= " + countSentencesInString(s));


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

    private static int countSentencesInString(String stringLine) {
        String[] strings = stringLine.split("\\.");
        int count = 0;

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].contains("!")) {
                String[] sExclamationMark = strings[i].split("!");
                for (int j = 0; j < sExclamationMark.length; j++) {
                    if (sExclamationMark[j].contains("?")) {
                        String[] sQuestionMark = sExclamationMark[j].split("\\?");
                        for (int k = 0; k < sQuestionMark.length; k++) {
                            count++;
                        }
                    } else {
                        count++;
                    }
                }
            } else {
                count++;
            }
        }


        return count;
    }
}
