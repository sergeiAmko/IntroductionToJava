package module3StringsAndBasicsOfTextProcessing.stringIsObject;

import static module3StringsAndBasicsOfTextProcessing.Service.getString;


/**
 * Вводится строка слов, разделенных пробелами. Найти самое длинное слово
 * и вывести его на экран. Случай, когда самых длинных слов может быть несколько,
 * не обрабатывать
 */
public class Task8 {
    public static void main(String[] args) {
        String a = "Input string";
        String s = getString(a);

        System.out.println("The longest word- " + theLongestWord(s));
    }

    private static String theLongestWord(String stringInput) {
        int maxLength = 0;
        String masWord;
        String[] strings = stringInput.trim().split(" ");

        masWord = strings[0];

        for (String s : strings) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                masWord = s;
            }
        }

        return masWord;

    }
}
