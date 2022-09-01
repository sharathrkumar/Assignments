
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


class NotInStockException extends Exception
{
    public NotInStockException(String s)
    {
        super(s);
    }
}

public class Main {
    public static void main(String[] args) throws ParseException, NotInStockException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Customer Name: ");
        String name = sc.next();
        System.out.println("Enter Your Address: ");
        String address = sc.next();
        Customer customer = new Customer(name,address);

        Date date = new Date();
        System.out.println("Enter the Description about the Item: ");
        String description = sc.next();
        description = description.toLowerCase();
        System.out.println("Enter the Quantity You want to Order: ");
        int quantity = sc.nextInt();
        Order order = new Order(date,quantity,description);
        try {
            order.calcTotal();
            order.validate();
            System.out.println(order.status);
            System.out.println("Shipping Weight: "+order.calWeight()+"grams");
            System.out.println("Tax: "+order.calcTax()+"Rs");
            System.out.println("Ordered Time: "+ order.date);
            System.out.println("Bill Amount: " + order.calcTotal()+"Rs");

            System.out.println("Enter the Mode of Payment: \n1.Cash\n2.Check\n3.Credit");
            String payment = sc.next();

            if (payment.equalsIgnoreCase("cash") || payment.equals("1")) {
                System.out.println("Enter the Cash you Paid");
                Cash cash = new Cash(sc.nextFloat(), order.calcTotal());
                System.out.println(cash.authorized());
            } else if (payment.equalsIgnoreCase("check") || payment.equals("2")) {
                System.out.println("Enter the Name: ");
                String checkName = sc.next();
                System.out.println("Enter the Bank ID: ");
                String bankID = sc.next();

                Check check = new Check(checkName, bankID, order.calcTotal());
                System.out.println(check.authorized());
            } else if (payment.equalsIgnoreCase("credit") || payment.equals("3")) {
                System.out.println("Enter the Name: ");
                String creditName = sc.next();
                System.out.println("Enter the Card type");
                String type = sc.next();
                System.out.println("Enter the Expiry date in format mm-yyyy: ");
                String expiryDate = sc.next();
                Date date1 = new SimpleDateFormat("MM-yyyy").parse(expiryDate);

                Credit credit = new Credit(creditName, type, date1);
                System.out.println(credit.authorized());
            }
       }
        catch (NotInStockException ni)
        {
            System.out.println(ni);
        }
        System.out.println("Thank you Visit Again....");

    }
}


