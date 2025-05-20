package com.library;

import java.util.Date;
import java.util.Vector;

public class LibrarySystem {
    private Vector<Book> books;
    private Vector<Member> members;
    private Vector<Author> authors;
    private Vector<Loan> loans;

    public LibrarySystem() {
        books = new Vector<Book>();
        members = new Vector<Member>();
        authors = new Vector<Author>();
        loans = new Vector<Loan>();

        initializeData();
    }

    private void initializeData() {
        Author author1 = new Author("J.K. Rowling");
        Author author2 = new Author("George Orwell");
        authors.add(author1);
        authors.add(author2);

        Book book1 = new Book("Harry Potter");
        Book book2 = new Book("1984");
        books.add(book1);
        books.add(book2);

        Member member1 = new Member("John Doe");
        Member member2 = new Member("Jane Smith");
        members.add(member1);
        members.add(member2);

        book1.addAuthor(author1);
        author1.addBook(book1);

        book2.addAuthor(author2);
        author2.addBook(book2);

        Date dueDate = new Date(System.currentTimeMillis() + 14 * 24 * 60 * 60 * 1000);
        Loan loan1 = new Loan(book1, member1, dueDate);
        loans.add(loan1);
    }

    public Vector<Book> getAvailableBooks() {
        Vector<Book> result = new Vector<Book>();
        for (Book book : books) {
            if (book.isAvailable()) {
                result.add(book);
            }
        }
        return result;
    }

    public void createLoan(Book book, Member member, Date dueDate) {
        if (book == null || member == null || dueDate == null) {
            throw new IllegalArgumentException("Book, member, and due date must not be null");
        }

        if (!book.isAvailable()) {
            throw new IllegalStateException("Book is not available for loan");
        }

        if (!members.contains(member)) {
            throw new IllegalStateException("Member is not registered in the system");
        }

        if (!member.canBorrow()) {
            throw new IllegalStateException("Member has reached the maximum number of active loans");
        }

        Loan loan = new Loan(book, member, dueDate);
        loans.add(loan);
    }

    public void returnBook(Loan loan) {
        if (loan != null && loan.isActive()) {
            loan.returnBook();
        }
    }

    // Getters for collections
    public Vector<Book> getBooks() {
        return books;
    }

    public Vector<Member> getMembers() {
        return members;
    }

    public Vector<Author> getAuthors() {
        return authors;
    }

    public Vector<Loan> getLoans() {
        return loans;
    }

    public static void main(String[] args) {
        LibrarySystem library = new LibrarySystem();
        System.out.println("Library System Initialized. Available Books: ");
        for (Book book : library.getAvailableBooks()) {
            System.out.println(book.getTitle());
        }
    }
}