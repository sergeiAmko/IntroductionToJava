package module4ProgrammingWithClasses.elementaryClassesAndObjects.task9;

import module4ProgrammingWithClasses.elementaryClassesAndObjects.task8.Customer;

public class BookUtils {

    private Book[] books;
    private int count = 0;

    public BookUtils() {
        books = new Book[16];
    }

    public Book[] getBooks() {
        return books;
    }

    public void add(Book book) {
        if (count == books.length) {
            Book[] middleBooks = new Book[books.length * 2];

            for (int i = 0; i < books.length; i++) {
                middleBooks[i] = books[i];
            }

            books = middleBooks;

        }

        books[count++] = book;
    }



    public Book[] listOfBooksByAuthor(String searchAuthor) {

        int countSearchBooks=0;
        Book[] searchedBooks=new Book[count];
        Book[] outBooks;

        for (int i = 0; i < count; i++) {
            String[] authors = books[i].getAuthors();

            for (int j = 0; j < authors.length; j++) {
                if (authors[j].equals(searchAuthor)){
                    searchedBooks[countSearchBooks++]=books[i];
                    break;
                }

            }
        }

        outBooks=new Book[countSearchBooks];

        for (int i = 0; i < countSearchBooks; i++) {
            outBooks[i]=searchedBooks[i];

        }

        return outBooks;
    }

    public Book[] listOfBooksByPublishing(String searchPublishing){


        int countSearchBooks=0;
        Book[] searchedBooks=new Book[count];
        Book[] outBooks;

        for (int i = 0; i < count; i++) {

            if (books[i].getPublishing().equals(searchPublishing)){
                searchedBooks[countSearchBooks++]=books[i];
            }

        }

        outBooks=new Book[countSearchBooks];

        for (int i = 0; i < countSearchBooks; i++) {
            outBooks[i]=searchedBooks[i];

        }

        return outBooks;
    }

    public Book[] listOfBooksRealeasedAfterSpecifiedYear(int specifiedYear){

        int countSearchBooks=0;
        Book[] searchedBooks=new Book[count];
        Book[] outBooks;

        for (int i = 0; i < count; i++) {

            if (books[i].getPublicationYear()>specifiedYear){
                searchedBooks[countSearchBooks++]=books[i];
            }
        }

        outBooks=new Book[countSearchBooks];

        for (int i = 0; i < countSearchBooks; i++) {
            outBooks[i]=searchedBooks[i];

        }

        return outBooks;
    }

    public static void print(Book[] books) {
        if (books != null) {

            for (int i = 0; i < books.length; i++) {
                if (books[0]==null){
                    System.out.println("List is empty");
                    return;
                }else if (books[i]==null){
                    return;
                }else {
                    System.out.println(books[i]);
                }
            }
        }else {
            System.out.println("List books is empty\n");
        }
    }


}
