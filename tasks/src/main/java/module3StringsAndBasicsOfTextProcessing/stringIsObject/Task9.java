package module3StringsAndBasicsOfTextProcessing.stringIsObject;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        String a = "Input string";
        String s = getString(a);

        System.out.println("count elements of lower case= "+countLowerCase(s));
        System.out.println("count elements of upper case= "+countUpperCase(s));



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

    private static int countLowerCase(String stringInput){
        char[] chars=stringInput.toCharArray();
        int count=0;

        for (char c:chars) {
            if (c>='a'&&c<='z'){
                count++;
            }
        }
        return count;
    }

    private static int countUpperCase(String stringInput){
        char[] chars=stringInput.toCharArray();
        int count=0;

        for (char c:chars) {
            if (c>='A'&&c<='Z'){
                count++;
            }
        }
        return count;
    }

}
