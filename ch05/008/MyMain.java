import java.util.Scanner;

public class MyMain{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		String all = sc.nextLine();
		Scanner haha = new Scanner(all);
		String first = haha.next();
		all = all.substring(first.length());

		System.out.print(first + all.toUpperCase());
	}
}
