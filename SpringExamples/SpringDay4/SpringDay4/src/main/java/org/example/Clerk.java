package org.example;

public class Clerk extends Library{

    Clerk()
    {
        super();
    }

    @Override
    public void viewLoanHistory() {
        super.viewLoanHistory();
    }

    @Override
    public void searchBook() {
        super.searchBook();
    }

    public void addBorrower() {
        System.out.println("Enter the Borrower Name: ");
        String borrower = scanner.next();
        System.out.println("Enter the Loan Ammount: ");
        double loan = scanner.nextDouble();
        borrowerList.add(new Borrower(borrower,loan));
        System.out.println("Borrower Added");
    }
}
