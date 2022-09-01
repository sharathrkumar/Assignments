import java.util.Scanner;

abstract class Currency
{
    abstract void getCurrency();
    abstract void gerSymbol();
}
class India extends Currency
{
    @Override
    void getCurrency() {
        System.out.println("Indian Rupees.");
    }

    @Override
    void gerSymbol() {
        System.out.println("₹");
    }
}
class UAE extends Currency
{
    @Override
    void getCurrency() {
        System.out.println("AED.");
    }

    @Override
    void gerSymbol() {
        System.out.println(" د.إ");
    }
}

class USA extends Currency
{
    @Override
    void getCurrency() {
        System.out.println("Dollar.");
    }

    @Override
    void gerSymbol() {
        System.out.println("$");
    }
}
class UK extends Currency
{
    @Override
    void getCurrency() {
        System.out.println("Pound");
    }

    @Override
    void gerSymbol() {
        System.out.println("£");
    }
}

class CurrencyFactory
{
    public Currency getCurrencyDetails(String currency)
    {
        if(currency == null)
        {
            return null;
        }
        else if (currency.equalsIgnoreCase("India"))
        {
            return new India();
        }
        else if (currency.equalsIgnoreCase("Dubai") || currency.equalsIgnoreCase("UAE"))
        {
            return new UAE();
        }
        else if (currency.equalsIgnoreCase("America") || currency.equalsIgnoreCase("USA"))
        {
            return new USA();
        }
        else if (currency.equalsIgnoreCase("United Kingdom") || currency.equalsIgnoreCase("UK"))
        {
            return new UK();
        }
        return null;
    }
}

public class CurrencySymbol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Country Name: ");
        String countryName = sc.next();
        CurrencyFactory cf = new CurrencyFactory();
        Currency c = cf.getCurrencyDetails(countryName);
        System.out.print("Currency of "+ countryName +" is: ");c.getCurrency();
        System.out.print("Symbol of "+ countryName +"'s Currency is: ");c.gerSymbol();
    }
}
