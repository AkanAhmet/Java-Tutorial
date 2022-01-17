package com.akanahmet.object_orianted_programming.composition_and_association.composition;

import java.util.ArrayList;

// inheritance = is-a
// interface = can-do
// composition = has-a

public class CompositionMainTest {

    public static void main(String[] args)  {

        Library library = new Library("Ankara");
        library.setBookList(new ArrayList<Book>());

        Book book = new Book("Composition on Java");
        book.setLibrary(library);
        book.getLibrary().getBookList().add(book);

        Book book2 = new Book("Composition on Java 2");
        book2.setLibrary(library);
        book2.getLibrary().getBookList().add(book2);

        Book book3 = new Book("Composition on Java 3");
        book3.setLibrary(library);
        book3.getLibrary().getBookList().add(book3);

        System.out.println(library);

        for( Book temp : book3.getLibrary().getBookList() ) {
            System.out.println(temp);
        }

    }
}
