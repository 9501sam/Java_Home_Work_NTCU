//replace(char, char)  replaceAll(String, String)
//http://www.java2s.com/Code/Java/Regular-Expressions/UsereplaceAlltoignorecasewhenreplacingonesubstringwithanother.htm
import java.util.Scanner;

public class MyMain{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.replace('I', 'i');
		str = str.replaceAll("hate", "Love");
		str = str.replaceAll("(?i)java", "JAVA"); //(?i) means ignore case
		String ans[] = str.split(" ");

		System.out.print("***");
		for(String i : ans){
			System.out.print(i);
		}
		System.out.print("***");
	}
}
