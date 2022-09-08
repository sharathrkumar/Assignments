import java.util.Scanner;

public class Clerk extends Library{

    Clerk()
    {
        super();
    }
    Scanner scan = new Scanner(System.in);
    public void addBorrower() {
        System.out.println("Enter the Borrower Name: ");
        String borrower = scan.next();
        borrowerList.add(new Borrower(borrower));
        System.out.println("Borrower Added");
    }
}
