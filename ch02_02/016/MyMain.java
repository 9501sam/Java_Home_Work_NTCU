//https://www.geeksforgeeks.org/compare-two-strings-in-java/
import java.util.Scanner;

public class MyMain{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		if(s1.equals(s2)){
			System.out.print(1);
		}else{
			System.out.print(0);
		}
	}
}
