package com.akanahmet.object_orianted_programming.composition_and_association.composition;

import java.io.Serializable;
import java.util.List;

public class Library implements Serializable {


    private String LibraryName;
    private List<Book> bookList; // Book must be in the same package

    public Library() {
    }

    public Library(String LibraryName) {
        this.LibraryName = LibraryName;
    }

    public String getLibraryName() {
        return LibraryName;
    }

    public void setLibraryName(String libraryName) {
        this.LibraryName = libraryName;
    }

    @Override
    public String toString() {
        return "Library{" +
                "libraryName='" + LibraryName + '\'' +
                '}';
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
/*

    The composition is a design technique in java to implement a has-a relationship.
Java Inheritance is used for code reuse purposes and the same we can do by using composition.
The composition is achieved by using an instance variable that refers to other objects.
If an object contains the other object and the contained object cannot exist without the existence of that object,
then it is called composition. In more specific words composition is a way of describing reference between
two or more classes using instance variable and an instance should be created before it is used.
    It represents a has-a relationship.
In composition, both entities are dependent on each other.
When there is a composition between two entities, the composed object cannot exist without the other entity.
For example, A library can have no. of books on the same or different subjects.
So, If the Library gets destroyed then All books within that particular library will be destroyed.
This is the books can not exist without a library.
The composition is achieved by using an instance variable that refers to other objects.
We have to favor Composition over Inheritance.
    Real-life Example: Library system
Let’s understand the composition in Java with the example of books and library.
In this example, we create a class Book that contains data members like author,
and title and create another class Library that has a reference to refer to the list of books.
A library can have no. of books on the same or different subjects.
So, If the Library gets destroyed then All books within that particular library will be destroyed. i.e., books can not exist without a library.
The relationship between the library and books is composition.
 */