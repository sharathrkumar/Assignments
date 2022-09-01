import java.util.*;
class Employee
{
    String id;
    String name;
    String gender;
    int age;
    String department;
    int yearOfJoining;
    Double salary;

    //Constructor for initialising the Data Members
    Employee(String id, String name,String gender,String department,int age,int yearOfJoining,Double salary)
    {
        this.salary = salary;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
    }

    //Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public Double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

}
public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("1","Sharath","Male","SDE",22,2022, 31000.0));
        employeeList.add(new Employee("2","ABC","Female","ECE",32,2014, 45000.0));
        employeeList.add(new Employee("3","XYZ","Male","CSE",25,2021, 40000.0));

        employeeList.stream().filter(n-> n.getYearOfJoining()>2015)
                .forEach(e-> System.out.println("Employee Names Who Joined After 2015 :"+e.name));

        employeeList.stream().map(Employee::getDepartment).distinct().forEach(n-> System.out.println("Distinct Departments are: "+n));

        employeeList.stream().filter(n-> n.age > 30).forEach(a-> System.out.println("Employees whose age is more than 30 are: "+a.name));

    }
}