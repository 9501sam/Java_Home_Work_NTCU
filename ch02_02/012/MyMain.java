//https://github.com/ashwin28/SampleJavaCode/blob/master/Basic%20Exercises/PigLatinRule.java
import java.util.Scanner;

public class MyMain{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String first = sc.next();
		String last = sc.next();

		first = first.substring(1, 2).toUpperCase() + first.substring(2) + first.substring(0, 1).toLowerCase() + "ay";
		last = last.substring(last.length()-1, last.length()).toUpperCase() + last.substring(0, last.length()-1).toLowerCase() + "er";

		System.out.print(first + " " + last);
	}
}
