import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;


import java.util.Scanner;

public class TextFileOutputDemo
{
    public static void main(String[] args)
    {
        PrintWriter outputStream = null;
        try
        {
            outputStream = 
                 new PrintWriter(new FileOutputStream("stuff.txt"));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error opening the file stuff.txt.");
            System.exit(0);
        }

        Scanner keyboard = new Scanner(System.in);

        System.out.println("input your name:");
        String s1 = keyboard.next();
        System.out.println("input your mobile phone number:");
        int n1 = keyboard.nextInt( );
        System.out.println("Writing to file.");
        outputStream.println(s1+" " +n1);

        System.out.println("input your name:");
        String s2 = keyboard.next();
        System.out.println("input your mobile phone number:");
        int n2 = keyboard.nextInt( );
        System.out.println("Writing to file.");
        outputStream.println(s2+" " +n2);


        outputStream.close( );
        System.out.println("----End of program.-----");
    }
}
