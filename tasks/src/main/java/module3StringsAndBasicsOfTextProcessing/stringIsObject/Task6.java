package module3StringsAndBasicsOfTextProcessing.stringIsObject;

import static module3StringsAndBasicsOfTextProcessing.Service.getString;


/**
 * Из заданной строки получить новую, повторив каждый символ дважды.
 */
public class Task6 {
    public static void main(String[] args) {
        String a = "Input string";
        String s = getString(a);

        System.out.println("New string- " + doubleEachLetter(s));

    }


    private static String doubleEachLetter(String s) {
        StringBuilder stringBuilder = new StringBuilder();

        for (char c : s.toCharArray()) {
            stringBuilder.append(c).append(c);
        }
        return stringBuilder.toString();
    }
}
