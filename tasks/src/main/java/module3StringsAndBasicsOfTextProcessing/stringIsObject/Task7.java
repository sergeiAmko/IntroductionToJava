package module3StringsAndBasicsOfTextProcessing.stringIsObject;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        String a = "Input string";
        String s = getString(a);

        System.out.println(removeDublicateItems(s));

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

    private static String removeDublicateItems(String stringInRemove){
        StringBuilder stringBuilder=new StringBuilder(stringInRemove.trim().replaceAll(" ",""));

        for (Character c:stringInRemove.toCharArray()) {
            while (stringBuilder.indexOf(c.toString())!=stringBuilder.lastIndexOf(c.toString())){
                stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(c.toString()));
            }
        }
        return stringBuilder.toString();
    }
}
