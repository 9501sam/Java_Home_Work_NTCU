//str1.compareTo(str2)
//https://www.geeksforgeeks.org/compare-two-strings-in-java/
import java.util.Scanner;

public class MyMain{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		if(s1.compareTo(s2) == 0){
			System.out.print(0);
		}else if(s1.compareTo(s2) > 0){
			System.out.print(s1);
		}else{
			System.out.print(s2);
		}
	}
}
