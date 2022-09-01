import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        set.add(25);
        set.add(22);
        set.add(25);
        set1.add(11);
        set1.add(10);
        set.addAll(set1);
        System.out.println(set);

        Map map = new HashMap();
        map.put(2,5);
        map.put(3,"Hello");
        System.out.println(map.get(3));
        System.out.println(map);
    }
}