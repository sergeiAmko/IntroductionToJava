package module3StringsAndBasicsOfTextProcessing.stringIsObject;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        String a = "Input string";
        String s = getString(a);

        System.out.println(doubleEachLetter(s));

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

    private static String doubleEachLetter(String s){
        StringBuilder stringBuilder=new StringBuilder();

        for (char c:s.toCharArray()) {
            stringBuilder.append(c).append(c);
        }
        return stringBuilder.toString();
    }
}
