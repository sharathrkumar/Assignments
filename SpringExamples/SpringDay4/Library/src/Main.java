import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("library.xml");
        Scanner scan = new Scanner(System.in);

        System.out.println("1.Borrower\n2.Librarian\n3.Clerk");
        int option = scan.nextInt();
        switch (option) {
            case 1 -> {
                User borrower = (Borrower) context.getBean("borrower");
                System.out.println("1.Search Book\n2.View Loan History");
                int option1 = scan.nextInt();
                switch (option1)
                {
                    case 1:
                        borrower.searchBook(); break;
                    case 2:
                        borrower.viewLoanHistory();break;
                    default:
                        System.out.println("Invalid Option");
                }


            }
            case 2 -> {
                Librarian librarian = (Librarian) context.getBean("librarian");
                System.out.println("1.Search Book\n2.View Loan History\n3.Add Book\n4.Add Borrower\n5.Delete Book");
                int option2 = scan.nextInt();

                switch (option2) {
                    case 1:
                        librarian.searchBook();break;
                    case 2:
                        librarian.viewLoanHistory();break;
                    case 3:
                        librarian.addBook();break;
                    case 4:
                        librarian.addBorrower();break;
                    case 5:
                        librarian.deleteBook();break;
                    default:
                        System.out.println("Invalid Option");
                }
            }
            case 3 -> {
                Clerk clerk = new Clerk();
                System.out.println("1.Search Book\n2.View Loan History");
                int option3 = scan.nextInt();
                switch (option3) {
                    case 1:
                        clerk.searchBook();break;
                    case 2:
                        clerk.viewLoanHistory();break;
                    case 3:
                        clerk.addBorrower();break;
                    default:
                        System.out.println("Invalid Option");
                }
            }
            default -> {
                Library library = (Library) context.getBean("library");
                library.searchBook();
            }
        }


    }
}