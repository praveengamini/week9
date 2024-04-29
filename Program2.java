/*
  FileNotFoundException, ClassNotFoundException, IOException, InteruptedException; UnChecked : OutOfBoundsException, NullPointerException, Arithmatic Exception)  in java.
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class Program2{
    public static void main(String[] args) {
        FileInputStream fin;
        try{
            fin = new FileInputStream("xyz.txt");

        }
        catch(FileNotFoundException e)
        {
            System.out.println("file is not found");
        }
        try{
            Class.forName("vdsd");

        }
        catch(ClassNotFoundException e)
        {
            System.out.println("class is not found");
        }
        FileOutputStream output;
        try{
            output = new FileOutputStream("abc.txt");
            output.write(65);
        }
        catch(IOException e){
            System.out.println("abc.txt is not permitted");
        }
        try{
            int[] array = new int[5];
            System.out.println(array[9]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("out of bounds exception");
        }
        try{
            String s= null;
            System.out.println(s.length());
        }
        catch(NullPointerException e)
        {
            System.out.println("null pointer exception");
        }
        try{
            System.out.println(90/0);
        }
        catch(ArithmeticException e)
        {
            System.out.println("it is ArithmeticException");
        }
        

    }
}

