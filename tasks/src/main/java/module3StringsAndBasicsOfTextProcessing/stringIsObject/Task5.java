package module3StringsAndBasicsOfTextProcessing.stringIsObject;

import static module3StringsAndBasicsOfTextProcessing.Service.getString;


/**
 * Подсчитать, сколько раз среди символов заданной строки встречается буква "а".
 */
public class Task5 {
    public static void main(String[] args) {
        String a = "Input string";
        String s = getString(a);

        char countingLetter = 'a';

        System.out.println("Number 'a' in line= " + countCharacterInLine(s, countingLetter));
    }

    private static int countCharacterInLine(String stringToCount, char characterCount) {
        int count = 0;
        for (char c : stringToCount.toCharArray()) {
            if (c == characterCount) {
                count++;
            }
        }
        return count;
    }


}
