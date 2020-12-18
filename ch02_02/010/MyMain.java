//https://www.tutorialspoint.com/java/java_string_replaceall.htm
//str.replace('b', 'f')   !!!char: use replace()
//str.replace(str1, str2)   !!!string: use replaceAll()
import java.util.Scanner;

public class MyMain{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String s3 = sc.nextLine();
		System.out.print(s1.replaceAll(s2, s3));
	}
}
