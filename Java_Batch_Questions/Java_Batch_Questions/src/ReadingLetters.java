import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

public class ReadingLetters {
    public static void main(String[] args) throws IOException {
        File file = new File("newfile.txt");
        Scanner sc = new Scanner(System.in);
        Scanner scan = new Scanner(file);
        String s = null;


        //System.out.println(fr.read(CharBuffer.allocate('s')));
    }

}
