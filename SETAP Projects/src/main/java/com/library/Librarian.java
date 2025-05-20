package com.library;

import java.util.Vector;

public class Librarian {
    private String name;
    private Integer employeeId;
    private Vector<Book> bookCatalog;

    public Librarian(String name, Integer employeeId) {
        this.name = name;
        this.employeeId = employeeId;
        this.bookCatalog = new Vector<>();
    }

    public void addBook(Book b) {
        bookCatalog.add(b);
    }

    public void removeBook(Book b) {
        bookCatalog.remove(b);
    }

    public Vector<Book> getAllBook() {
        return bookCatalog;
    }
}