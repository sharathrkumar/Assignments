import java.util.*;
public class Account {
    private int id= 0;
    private double bal=0.0;
    private double annualInterestRate=0.0;
    Account(){
        System.out.println("Account has been created");
    }
    Account(int identity,double balance)
    {
        id = identity;
        bal = balance;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public int getId() {
        return id;
    }
    public double getBalance() {
        return bal;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    double getMonthlyInterestRate()
{
    return(annualInterestRate/100)/12;  
}
    double getmonthlyInterest()
{
    return bal*getMonthlyInterestRate();
}
    void withdraw(double ammountWithdraw)
    {
        bal = bal-ammountWithdraw;
    }
    void deposit(double depositAmmount){
        bal = bal+depositAmmount;
    }

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Account []obj = new Account[5];
    for(int i = 0;i<=5;i++)
    {
        System.out.println("Enter the Id:");
        int id = scan.nextInt();
        System.out.println("Enter the Balance:");
        double bal = scan.nextDouble();
        obj[i] = new Account(id,bal);
    obj[i].setAnnualInterestRate(4.5);
    System.out.println("Enter the Valid Option \n 1.Deposit \n 2.Withdraw \n 3.Account Info \n 4.Monthly Interest");
    int opt = scan.nextInt();
    if(opt == 1)
    {
    System.out.println("Enter the Ammount You Want to Deposit:");
    obj[i].deposit(scan.nextDouble());
    System.out.println("Balance after the Deposit"+ obj[i].getBalance());
    }
    else if (opt==2)
    {
        System.out.println("Enter the Amout You Want to Withdraw:");
        obj[i].withdraw(scan.nextDouble());
        System.out.println("Balance after the Withdraw" + obj[i].getBalance());
    }
    else if (opt==3)
    {
        System.out.println("Your ID: "+obj[i].getId());
        System.out.println("Current Account Balance"+ obj[i].getBalance());
        
    }
    else
    {
        System.out.println("Your Monthly Interrest is:"+obj[i].getmonthlyInterest());
    }
    }
    scan.close();
}
}