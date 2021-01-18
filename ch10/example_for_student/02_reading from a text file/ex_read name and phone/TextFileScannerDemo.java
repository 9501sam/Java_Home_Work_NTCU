

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TextFileScannerDemo
{
    public static void main(String[] args)
    {

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
           String n1 = inputStream.next( );
           String n2 = inputStream.next( );
           int    n3 = inputStream.nextInt( );


           System.out.println("Name:" + n1 + "   phone:" + n2 + " age:" + n3 );

           inputStream.close( );
    }
}

