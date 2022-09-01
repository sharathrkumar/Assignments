import java.util.*;
import java.util.stream.*;

class Employee
{
    String name;
    String id;
    long salary;
    Scanner sc = new Scanner(System.in);

    void storing(Employee[] employee, ArrayList<Employee> employeeList )
    {
        for (int i =0;i<employee.length;i++)
        {
            employee[i] = new Employee();
            System.out.println("Enter the Employee Name: ");
            employee[i].name = sc.next();
            System.out.println("Enter the Employee id: ");
            employee[i].id = sc.next();
            System.out.println("Enter the Employees Salary: ");
            employee[i].salary = sc.nextInt();
            employeeList.add(employee[i]);
        }
    }

    void checkSalary(ArrayList<Employee> employeeList) //method to find employee who earns above 15K
    {
        employeeList.stream().filter(s -> s.salary >15000)
                .forEach(n -> System.out.println("Employee Nane Who has Salary More than 15000: "+n.name));
    }

    void nameStartsWith(Employee[] employee) //for finding employee name Starts with V
    {
        Arrays.stream(employee).filter(n -> n.name.startsWith("V"))
                .forEach(p -> System.out.println("Employee Name Starts With V: "+p.name));
    }

    void maxSalary(ArrayList<Employee> employeeList)
    {
       List<Long> maxList =  employeeList.stream().map(x -> x.salary).collect(Collectors.toList());
       Long maxSalary = Collections.max(maxList);
       employeeList.stream().filter(n-> n.salary == maxSalary)
               .forEach(e -> System.out.println(e.name+" earns the Maximum Salary of "+e.salary));

    }
    void countingEmployee(Employee[] employee)
    {
        System.out.println("Total Number of Employees are: "+Arrays.stream(employee).count());
    }

    void nameLength(Employee[] employee)
    {
        Arrays.stream(employee).filter(e -> e.name.length() > 4)
                .forEach(p -> System.out.println("Employee Name has More than 4 Letters :" + p.name));
    }

    void sortingName(ArrayList<Employee> employeeList)
    {
        List<String> nameList = employeeList.stream().map(n-> n.name).collect(Collectors.toList());
        Collections.sort(nameList);
        System.out.print("List of Names after Sorting: "+nameList);
    }
}

public class StreamPrograms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How Many Employees You Want to Add: ");
        int count = scan.nextInt();
        ArrayList<Employee> employeeList = new ArrayList<>();
        Employee[] employee = new Employee[count];

        Employee e = new Employee();
        e.storing(employee,employeeList);
        e.checkSalary(employeeList);
        e.nameStartsWith(employee);
        e.maxSalary(employeeList);
        e.countingEmployee(employee);
        e.nameLength(employee);
        e.sortingName(employeeList);

    }

}
