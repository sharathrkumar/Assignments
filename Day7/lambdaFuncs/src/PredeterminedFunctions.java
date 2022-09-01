import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

class Tests
{
    Scanner scan = new Scanner(System.in);
    void predicate()
    {
        Predicate<Integer> ageTester = (n) -> n>=18;

        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        if(ageTester.test(age))
            System.out.println("valid to Vote");
        else
            System.out.println("You're too young to Vote");
    }

    int function()
    {
        Function<Integer,Integer> square = n -> n*n;
        return square.apply(10);
    }

}
public class PredeterminedFunctions {

    public static void main(String[] args) {
        Tests t = new Tests();
        t.predicate();
        System.out.println(t.function());
    }
}
