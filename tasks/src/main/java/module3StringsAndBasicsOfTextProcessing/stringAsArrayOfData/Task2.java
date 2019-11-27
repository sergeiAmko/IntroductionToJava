package module3StringsAndBasicsOfTextProcessing.stringAsArrayOfData;

import static module3StringsAndBasicsOfTextProcessing.Service.getString;


/**
 * замените в строке все вхождения 'word' на 'letter'
 */
public class Task2 {

    public static void main(String[] args) {

        String s = "Input string";
        String a = getString(s);

        System.out.println((changeLine(a)));

    }


    private static String changeLine(String s) {
        char[] a = s.toCharArray();
        char[] b = new char[a.length * 2];
        int count = 0;
        char[] replacingCharArray = "letter".toCharArray();
        char[] out;

        for (int i = 0, j = 0; i < a.length; i++, j++) {
            if (Character.toLowerCase(a[i]) == 'w' &&
                    Character.toLowerCase(a[i + 1]) == 'o' &&
                    Character.toLowerCase(a[i + 2]) == 'r' &&
                    Character.toLowerCase(a[i + 3]) == 'd') {
                for (int k = 0; k < replacingCharArray.length; k++) {
                    b[k + j] = replacingCharArray[k];
                    count++;
                }
                j += 5;
                i += 3;
                count++;
            } else {
                b[j] = a[i];
                count++;
            }
        }

        out = new char[count];

        for (int i = 0; i < count; i++) {
            out[i] = b[i];
        }


        return new String(out);
    }
}
