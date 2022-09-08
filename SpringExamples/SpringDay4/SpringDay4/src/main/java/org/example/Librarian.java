package org.example;
import java.util.Scanner;

public class Librarian extends Library {

    Scanner scanner = new Scanner(System.in);

    Librarian()
    {
        super();
    }

    public void addBorrower() {
        System.out.println("Enter the Borrower Name: ");
        String borrower = scanner.next();
        System.out.println("Enter the Loan Ammount: ");
        double loan = scanner.nextDouble();
        borrowerList.add(new Borrower(borrower,loan));
    }

    public void addBook() {
        System.out.println("Enter the Book Name You want to add: ");
        String bookName = scanner.next();
        books.add(bookName);
        System.out.println("Book added.");
    }
    public void deleteBook()
    {
        System.out.println("Enter the Book you Want to Delete: ");
        String deleteBook = scanner.next();
        books.remove(deleteBook);
        System.out.println("Book Deleted Successfully.");
    }
}
