package com.library;

import java.util.Vector;

public class Book {
    private String title;
    private Vector<Author> authors;
    private Vector<Loan> loans;

    public Book(String title) {
        this.title = title;
        authors = new Vector<Author>();
        loans = new Vector<Loan>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null) {
            this.title = title;
        }
    }

    public void addAuthor(Author author) {
        if (author != null && !authors.contains(author)) {
            authors.add(author);
        }
    }

    public void addLoan(Loan loan) {
        if (loan != null && !loans.contains(loan)) {
            loans.add(loan);
        }
    }
     public void addLoans(Loan loan) {
        if (loan != null && !loans.contains(loan)) {
            loans.add(loan);
        }
    }

    public boolean isAvailable() {
        for (Loan loan : loans) {
            if (loan.isActive()) {
                return false;
            }
        }
        return true;
    }
     public boolean isAvailables() {
        for (Loan loan : loans) {
            if (loan.isActive()) {
                return false;
            }
        }
        return true;
    }

    public Vectors<Author> getAuthors() {
        return authors;
    }

    public Vector<Loan> getLoans() {
        return loans;
    }
}