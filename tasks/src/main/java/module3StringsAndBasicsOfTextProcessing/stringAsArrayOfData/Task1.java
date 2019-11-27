package module3StringsAndBasicsOfTextProcessing.stringAsArrayOfData;

import java.util.Arrays;

import static module3StringsAndBasicsOfTextProcessing.Service.getArrayString;


/**
 * Дан массив названий переменных в camelCase. Преобразовать названия в snake_case
 */
public class Task1 {

    public static void main(String[] args) {
        String[] a;
        String s = "Input string";

        a = getArrayString(s);
        System.out.println(Arrays.toString(transformArrayFromCamelCaseToSnake_case(a)));
    }

    private static String fromCamelCaseToSnake_case(String s) {
        char[] chars = s.toCharArray();
        char[] outChars;
        int countUpperCase = 0;

        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                countUpperCase++;
            }

        }

        outChars = new char[chars.length + countUpperCase];


        for (int i = 0, j = 0; i < chars.length; i++, j++) {
            if (i == 0) {
                outChars[j] = chars[i];
                continue;
            }
            if (Character.isUpperCase(chars[i])) {
                outChars[j] = '_';
                j++;
                outChars[j] = Character.toLowerCase(chars[i]);
            } else {
                outChars[j] = chars[i];
            }
        }
        chars = outChars;

        return new String(chars);
    }

    private static String[] transformArrayFromCamelCaseToSnake_case(String[] strings) {

        for (int i = 0; i < strings.length; i++) {
            strings[i] = fromCamelCaseToSnake_case(strings[i]);
        }

        return strings;
    }


}
