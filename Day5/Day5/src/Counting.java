import java.io.*;


class CountingInFiles
{
    int noOfLines;
    int noOfWords;
    int noOfChars;

    CountingInFiles(FileReader file) throws IOException {
        BufferedReader sb = new BufferedReader(file);
        String line;

        while ((line = sb.readLine())!= null)
        {
            String words[] = line.split(" ");
            noOfLines++;
            noOfWords += words.length;
            noOfChars += line.length();
        }
        System.out.println("Number of Words: "+noOfWords);
        System.out.println("Number of Characters: "+noOfChars);
        System.out.println("Number of Lines: "+noOfLines);

    }
}
public class Counting {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("a.txt");
        new CountingInFiles(fr);
    }
}