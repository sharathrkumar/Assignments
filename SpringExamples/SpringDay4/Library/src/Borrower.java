import java.util.ArrayList;
import java.util.List;

public class Borrower extends Library{
    String name;
    List<String> loans = new ArrayList<>();
    Borrower(String name)
    {
        super();
        this.name = name;
    }

    public void setLoans(List<String> loans) {
        this.loans = loans;
    }
}
