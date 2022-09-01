import  java.util.Scanner;
class SumValidateException extends Exception
{
    SumValidateException(String s)
    {
        super(s);
    }
}
public class Main {

    static void checkSum(int a ,int b) throws SumValidateException {
        if ((a+b) > 100)
        {
            throw new SumValidateException("Invalid Integers");
        }

        else
        {
            System.out.println("Sum: "+(a+b));
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Integer");
        int firstInteger = sc.nextInt();
        System.out.println("Enter the Second Integer");
        int secondInteger = sc.nextInt();
        try {
            checkSum(firstInteger,secondInteger);
        }
        catch(SumValidateException sv)
        {
            System.out.println("Exception Occurred "+sv);
            System.out.println("Enter the Valid Integers");
        }
    }
}