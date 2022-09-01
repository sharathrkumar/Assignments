abstract class A
{
    A()
    {
        System.out.println("This is a Constructor of Abstract class");
    }
    abstract void a_method();
    void non_abstract_method()
    {
        System.out.println("This is a normal method of Abstract Class.");
    }
}
class SubClass extends A
{
    void a_method()
    {
        System.out.println("This is a abstract Method.");
    }
}
public class AbstractProgram {
    public static void main(String[] args) {
        SubClass sc = new SubClass();
        sc.a_method();
        sc.non_abstract_method();
    }
}
