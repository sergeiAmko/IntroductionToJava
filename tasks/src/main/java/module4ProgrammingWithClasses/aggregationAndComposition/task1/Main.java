package module4ProgrammingWithClasses.aggregationAndComposition.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int choice;
        String infoTitle = "Input title the text";
        String infoMenu = "\nInput the number:\n" +
                "1-add sentence\n" +
                "2-print text\n" +
                "3-print title\n" +
                "other- exit";
        String infoCountWordsInSentence = "Input the number of words";
        String infoWord = "Input the word";

        Text text = new Text(getStringValue(infoTitle));

        while (true) {

            choice = (int) getLongValue(infoMenu);

            switch (choice) {
                case 1:
                    int count = (int) getLongValue(infoCountWordsInSentence);
                    Sentence sentence = new Sentence();
                    for (int i = 0; i < count; i++) {
                        sentence.add(new Word(getStringValue(infoWord)));
                    }

                    text.add(sentence);


                    break;

                case 2:
                    System.out.println(text);

                    break;

                case 3:

                    System.out.println(text.getTitle());
                    break;

                default:

                    System.exit(0);
                    break;


            }
        }


    }

    private static long getLongValue(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);

        while (true) {
            long a;
            if (scanner.hasNextLong()) {
                a = scanner.nextLong();
                return a;
            } else if (scanner.hasNext()) {
                System.out.println("You have entered an invalid number, input real number");
                scanner.next();
            }
        }

    }

    private static String getStringValue(String message) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(message);

        while (true) {
            if (scanner.hasNext("\\D+")) {
                return scanner.next("\\D+");
            } else {
                System.out.println("You have entered an invalid string, input string only letters");
                scanner.next();
            }
        }
    }
}
