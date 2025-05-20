package com.library;

import java.util.Date;

public class Loan {
    private Book myBook;
    private Member myMember;
    private Date dueDate;
    private boolean active;

    public Loan(Book book, Member member, Date due) {
        if (book != null && member != null) {
            myBook = book;
            myMember = member;
            dueDate = due;
            active = true;
            book.addLoan(this);
            member.addLoan(this);
        }
    }

    public Book getBook() {
        return myBook;
    }

    public Member getMember() {
        return myMember;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public boolean isActive() {
        return active;
    }

    public void returnBook() {
        active = false;
    }
}