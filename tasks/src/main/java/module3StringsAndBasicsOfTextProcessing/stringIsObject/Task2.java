package module3StringsAndBasicsOfTextProcessing.stringIsObject;

import static module3StringsAndBasicsOfTextProcessing.Service.getString;


/**
 * В строке вставить после каждого символа 'a' символ 'b'
 */
public class Task2 {
    public static void main(String[] args) {

        String s = "Input string";
        String a = getString(s);

        System.out.println(replaceFromAToAb(a));

    }


    private static String replaceFromAToAb(String s) {
        return s.replaceAll("a", "ab");
    }

}
