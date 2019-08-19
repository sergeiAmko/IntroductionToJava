package module3StringsAndBasicsOfTextProcessing.stringAsArrayOfData;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        String[] a;
        String s = "Input string";

        a = getArrayString(s);
        System.out.println(Arrays.toString(transformArrayfromCamelCaseToSnake_case(a)));
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

    private static String[] transformArrayfromCamelCaseToSnake_case(String[] strings) {

        for (int i = 0; i < strings.length; i++) {
            strings[i] = fromCamelCaseToSnake_case(strings[i]);
        }

        return strings;
    }

    private static int getIntValue(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else if (scanner.hasNext()) {
                System.out.println("You have entered an invalid number, input real number");
                scanner.next();
            }
        }

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


    private static String[] getArrayString(String message) {
        int n = 0;
        String[] a;
        String s = "Input the number of element in array string";

        while (n <= 0) {
            n = getIntValue(s);
        }
        a = new String[n];

        for (int i = 0; i < n; i++) {
            a[i] = getString(message);
        }
        return a;
    }

}
