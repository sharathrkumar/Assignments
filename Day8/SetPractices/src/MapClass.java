import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.SortedMap;

public class MapClass {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("A", 1);
        map.put("B", 1);
        map.put("C", 1);
        map.put("D", 1);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Key: ");
        String key = scan.next();
        int obj = 1;
        boolean check = false;
        Iterator<Integer> iterator = map.keySet().iterator();
        int valv;
        if (map.containsKey(key)) {
            valv = (int) map.get(key);
            map.replace(key, valv+1);
        }
        else
            map.put(key,obj);
        System.out.println(map);
    }
}
