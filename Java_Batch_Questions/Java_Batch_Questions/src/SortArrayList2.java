import javax.swing.*;
import java.util.*;

class Employee implements Comparable<Employee> {
    String employeeName;
    int employeeId;

    Employee(String employeeName, int employeeId) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }

    @Override
    public int compareTo(Employee e) {
        if (employeeId == e.employeeId)
            return 0;
        else if (employeeId > e.employeeId)
            return 1;
        else
            return -1;
    }
}
class NameCompare implements Comparator<Employee>
{
    public int compare(Employee e1,Employee e2)
    {
        return e1.employeeName.compareTo(e2.employeeName);
    }
}
public class SortArrayList2 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("Sharath",1));
        employeeList.add(new Employee("ABC",2));
        employeeList.add(new Employee("XYZ",3));
        Collections.sort(employeeList);
        System.out.println("Sorting Based on ID Using Comparable: ");
        for(Employee e: employeeList)
        {
            System.out.println("EmployeeName: "+e.employeeName+" EmployeeID: "+e.employeeId);
        }
        Collections.sort(employeeList, new NameCompare());
        System.out.println("----------------------------------------");
        System.out.println("Sorting Based on Name Using Comparator: ");
        for(Employee e: employeeList)
        {
            System.out.println("EmployeeName: "+e.employeeName+" EmployeeID: "+e.employeeId);
        }
    }

}
