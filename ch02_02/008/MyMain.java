//https://www.geeksforgeeks.org/searching-for-character-and-substring-in-a-string/
import java.util.Scanner;

public class MyMain{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		System.out.print(s1.indexOf(s2));
	}
}

