package Day3.Day3;

import java.util.Scanner;
class Students {
    String studentName;
    String rollNumber;
    void show()
    {
        System.out.println("RollNumber of the "+studentName+" is "+rollNumber);
    }
}
class Test extends Students
{
    int maths;
    int science;
    int english;

    void show_marks()
    {
        System.out.println("Obtained Marks in Maths: "+ maths+" \nObtained marks in Science: "+ science+ "\nObtained Marks in English: "+ english);
    }
}
interface Sports
{
    int sportsMarks = 25;
    void show_sportswt();
}
class Result extends Test  implements Sports
{
    public void show_sportswt() {
        int result = super.english+super.maths+super.science+sportsMarks;
        System.out.println("Maximum Marks is: 325\nObtained Marks is: "+result);
    }
}
class Student {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Result s1 = new Result();
        System.out.println("Enter the Student Name: ");
        s1.studentName = scan.next();
        System.out.println("Enter the Roll Number: ");
        s1.rollNumber = scan.next();
        System.out.println("Enter the Marks Obtained in English: ");
        s1.english = scan.nextInt();
        System.out.println("Enter the Marks Obtained in Maths: ");
        s1.maths = scan.nextInt();
        System.out.println("Enter the Marks Obtained in Science: ");
        s1.science = scan.nextInt();
        s1.show();
        s1.show_marks();
        s1.show_sportswt();
        scan.close();
    }
}