import java.util.Scanner;

public class MyMain{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.print(s.substring(x, y));
	}
}
