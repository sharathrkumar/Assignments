import java.io.*;
import java.util.*;

class Employee implements Serializable
{
    String employeeName;
    String employeeID;
    double employeesalary;
    static Scanner sc = new Scanner(System.in);

    void storing(Employee[] employee, ArrayList<Employee> list)
    {
        for(int i =0;i<employee.length;i++)
        {
            employee[i] = new Employee();
            System.out.println("Enter Employee Name: ");
            employee[i].employeeName = sc.next();
            System.out.println("Enter the Employee ID: ");
            employee[i].employeeID = sc.next();
            System.out.println("Enter the Employee Salary: ");
            employee[i].employeesalary = sc.nextDouble();
            list.add(employee[i]);
        }

    }

    void delete(Employee[] employee, ArrayList<Employee> list)
    {
        System.out.println("Enter the Employee ID you want to Delete: ");
        String id = sc.next();
        Employee tempObject = null;
        Iterator it = list.iterator();
        while(it.hasNext())
        {
            Employee currentObject = (Employee) it.next();
            if(currentObject.employeeID.equals(id))
            {
                tempObject = currentObject;
                break;
            }
        }
        list.remove(tempObject);
    }
    void display(ArrayList<Employee> list)
    {
        for(int i =0;i<list.size();i++)
        {
            Employee tempObject = list.get(i);
            System.out.println("Employee Name: "+tempObject.employeeName);
            System.out.println("Employee ID: "+tempObject.employeeID);
            System.out.println("Employee Salary: "+tempObject.employeesalary);

        }

    }
}
public class SerializationProg {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<Employee>();
        System.out.println("How many Employees You Want to Add: ");
        int count = sc.nextInt();
        try {
            Employee[] employee = new Employee[count];
            Employee e = new Employee();
            e.storing(employee, list);
            e.delete(employee, list);
            e.display(list);
            FileOutputStream fo = new FileOutputStream("d.txt");
            ObjectOutputStream out = new ObjectOutputStream(fo);
            out.writeObject(e);
            out.flush();
            out.close();
        }
        catch(Exception e){System.out.println(e);}
        try
        {
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("d.txt"));
            Employee e =(Employee) in.readObject();
            in.close();
            e.display(list);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        sc.close();
    }
}

