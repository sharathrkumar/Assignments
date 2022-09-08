package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Library implements User{
    ArrayList <String> books = new ArrayList<>();
    ArrayList<Borrower> borrowerList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void searchBook() {
        System.out.println("Enter the book title: ");
        String bookName = scanner.next();
        books.stream().filter(bookName::equalsIgnoreCase).forEach(System.out::println);
    }

    @Override
    public void viewLoanHistory() {
        System.out.println("Enter the borrower Name: ");
        String borrowerName = scanner.next();
        for (Borrower borrower : borrowerList) {
            if (borrowerName.equalsIgnoreCase(borrower.name))
                System.out.println(borrower.loan);
        }
    }
}
