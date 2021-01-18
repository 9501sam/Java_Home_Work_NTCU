

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TextFileScannerDemo
{
    public static void main(String[] args)
    {
       System.out.println("*****************************************");
       System.out.println("I will read three numbers and a line");
       System.out.println("of text from the file morestuff.txt.");
       System.out.println("*****************************************");
       System.out.println("");

       Scanner inputStream = null;

       try
       {
           inputStream =
              new Scanner(new FileInputStream("morestuff.txt"));
       }
       catch(FileNotFoundException e)
       {
           System.out.println("File morestuff.txt was not found");
           System.out.println("or could not be opened.");
           System.exit(0);
       }
           int n1 = inputStream.nextInt( );
           int n2 = inputStream.nextInt( );
           int n3 = inputStream.nextInt( );

           inputStream.nextLine(); //To go to the next line

           String line = inputStream.nextLine( );
           String line2 = inputStream.nextLine( );

           System.out.println("The three numbers read from the file are:");
           System.out.println(n1 + ", " + n2 + ", and " +  n3);

           System.out.println("The line read from the file is:");
           System.out.println(line);
           System.out.println(line2);

           inputStream.close( );
    }
}

