import java.util.Scanner;

public class ArrayAdd{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a1[] = new int[n];
		for(int i = 0; i < n; i++)
			a1[i] = sc.nextInt();

		n = sc.nextInt();
		int a2[] = new int[n];
		for(int i = 0; i < n; i++)
			a2[i] = sc.nextInt();

		int a3[] = new int[n];
		for(int i = 0; i < n; i++)
			a3[i] = a1[i] + a2[i];

		for(int i = 0; i < n; i++){
			System.out.print(a3[i]);
			if(i != n-1)
				System.out.print(" ");
		}
	}
}
