import java.util.Arrays;
import java.util.Collections;

class SortingArray
{
    int[] intArr = {46,64,987,18,4};
    String[] strArray = {"Hi","Java","Code","Run","RandomString"};

    void sort()
    {
        System.out.println("Integer Array After Sorting:");
        Arrays.stream(intArr).sorted().forEach(n-> System.out.print(n+" "));
        System.out.println("\nString Array After Sorting:");
        Arrays.stream(strArray).sorted().forEach(n-> System.out.print(n+" "));
    }
}
public class SortArray {
    public static void main(String[] args) {
        SortingArray sa = new SortingArray();
        sa.sort();
        char a = 'a'; char b ='b';
    }
}
