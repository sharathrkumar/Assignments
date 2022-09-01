import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employees
{
    List<String> employeeName = new ArrayList<>();
    List<String> employeeID = new ArrayList<>();
    List<Double> employeeSalary = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    void addingEmployeeDetails()
    {
        System.out.println("How Many Employees you want to Add: ");
        int noOfEmployees = sc.nextInt();
        for (int i = 0; i<noOfEmployees;i++)
        {
            System.out.println("Employee "+i+": ");
            System.out.print("Enter the Employee Name: "); employeeName.add(sc.next());
            System.out.print("Enter the Employee ID: "); employeeID.add(sc.next());
            System.out.print("Enter the Employee Salary: "); employeeSalary.add(sc.nextDouble());
        }
    }

    void filteringSalary()
    {
        employeeSalary.stream().filter(n -> n> 15000).forEach(s -> System.out.println(s));
    }
 }
public class StreamAssignment {
    public static void main(String[] args) {
        Employees e = new Employees();
        e.addingEmployeeDetails();
        e.filteringSalary();
    }
}
