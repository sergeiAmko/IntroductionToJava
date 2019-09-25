package module4ProgrammingWithClasses.elementaryClassesAndObjects.task9;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int choice, inner;

        BookUtils booksUtils = new BookUtils();

        String infoChoice = "\nInput number:\n" +
                "1- create and add new book\n" +
                "2- get all books\n" +
                "3- list of books by specified author\n" +
                "4- list of books published by specified publishing\n" +
                "5- list of books published after specified year\n" +
                "other- exit";

        String infoTitle = "Input title of book";
        String infoCountAuthors = "Input number of authors";
        String infoAuthor = "Input author of book ";
        String infoPublishing = "Input publishing book";
        String infoPublicationYear = "Input publishing year book";
        String infoNumberOfPages = "Input number pages by book";
        String infoPrice = "Input price book";
        String infoTypeOfBinding = "Input type of binding book";

        String infoSpecifyAuthor = "Specify the author";
        String infoSpecifyPublishing = "Specify the publishing";
        String infoAfterPublishedYear = "Specify the published year";


        while (true) {

            choice = (int) getLongValue(infoChoice);

            switch (choice) {
                case 1:
                    String paramTitle = getStringValue(infoTitle);
                    int paramCountAuthors = (int) getLongValue(infoCountAuthors);
                    String paramPublishing = getStringValue(infoPublishing);
                    int paramPublishingYear = (int) getLongValue(infoPublicationYear);
                    int paramNumberOfPages = (int) getLongValue(infoNumberOfPages);
                    int paramPrice = (int) getLongValue(infoPrice);
                    String paramTypeOfBinding = getStringValue(infoTypeOfBinding);

                    String[] paramAuthors = new String[paramCountAuthors];

                    for (int i = 0; i < paramCountAuthors; i++) {
                        paramAuthors[i] = getStringValue("" + infoAuthor + i);

                    }

                    booksUtils.add(new Book(paramTitle, paramAuthors, paramPublishing, paramPublishingYear,
                            paramNumberOfPages, paramPrice, paramTypeOfBinding));

                    break;

                case 2:
                    System.out.println("All books:");
                    BookUtils.print(booksUtils.getBooks());

                    break;

                case 3:
                    BookUtils.print(booksUtils.listOfBooksByAuthor(getStringValue(infoSpecifyAuthor)));
                    break;

                case 4:
                    BookUtils.print(booksUtils.listOfBooksByPublishing(getStringValue(infoSpecifyPublishing)));

                    break;
                case 5:
                    BookUtils.print(booksUtils.listOfBooksRealeasedAfterSpecifiedYear((int) getLongValue(infoAfterPublishedYear)));


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
            if (scanner.hasNextLong()) {
                return scanner.nextLong();
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
