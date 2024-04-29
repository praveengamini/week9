import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program1 {
    public static void main(String[] args) {
        try {
            FileInputStream source = new FileInputStream("file1.txt");
            FileOutputStream destination = new FileOutputStream("abc.txt");
            System.out.println(source.available());
            while (( source.available()) != 0) {
                destination.write(source.read());
            }
            destination.close();
            source.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
   
    }
}
