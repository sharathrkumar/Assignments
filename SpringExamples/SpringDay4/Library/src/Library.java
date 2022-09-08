
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library implements User{
  List<String> books =  new ArrayList<>();
    ArrayList<Borrower> borrowerList = new ArrayList<>();

    public void setBooks(List<String> books) {
        this.books = books;
    }

    public void setBorrowerList(ArrayList<Borrower> borrowerList) {
        this.borrowerList = borrowerList;
    }

    public ArrayList<Borrower> getBorrowerList() {
        return borrowerList;
    }

    public List<String> getBooks() {
        return books;
    }

    @Override
    public void searchBook() {
        System.out.println(books);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the book title: ");
        String bookName = scanner.nextLine();
        int flag = 0;
        for(int i =0;i<getBooks().size();i++)
        {
            if(books.get(i).equalsIgnoreCase(bookName))
            {
                System.out.println("Found");
                flag = 1;
            }
        }
        if(flag == 0)
            System.out.println("Book Not Found");
    }

    @Override
    public void viewLoanHistory() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the borrower Name: ");
        String borrowerName = scanner.next();
        for (Borrower borrower : borrowerList) {
            if (borrowerName.equalsIgnoreCase(borrower.name))
                System.out.println(borrower.loans);
        }
    }
}
