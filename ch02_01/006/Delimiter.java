import java.util.Scanner;

public class Delimiter{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String del = sc.nextLine();
		String ans[] = str.split(del);
		System.out.println(ans[0]);
		System.out.print(ans[1]);
	}
}
