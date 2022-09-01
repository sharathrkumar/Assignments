import java.util.ArrayList;
import java.util.List;

public class EmptyString {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(" ");
        list.add("Java");
        list.add("C");
        list.add(" ");
        list.add(" ");
        System.out.println("Number of Empty Strings int the list: "+list.stream().filter(n -> n.equals(" ")).count());
    }


}
