import java.util.Scanner;

public class MyMain{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		for(int i = 0; i < str.length(); i += 3){
			System.out.print(str.charAt(i));
		}
	}
}
