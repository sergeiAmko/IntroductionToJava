package module3StringsAndBasicsOfTextProcessing.regularExpression;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

    static String nameInput = "te.txt";
    static String paths = "tasks\\src\\main\\java\\";

    public static void main(String[] args) throws IOException {
        Path pathInputFile = Paths.get(paths, nameInput);
        Pattern patternOpening = Pattern.compile("<\\w*>");
        Pattern patternClosing = Pattern.compile("</\\w*>");


        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(
                new FileInputStream(pathInputFile.toString()), Charset.forName("windows-1251")));) {

            String row;

            while ((row = bufferedReader.readLine()) != null) {

                Matcher matcherOpening = patternOpening.matcher(row);
                Matcher matcherClosing = patternClosing.matcher(row);

                int endOpening = 0, startClosing = 0;

                if (matcherOpening.find()) {

                    endOpening = matcherOpening.end();
                    System.out.println("Открывающий тег: " + matcherOpening.group());
                }
                if (matcherClosing.find()) {

                    startClosing = matcherClosing.start();
                    if (endOpening < startClosing && endOpening != 0) {

                        System.out.println("содержание тега: " + row.substring(endOpening, startClosing));
                    }
                    System.out.println("закрывающий тег: " + matcherClosing.group());
                }

            }
        }
    }
}
