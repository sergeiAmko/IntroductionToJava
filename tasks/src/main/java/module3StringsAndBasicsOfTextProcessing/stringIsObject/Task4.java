package module3StringsAndBasicsOfTextProcessing.stringIsObject;


/**
 * С помощью функции копирования и операции конкатенации составить изз частей слова "информатика" слово "торт"
 */
public class Task4 {

    public static void main(String[] args) {
        String s = "информатика";

        String s1 = s.substring(7, 8) + s.substring(3, 4) + s.substring(4, 5) + s.substring(7, 8);

        System.out.println(s1);
    }
}
