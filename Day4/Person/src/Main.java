import java.util.Scanner;
class Person
{
    static String name;
    static int age;
    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    void display()
    {
        System.out.println("Name: "+ name+ "\nAge: "+ age);
    }
}
class Student extends Person
{
    String rollNo;
    String branch;
    Student(String rollNo, String branch) {
        super(name,age);
        this.rollNo = rollNo;
        this.branch = branch;
    }
    void display()
    {
        super.display();
        System.out.println("Roll Number: "+ rollNo+ "\nBranch: "+ branch);
    }
}
class Employee extends Person
{
    static String ecNo;
    static String doj;
    Employee(String ecNo, String doj) {
        super(name,age);
        this. ecNo = ecNo;
        this.doj = doj;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Ec Number: "+ ecNo+"\nDate of joining: "+doj);
    }
}

class Staff extends Employee
{
    String designation;
    Staff(String designation)
    {
        super(Employee.ecNo,Employee.doj);
        this.designation = designation;
    }
    void display()
    {
        super.display();
        System.out.println("Staff Designation: "+ designation);
    }
}

class Faculty extends Employee
{
    String designation;
    Faculty(String designation)
    {
        super(Employee.ecNo,Employee.doj);
        this.designation = designation;
    }
    void display()
    {
        super.display();
        System.out.println("Staff Designation: "+ designation);
    }
}
public class Main {

        static void display(Person p)
        {
            Person ref = p;
            ref.display();
        }
    public static void main(String[] args) {Scanner scan = new Scanner(System.in);
        Person person = new Person("Sharath",22);
        Student student = new Student("19EC415","EC");
        Employee employee = new Employee("123456","08-08-2022");
        Faculty faculty = new Faculty("Professor");
        Staff staff = new Staff("Technical");
        System.out.println("1.Person\n2.Student\n3.Employee\n4.Staff\n5.Faculty");
        int option = scan.nextInt();
        switch (option)
        {
            case 1:
                display(person);
            case 2:
                display(student);
            case 3:
                display(employee);
            case 4:
                display(staff);
            case 5:
                display(faculty);
        }
    }

}