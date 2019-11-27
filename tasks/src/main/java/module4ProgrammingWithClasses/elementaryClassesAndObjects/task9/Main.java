package module4ProgrammingWithClasses.elementaryClassesAndObjects.task9;

import static module4ProgrammingWithClasses.Service.getLongValue;
import static module4ProgrammingWithClasses.Service.getStringValueWithoutNumbers;


/**
 * Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и
 * get- методы и метод toString(). Создать второй класс, агрегирующий массив типа Book, с
 * подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 * Найти и вывести:
 * a) список книг заданного автора;
 * b) список книг, выпущенных заданным издательством;
 * c) список книг, выпущенных после заданного года.
 */
public class Main {

    public static void main(String[] args) {

        int choice;

        BookUtils booksUtils = new BookUtils();

        String infoChoice = "\nInput number:\n" +
                "1- create and add new book\n" +
                "2- get all books\n" +
                "3- list of books by specified author\n" +
                "4- list of books published by specified publishing\n" +
                "5- list of books published after specified year\n" +
                "other- exit";

        while (true) {

            choice = (int) getLongValue(infoChoice);

            switch (choice) {
                case 1:
                    String paramTitle = getStringValueWithoutNumbers("Input title of book");
                    int paramCountAuthors = (int) getLongValue("Input number of authors");
                    String paramPublishing = getStringValueWithoutNumbers("Input publishing book");
                    int paramPublishingYear = (int) getLongValue("Input publishing year book");
                    int paramNumberOfPages = (int) getLongValue("Input number pages by book");
                    int paramPrice = (int) getLongValue("Input price book");
                    String paramTypeOfBinding = getStringValueWithoutNumbers("Input type of binding book");

                    String[] paramAuthors = new String[paramCountAuthors];

                    for (int i = 0; i < paramCountAuthors; i++) {
                        paramAuthors[i] = getStringValueWithoutNumbers("" + "Input author of book " + i);

                    }

                    booksUtils.add(new Book(paramTitle, paramAuthors, paramPublishing, paramPublishingYear,
                            paramNumberOfPages, paramPrice, paramTypeOfBinding));

                    break;

                case 2:
                    System.out.println("All books:");
                    BookUtils.print(booksUtils.getBooks());

                    break;

                case 3:
                    BookUtils.print(booksUtils.listOfBooksByAuthor(getStringValueWithoutNumbers("Specify the author")));
                    break;

                case 4:
                    BookUtils.print(booksUtils.listOfBooksByPublishing(getStringValueWithoutNumbers("Specify the publishing")));

                    break;
                case 5:
                    BookUtils.print(booksUtils.listOfBooksRealeasedAfterSpecifiedYear((int) getLongValue("Specify the published year")));


                default:

                    System.exit(0);
                    break;


            }
        }


    }


}
