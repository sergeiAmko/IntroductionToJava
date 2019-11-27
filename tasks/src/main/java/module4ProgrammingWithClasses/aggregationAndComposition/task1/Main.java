package module4ProgrammingWithClasses.aggregationAndComposition.task1;

import static module2Algorithmization.Service.getIntValue;
import static module4ProgrammingWithClasses.Service.getStringValueWithoutNumbers;


/**
 * Создать объект класса Текст, используя классы Предложение, Слово.
 * Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */
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

        Text text = new Text(getStringValueWithoutNumbers(infoTitle));

        while (true) {

            choice = getIntValue(infoMenu);

            switch (choice) {
                case 1:
                    int count = getIntValue(infoCountWordsInSentence);
                    Sentence sentence = new Sentence();
                    for (int i = 0; i < count; i++) {
                        sentence.add(new Word(getStringValueWithoutNumbers(infoWord)));
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


}
