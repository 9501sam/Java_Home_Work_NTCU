//https://www.geeksforgeeks.org/java-string-format-examples/
import java.util.Scanner;

public class MyMain{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		float x = sc.nextFloat();
		String str1 = String.format("Start%10.2fEnd", x);
		String str2 = String.format("Start%-10.2fEnd", x);
		System.out.println(str1);
		System.out.print(str2);
	}
}
