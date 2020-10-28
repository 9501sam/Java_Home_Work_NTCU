//https://www.geeksforgeeks.org/java-string-trim-method-example/
import java.util.Scanner;

public class MyMain{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.print(str.trim());
	}
}
