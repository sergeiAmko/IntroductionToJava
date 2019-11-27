package module3StringsAndBasicsOfTextProcessing.stringAsArrayOfData;

import static module3StringsAndBasicsOfTextProcessing.Service.getString;


/**
 * В строке найти количество цифр
 */
public class Task3 {

    public static void main(String[] args) {
        String s = "Input string";
        String a = getString(s);

        System.out.println("Number of digits= " + countDigitsInLine(a));
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


}
