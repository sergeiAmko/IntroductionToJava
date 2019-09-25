package module4ProgrammingWithClasses.elementaryClassesAndObjects.task9;

import java.util.Arrays;

public class Book {

    private static long countId = 0;

    private long id;
    private String title;
    private String[] authors;
    private String publishing;
    private int publicationYear;
    private int numberOfPages;
    private double price;
    private String typeOfBinding;

    public Book(String title, String[] authors, String publishing, int publicationYear,
                int numberOfPages, double price, String typeOfBinding) {
        this.id = countId++;
        this.title = title;
        this.authors = authors;
        this.publishing = publishing;
        this.publicationYear = publicationYear;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.typeOfBinding = typeOfBinding;
    }


    @Override
    public String toString() {
        return "id=" + id +
                ", title='" + title + '\'' +
                ", authors='" + Arrays.toString(authors) + '\'' +
                ", publishing='" + publishing + '\'' +
                ", publicationYear=" + publicationYear +
                ", numberOfPages=" + numberOfPages +
                ", price=" + price +
                ", typeOfBinding='" + typeOfBinding + '\n';
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTypeOfBinding() {
        return typeOfBinding;
    }

    public void setTypeOfBinding(String typeOfBinding) {
        this.typeOfBinding = typeOfBinding;
    }


}
