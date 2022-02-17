package com.akanahmet.object_orianted_programming.association.composition;

import java.io.Serializable;

public class Book implements Serializable {

    private String bookName;
    private Library library;


    public Book() {
    }

    public Book(String bookName) {
        this.bookName = bookName;
    }


    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }


    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                '}';
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }
}
