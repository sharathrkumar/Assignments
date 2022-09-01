package Day2;

class Member {
    String nme;
    int ag;
    long phn;
    String add;
    double sal;

    Member(String name, int age, long phnum, String address, double salary){
        nme = name;
        ag = age;
        phn = phnum;
        add = address;
        sal = salary;
    }
    double printSalary()
    {
        return 0;
    }
}
class Employee extends Member {
    String specs;
    String dept;
    Employee(String name, int age, long phnum, String address, double salary, String specialization, String department)
    {
        super(name, age, phnum, address, salary);
        specs = specialization;
        dept = department;
    }
    double printSalary(){
        return sal;
    }
}
class Manager extends Member {
    String specs;
    String dept;
    Manager(String name, int age, long phnum, String address, double salary, String specialization, String department)
    {
        super(name, age, phnum, address, salary);
        specs = specialization;
        dept = department;
    }
    double printSalary(){
        return sal;
    }
}
public class Salary {
    public static void main(String[] args) {
        Employee e = new Employee("Sharath", 22, 888478516, "Shivamogga", 30000, "Java", "Fresher");
        System.out.println("Salary of the Employee: "+ e.printSalary());
        Manager m = new Manager("Ramesh", 40, 98765432, "Udupi", 80000, "Java","Trainer");
        System.out.println("Salary of the Manager: "+ m.printSalary());
    }
    
}
