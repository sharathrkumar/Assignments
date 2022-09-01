import java.io.*;
import java.util.Scanner;

class CopyingFiles
{
    void copyFile(File a,File b, File c) throws IOException {
        Scanner fr1 = new Scanner(a);
        Scanner fr2 = new Scanner(b);
        FileWriter fw = new FileWriter(c);

        while (fr1.hasNext()) {
            fw.write(fr1.nextLine()+" ");;
        }
        while (fr2.hasNext()) {
            fw.write(fr2.nextLine()+" ");;
        }
        fw.close();
        fr1.close();
        fr2.close();
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
       File a = new File("a.txt");
       File b = new File("b.txt");
       File c = new File ("c.txt");

       CopyingFiles cf = new CopyingFiles();
       cf.copyFile(a,b,c);

    }
}