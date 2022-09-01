import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class StudentMarks
{
    StudentMarks(File file) throws IOException
    {

        Scanner sc = new Scanner(file);
        int sum = 0;
        int noOFStudent = 1;
        while(sc.hasNextLine())
        {
            String line = sc.nextLine();
            String[] arr = line.split(" ");
            int len = arr.length;
            for(int i =0;i<len;i++)
            {
                sum += Integer.parseInt(arr[i]);
            }
            System.out.println("Average of the Student: "+noOFStudent+" is "+sum/ arr.length);
            noOFStudent++;
            sum = 0;
            }
            sc.close();
    }
}
public class StudentFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the File Name: ");
        String fileName = sc.next()+".txt";
        new StudentMarks(new File(fileName));
        sc.close();
    }
}
