import java.util.Scanner;

public class MyMain{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		str = sc.next();
		System.out.println(str);

		str = sc.nextLine();
		System.out.print(str.substring(1));
	}
}
