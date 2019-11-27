package module3StringsAndBasicsOfTextProcessing.stringIsObject;

import static module3StringsAndBasicsOfTextProcessing.Service.getStringValue;


/**
 * Проверить, является ли заданное слово палиндромом
 */
public class Task3 {
    public static void main(String[] args) {

        String s = "Input string";
        String a = getStringValue("Input word= " + s);

        System.out.println(isPalindrome(a));

    }


    private static boolean isPalindrome(String s) {
        return s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
    }
}
