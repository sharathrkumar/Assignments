import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        list.add("Sharath");
        list.add("Alexander");
        list.add("Baahubali");
        list.stream().filter(n -> n.startsWith("A")).toList().forEach(System.out::println);

    }
}