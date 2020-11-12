import java.util.Scanner;

public class MyMain{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		int num1 = 0;
		int num2 = 0;

		//num1
		for(int i = 0; i < str1.length(); i++){
			num1 *= 10;
			num1 += str1.charAt(i) - 'A';
		}

		//num2
		for(int i = 0; i < str2.length(); i++){
			num2 *= 10;
			num2 += str2.charAt(i) - 'A';
		}

		System.out.print(num1 + num2);
	}
}
