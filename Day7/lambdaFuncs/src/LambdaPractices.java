import java.util.ArrayList;

import static java.lang.System.*;

public class LambdaPractices {
    public static void main(String[] args) {
        var forPractice = new ArrayList<Integer>();

        forPractice.add(200);
        forPractice.add(300);
        forPractice.add(100);
        forPractice.add(500);
        forPractice.add(0);
        forPractice.forEach(out::println);
    }

}