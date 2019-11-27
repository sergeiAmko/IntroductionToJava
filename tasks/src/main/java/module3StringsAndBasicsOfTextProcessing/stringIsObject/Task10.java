package module3StringsAndBasicsOfTextProcessing.stringIsObject;

import static module3StringsAndBasicsOfTextProcessing.Service.getString;


/**
 * Строка X состоит из нескольких предложений, каждое из которых кончается точкой,
 * восклицательным или вопросительным знаком. Определить количество предложений в строке X
 */
public class Task10 {
    public static void main(String[] args) {
        String a = "Input string";
        String s = getString(a);

        System.out.println("count of sentences in line= " + countSentencesInString(s));


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
