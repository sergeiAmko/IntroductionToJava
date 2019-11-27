package module3StringsAndBasicsOfTextProcessing.stringAsArrayOfData;

import static module3StringsAndBasicsOfTextProcessing.Service.getString;


/**
 * В строке найти количество чисел
 */
public class Task4 {
    public static void main(String[] args) {
        String s = "Input string";
        String a = getString(s);

        System.out.println("Number of numbers= " + countNumbersInLine(a));
    }

    private static int countNumbersInLine(String s) {
        char[] sChars = s.toCharArray();
        int count = 0;

        for (int i = 0; i < sChars.length; i++) {
            if (isDigits(sChars[i])) {
                i++;
                while (i < sChars.length) {
                    if (!isDigits(sChars[i])) {
                        break;
                    }
                    i++;
                }
                count++;
            }
        }

        return count;
    }


    private static boolean isDigits(char c) {
        return Character.isDigit(c);
    }
}
