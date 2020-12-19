import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		int n = str.length();
		for(int i = 0; i <= n/2; i++){
			if(str.charAt(i) != str.charAt(n-1-i)){
				System.out.print("No");
				return;
			}
		}

		System.out.print("Yes");
	}
}
