import java.util.Date;

abstract class Payment {
    float amount;
    abstract String authorized();
}
class Cash extends Payment{
    float cashTendered;
    Cash(float cashTendered,float amount)
    {
        super.amount = amount;
        this.cashTendered = cashTendered;
    }
    public String authorized() //To print the Status of payment through cash
    {
        if(cashTendered > amount)
            return ("Cash has been Received and Returned the: "+ (cashTendered-amount));
        else if (cashTendered < amount)
            return ("Cash is Insufficient: ");
        else
            return ("Cash received Successfully.");
    }
}
class Check extends Payment
{
    String name;
    String bankID;
    Check(String name, String bankID,float amount)
    {
        super.amount = amount;
        this.name = name;
        this.bankID = bankID;
    }

    public String authorized()
    {
        return ("Authorized for the Payment via Check of "+name);
    }
}
class Credit extends Payment
{
    String name;
    String type;
    Date expDate;

    Credit(String name, String type,Date expDate)
        {
            this.name = name;
            this.type = type;
            this.expDate = expDate;
        }

    public String authorized()
    {
        Date date = new Date();
        if (expDate.after(date))
            return ("Authorized for the Payment via Credit Card of "+name);
        else
            return ("Not Authorized for the Payment.");
    }
}

