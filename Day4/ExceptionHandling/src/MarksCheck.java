import java.util.Scanner;
class MarksExceedsException extends Exception
{
    MarksExceedsException(String s)
    {
        super(s);
    }
}
public class MarksCheck {

    static void checkMarks(int internal,int external) throws MarksExceedsException {
        if (internal >40 && external >60) {
            throw new MarksExceedsException("Internal and External Marks are Exceeded");
        }
        else if(internal > 40)
        {
            throw new MarksExceedsException("Internal Marks is Exceeded");
        } else if (external >60) {
            throw new MarksExceedsException("External Marks is Exceeded");
        } else {
            System.out.println("Internal Marks is: "+ internal+"\nExternal Marks is: "+external+"\nTotal Marks is: "+(internal+external));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Internal Marks: ");
        int internalMarks = sc.nextInt();
        System.out.println("Enter the External Marks: ");
        int externalMarks = sc.nextInt();
        try {
            checkMarks(internalMarks,externalMarks);
        }
        catch (MarksExceedsException mx)
        {
            System.out.println(mx);
        }
    }
}
