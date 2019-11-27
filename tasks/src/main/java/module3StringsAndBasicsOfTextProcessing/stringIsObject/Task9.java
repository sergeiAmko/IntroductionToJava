package module3StringsAndBasicsOfTextProcessing.stringIsObject;

import static module3StringsAndBasicsOfTextProcessing.Service.getString;


/**
 * Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной
 * строке. Учитывать только английские буквы
 */
public class Task9 {
    public static void main(String[] args) {
        String a = "Input string";
        String s = getString(a);

        System.out.println("count elements of lower case= " + countLowerCase(s));
        System.out.println("count elements of upper case= " + countUpperCase(s));


    }


    private static int countLowerCase(String stringInput) {
        char[] chars = stringInput.toCharArray();
        int count = 0;

        for (char c : chars) {
            if (c >= 'a' && c <= 'z') {
                count++;
            }
        }
        return count;
    }

    private static int countUpperCase(String stringInput) {
        char[] chars = stringInput.toCharArray();
        int count = 0;

        for (char c : chars) {
            if (c >= 'A' && c <= 'Z') {
                count++;
            }
        }
        return count;
    }

}
