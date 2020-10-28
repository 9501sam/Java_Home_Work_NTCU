//https://stackoverflow.com/questions/31066194/replace-string-ignoring-case-in-java
import java.util.Scanner;

public class MyMain{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String s3 = sc.nextLine();
		System.out.print(s1.replaceAll("(?i)" + s2, s3));
	}
}
