package module3StringsAndBasicsOfTextProcessing.stringIsObject;

import static module3StringsAndBasicsOfTextProcessing.Service.getString;


/**
 * Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например,
 * если было введенр "abc cde def", то должно быть выведено "abcdef".
 */
public class Task7 {
    public static void main(String[] args) {
        String a = "Input string";
        String s = getString(a);

        System.out.println("Line without duplicate- " + removeDuplicateItems(s));

    }


    private static String removeDuplicateItems(String stringInRemove) {
        StringBuilder stringBuilder = new StringBuilder(stringInRemove.trim().replaceAll(" ", ""));

        for (Character c : stringInRemove.toCharArray()) {
            while (stringBuilder.indexOf(c.toString()) != stringBuilder.lastIndexOf(c.toString())) {
                stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(c.toString()));
            }
        }
        return stringBuilder.toString();
    }
}
