package com.library;

import java.util.Vector;

public class Member {
    private String name;
    private Vector<Loan> myLoans;

    public Member(String name) {
        this.name = name;
        myLoans = new Vector<Loan>();
    }

    public String getName() {
        return name;
    }

    public void addLoan(Loan loan) {
        if (loan != null && !myLoans.contains(loan)) {
            myLoans.add(loan);
        }
    }

    public Vector<Loan> getActiveLoans() {
        Vector<Loan> result = new Vector<Loan>();

        for (Loan loan : myLoans) {
            if (loan.isActive()) {
                result.add(loan);
            }
        }

        return result;
    }

    public Vector<Loan> getLoans() {
        return myLoans;
    }

    public boolean canBorrow() {
        return getActiveLoans().size() < 5;
    }
}