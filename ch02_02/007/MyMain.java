//https://www.geeksforgeeks.org/substring-in-java/
import java.util.Scanner;

public class MyMain{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.print(S.substring(x, y)); //x to y-1
	}
}

