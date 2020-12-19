import java.util.Scanner;

public class ArrayEqual{
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

		if(a1.length != a2.length){
			System.out.print("false");
			return;
		}

		for(int i = 0; i < n; i++){
			if(a1[i] != a2[i]){
				System.out.print("false");
				return;
			}
		}

		System.out.print("true");
	}
}
