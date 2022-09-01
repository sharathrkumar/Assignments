package arraylistprog;

import java.util.*;
class Employee {
    ArrayList<String> employeeName = new ArrayList<String>();
    ArrayList<String> employeeID = new ArrayList<String>();
    ArrayList<Float> employeeSalary = new ArrayList<Float>();
    Scanner sc = new Scanner(System.in);

    void insert() {
        System.out.println("Enter the Employee Name: ");
        employeeName.add(sc.next());
        System.out.println("Enter the Employee ID: ");
        employeeID.add(sc.next());
        System.out.println("Enter the Salary Ammount: ");
        employeeSalary.add(sc.nextFloat());
    }

    void deleteRecord() {
        System.out.println("Enter the Employee ID you want to Delete");
        String id = sc.next();
        for (int i = 0; i < employeeID.size(); i++) {
            if (id.equals(employeeID.get(i))) {
                employeeID.remove(i);
                employeeName.remove(i);
                employeeSalary.remove(i);
            }
        }
    }

    void display() {
        System.out.println("Employee Name: " + employeeName + "\nEmployee ID: " + employeeID + "\nEmployee Salary: " + employeeSalary);
    }

    void searchDetails() {
        System.out.println("Enter the id of the employee to search their details: ");
        String search = sc.next();
        for (int i = 0; i < employeeID.size(); i++) {
            if (search.equals(employeeID.get(i))) {
                System.out.println("Employee Name: " + employeeName.get(i) + "\nEmployee ID: " + employeeID.get(i) + "\nEmployee Salary: " + employeeSalary.get(i));
            }
        }
    }

    void recordUpdate() {
        System.out.println("Enter the id of the Employee you want to replace: ");
        String reference_id = sc.next();

        Float newSalary = sc.nextFloat();
        for (int i = 0; i < employeeID.size(); i++) {
            if (reference_id.equals(employeeID.get(i))) {
                System.out.println("Enter the New Name: ");
                String newName = sc.next();
                System.out.println("Enter their Salary: ");
                employeeName.set(i, newName);
                employeeSalary.set(i, newSalary);
            }
        }
    }
}
    public class Main {
        public static void main(String[] args) {
            Employee e1 = new Employee();
            Scanner sc = new Scanner(System.in);
            boolean check = true;
            String exit;
            while (check) {
                System.out.println("Choose the Correct Option: \n1.Add Employee Details\n2.Delete Record\n3.Search Employee Details\n4.Update Details\n5.Display Record");
                int option = sc.nextInt();
                if (option == 1) {
                    e1.insert();
                } else if (option == 2) {
                    e1.deleteRecord();
                } else if (option == 3) {
                    e1.searchDetails();
                } else if (option == 4) {
                    e1.recordUpdate();
                } else if (option == 5) {
                    e1.display();
                }
                System.out.println("Enter E to Exit or any other key for the Main Menu");
                exit = sc.next();
                if (exit.equals("E")) {
                    check = false;
                }
            }
            sc.close();
        }
    }