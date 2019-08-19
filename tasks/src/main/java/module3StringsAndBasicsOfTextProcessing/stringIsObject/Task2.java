package module3StringsAndBasicsOfTextProcessing.stringIsObject;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        String s = "Input string";
        String a = getString(s);

        System.out.println(replaceFromAToAb(a));

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

    private static String replaceFromAToAb(String s){
        return s.replaceAll("a","ab");
    }

}
