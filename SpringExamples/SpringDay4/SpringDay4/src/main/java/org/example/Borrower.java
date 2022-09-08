package org.example;


public class Borrower extends Library{
    String name;
    double loan;

    Borrower(String name, double loan)
    {
        this.name = name;
        this.loan = loan;
    }
}
