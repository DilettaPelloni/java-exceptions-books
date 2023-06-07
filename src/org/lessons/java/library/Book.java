package org.lessons.java.library;

public class Book {

    //ATTRIBUTI
    private String title;
    private int pages;
    private String author;
    private String publisher;

    //COSTRUTTORE
    public Book(String title, int pages, String author, String publisher) throws RuntimeException {
        //valido il titolo
        if(isStringInputValid(title)) {
            this.title = title;
        } else {
            throw new RuntimeException("Il campo titolo è obbligatorio e non può contenere solo spazi");
        }

        //valido il numero di pagine
        if (isPageInputValid(pages)) {
            this.pages = pages;
        } else {
            throw new RuntimeException("Il numero di pagine deve essere maggiore di zero");
        }

        //valido l'autore
        if(isStringInputValid(author)) {
            this.author = author;
        } else {
            throw new RuntimeException("Il campo autore è obbligatorio e non può contenere solo spazi");
        }

        //valido l'editor
        if(isStringInputValid(publisher)) {
            this.publisher = publisher;
        } else {
            throw new RuntimeException("Il campo editore è obbligatorio e non può contenere solo spazi");
        }
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
    public void setTitle(String title) throws RuntimeException {
        if(isStringInputValid(title)) {
            this.title = title;
        } else {
            throw new RuntimeException("Il campo titolo è obbligatorio e non può contenere solo spazi");
        }
    }
    public void setPages(int pages) throws RuntimeException {
        if (isPageInputValid(pages)) {
            this.pages = pages;
        } else {
            throw new RuntimeException("Il numero di pagine deve essere maggiore di zero");
        }
    }
    public void setAuthor(String author) throws RuntimeException {
        if(isStringInputValid(author)) {
            this.author = author;
        } else {
            throw new RuntimeException("Il campo titolo è obbligatorio e non può contenere solo spazi");
        }
    }
    public void setPublisher(String publisher) throws RuntimeException {
        if(isStringInputValid(publisher)) {
            this.publisher = publisher;
        } else {
            throw new RuntimeException("Il campo titolo è obbligatorio e non può contenere solo spazi");
        }
    }

    //METODI
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    //metodi di verifica - sono statici così posso utilizzarli al di fuori della classe
    public static boolean isStringInputValid(String input) {
        return input != null && !input.isBlank();
    }

    public static boolean isPageInputValid(int input) {
        return input > 0;
    }

}
