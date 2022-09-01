@FunctionalInterface
interface Try
{
    void demo(int no);
}
public class Main {
    public static void main(String[] args) {
        Try t  = (no) -> System.out.println(no*10);

        t.demo(10);
    }
}