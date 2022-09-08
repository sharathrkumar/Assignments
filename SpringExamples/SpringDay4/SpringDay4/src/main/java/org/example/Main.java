package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("library.xml");
        Scanner scan = new Scanner(System.in);
        System.out.println("1.Borrower\n2.Librarian\n3.Clerk");
        int option = scan.nextInt();


        switch (option)
        {
            case 1:
                Borrower borrower = (Borrower) context.getBean("borrower");
                borrower.searchBook();
                borrower.viewLoanHistory();

            case 2:
                Librarian librarian = (Librarian) context.getBean("librarian");
                librarian.searchBook();
                librarian.viewLoanHistory();
                librarian.addBook();
                librarian.addBorrower();
                librarian.deleteBook();

            case 3:
                Clerk clerk = new Clerk();
                clerk.searchBook();
                clerk.viewLoanHistory();
                clerk.addBorrower();
        }


    }
}