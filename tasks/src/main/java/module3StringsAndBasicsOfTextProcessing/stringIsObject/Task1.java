package module3StringsAndBasicsOfTextProcessing.stringIsObject;

import static module3StringsAndBasicsOfTextProcessing.Service.getString;


/**
 * Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 */
public class Task1 {
    public static void main(String[] args) {

        String s = "Input string";
        String a = getString(s);

        System.out.println("Maximum number of consecutive spaces= " + countConsecutiveGaps(a));
    }


    private static int countConsecutiveGaps(String s) {

        int maxIndex = 0;
        int maxCount = 0;
        int count = 1;

        while (s.indexOf(' ', maxIndex + 1) != -1) {

            if (s.indexOf(' ', maxIndex + 1) - maxIndex == 1) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 1;
            }

            maxIndex = s.indexOf(' ', maxIndex + 1);
        }
        return maxCount;

    }
}
