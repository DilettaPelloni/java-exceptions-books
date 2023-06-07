package org.lessons.java.library;

public class Book {

    //ATTRIBUTI
    private String title;
    private int pages;
    private String author;
    private String publisher;

    //COSTRUTTORE
    public Book(String title, int pages, String author, String publisher) {
        //valido il titolo
        isStringInputValid(title);
        this.title = title;

        this.pages = pages;
        //valido il l'autore
        isStringInputValid(author);
        this.author = author;
        //valido il l'editor
        isStringInputValid(publisher);
        this.publisher = publisher;
    }

    //GETTERS
    public String getTitle() {
        return title;
    }
    public int getPages() {
        return pages;
    }
    public String getAuthor() {
        return author;
    }
    public String getPublisher() {
        return publisher;
    }

    //SETTERS

    //METODI
    private boolean isStringInputValid(String input) throws InvalidStringInput {
        if (input != null && !(input.equals(""))) {
            return true;
        }
        throw new InvalidStringInput();
    }

}
