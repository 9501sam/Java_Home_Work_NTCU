
import java.util.Scanner;

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryOutputDemo
{
   public static void main(String[] args)
   {

        Scanner keyboard = new Scanner(System.in);

      try
      {
         ObjectOutputStream outputStream =
             new ObjectOutputStream(new FileOutputStream("numbers.dat"));

         System.out.println("Please input 5 numbers:");

         for (int i = 0; i < 5; i++){
             
             int n = keyboard.nextInt();
             outputStream.writeInt(n);
         }
         System.out.println("Numbers written to the file numbers.dat.");
         outputStream.close( );
      }
      catch(IOException e)
      {
         System.out.println("Problem with file output.");
      }
   }
}
