package Day2;
import java.util.*;
public class RandomCheck {
    public static void main(String[] args) {
        Random random = new Random();
    int rand = random.nextInt(10);

    Scanner scan = new Scanner(System.in);
    
    boolean win = true;
    System.out.println(rand);
    while(win)
    {
    System.out.println("Guess the Number in the Range of 0 to 10");
    int guess = scan.nextInt();
    if (guess < rand)
    System.out.println("Lower");
    else if (guess == rand)
    {
    System.out.println("----------Correct--------------");
    win = false;
    }
    else
    System.out.println("Higher");
    }
    scan.close();
    }
    
}
