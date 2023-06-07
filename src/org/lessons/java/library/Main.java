package org.lessons.java.library;

//IMPORT
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //apro lo scanner
        Scanner scan = new Scanner(System.in);

        //creo un array per contenere i libri
        //decido che conterrà 5 libri
        Book[] catalogue = new Book[2];

        //entro nel ciclo
        for (int i = 0; i < catalogue.length; i++) {

            System.out.println("------- " + (i + 1) + "° LIBRO -------");

            //preparo la variabile che conterrà il libro
            Book book = null;

            //inizializzo una flag
            boolean valid = false;

            //entro in un ciclo do while avanzare solamente se il dato è valido
            do {
                //chiedo il titolo
                System.out.print("Inserisci il titolo: ");
                String title = scan.nextLine();
                //chiedo il numero di pagine
                System.out.print("inserisci il numero di pagine: ");
                int pages = Integer.parseInt(scan.nextLine());
                //chiedo l'autore
                System.out.print("inserisci il nome dell'autore: ");
                String author = scan.nextLine();
                //chiedo l'editore
                System.out.print("inserisci il nome dell'editore: ");
                String publisher = scan.nextLine();

                //provo a creare un'istanza di Book e gestisco eventuali messaggi d'errore
                try {
                    book = new Book(title, pages, author, publisher);
                    //se la riga di sopra non lancia eccezioni cambio la flag
                    valid = true;
                } catch (RuntimeException e) { //nel caso in cui una delle stringhe fosse vuota
                    System.out.println(e.getMessage());
                }

            } while (!valid);

            //inserisco il libro nel catalogo
            catalogue[i] = book;

        }//chiusura for

        //mostro l'array
        for (int i = 0; i < catalogue.length; i++) {
            System.out.println("-- " + (i + 1) + " libro --");
            System.out.println(catalogue[i].toString());
        }

        //chiudo lo scanner
        scan.close();

    }
}
