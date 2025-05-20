package com.library;

import java.util.Vector;

public class Author {
    private String name;
    private Vector<Book> myBooks;

    public Author(String name) {
        this.name = name;
        myBooks = new Vector<Book>();
    }

    public String getName() {
        return name;
    }

    public void addBook(Book book) {
        if (book != null && !myBooks.contains(book)) {
            myBooks.add(book);
        }
    }

    public Vector<Book> getOtherWorks(Book book) {
        Vector<Book> result = new Vector<Book>();

        for (Book b : myBooks) {
            if (b != null && !b.equals(book)) {
                result.add(b);
            }
        }

        return result;
    }

    public Vector<Book> getBooks() {
        return myBooks;
    }
}