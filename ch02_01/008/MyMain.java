import java.util.Scanner;

public class MyMain{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int sum = 0;

		for(int i = 1; i <= 3; i++){
			String it = sc.next();
			int a = sc.nextInt();
			int p = sc.nextInt();

			System.out.println(it + " " + a + " " + p + " " + a*p);
			sum += a*p;
		}

		System.out.print("sum " + sum);
	}
}
