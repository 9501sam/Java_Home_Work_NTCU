//https://www.geeksforgeeks.org/java-string-charat-method-example/
import java.util.Scanner;

public class MyMain{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int n = sc.nextInt();
		if(n < S.length()){
			System.out.print(S.charAt(n));
		}else{
			System.out.print("error");
		}
	}
}
