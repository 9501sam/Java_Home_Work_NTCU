//https://www.geeksforgeeks.org/length-vs-length-java/
import java.util.Scanner;

public class MyMain{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		if(str1.equalsIgnoreCase(str2)){
			System.out.print(1);
		}else{
			System.out.print(0);
		}
	}
}
