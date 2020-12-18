import java.util.Scanner;
public class Exercise13
{
public static void main(String[] args)
{
Scanner keyboard = new Scanner(System.in);
System.out.println("Enter two numbers."); 
int n1 = keyboard.nextInt();
int n2 = keyboard.nextInt();
int sum = n1 + n2;
System.out.println(n1 + " plus " + n2 + " is " + sum);
}
}
