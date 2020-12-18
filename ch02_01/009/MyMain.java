import java.util.Scanner;

public class MyMain{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String ans[] = str.split("#");
		System.out.print(ans[0]);
		System.out.print(ans[2]);
	}
}
