package module3StringsAndBasicsOfTextProcessing.stringIsObject;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        String s = "Input string";
        String a = getString(s);

        System.out.println(isPalindrom(a));

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

    private static boolean isPalindrom(String s){
        return s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
    }
}
