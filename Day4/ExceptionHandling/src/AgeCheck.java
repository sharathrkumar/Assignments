class AgeNotWithinRangeException extends Exception
{
    AgeNotWithinRangeException(String s)
    {
        super(s);
    }
}
class Student
{
    String name;
    String rollNo;
    static int age;
    String course;
    Student(String name,String rollNo, int age, String course)
    {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.course = course;
    }

    static void checkAge() throws AgeNotWithinRangeException
    {
        if (age <15 || age > 21)
        {
            throw new AgeNotWithinRangeException("Age is not in Range");
        }
        else
            System.out.println("Your age is valid");
    }
}
public class AgeCheck {
    public static void main(String[] args) {
        Student s = new Student("Sharath","415",22,"ec");
        try
        {
            Student.checkAge();
        }
        catch (AgeNotWithinRangeException ae)
        {
            System.out.println(ae);
        }
    }
}
