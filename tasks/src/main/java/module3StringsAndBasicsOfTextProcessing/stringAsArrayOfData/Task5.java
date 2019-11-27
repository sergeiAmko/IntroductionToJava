package module3StringsAndBasicsOfTextProcessing.stringAsArrayOfData;

import static module3StringsAndBasicsOfTextProcessing.Service.getString;


/**
 * Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов, заменить
 * на одиночные пробелы. Крайние пробелы в строке удалить
 */
public class Task5 {
    public static void main(String[] args) {
        String s = "Input string";
        String a = getString(s);

        System.out.println((removeExtraSpaces(a)));
    }


    private static String removeExtraSpaces(String s) {
        char[] chars = s.toCharArray();
        char[] charsMiddle = new char[chars.length];
        char[] charsOut;
        int j = 0;

        for (int i = 0; i < chars.length; i++, j++) {
            if (i == 0 && !Character.isSpaceChar(chars[i]) ||
                    i == chars.length - 1 && !Character.isSpaceChar(chars[i])) {
                charsMiddle[j] = chars[i];
            } else if (Character.isSpaceChar(chars[i])) {
                if (i != 0 && i != chars.length - 1) {
                    charsMiddle[j] = chars[i];
                }
                i++;
                while (i < chars.length) {
                    if (!Character.isSpaceChar(chars[i])) {
                        i--;
                        break;
                    }
                    i++;
                }

            } else {
                charsMiddle[j] = chars[i];
            }
        }
        if (Character.isSpaceChar(charsMiddle[j - 1])) {
            j--;
        }

        charsOut = new char[j];
        for (int i = 0; i < j; i++) {
            charsOut[i] = charsMiddle[i];
        }
        return new String(charsOut);
    }

}
