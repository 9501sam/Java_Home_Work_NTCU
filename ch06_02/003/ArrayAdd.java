import java.util.Scanner;

public class ArrayAdd{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[][] = new int[n][m];
		for(int i = 0; i < n; i++)
			for(int j = 0; j < m; j++)
				a[i][j] = sc.nextInt();

		n = sc.nextInt();
		m = sc.nextInt();
		int b[][] = new int[n][m];
		for(int i = 0; i < n; i++)
			for(int j = 0; j < m; j++)
				b[i][j] = sc.nextInt();

		int c[][] = new int[n][m];
		for(int i = 0; i < n; i++)
			for(int j = 0; j < m; j++)
				c[i][j] = a[i][j] + b[i][j];

		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				if(j == 0)
					System.out.printf("%d", c[i][j]);
				else
					System.out.printf("%3d", c[i][j]);
			}
			//if(i != n-1)
			//	System.out.println();
		}

	}
}
