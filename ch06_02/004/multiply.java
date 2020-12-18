import java.util.Scanner;

public class multiply{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int m1 = sc.nextInt();
		int a[][] = new int[n1][m1];
		for(int i = 0; i < n1; i++)
			for(int j = 0; j < m1; j++)
				a[i][j] = sc.nextInt();

		int n2 = sc.nextInt();
		int m2 = sc.nextInt();
		int b[][] = new int[n2][m2];
		for(int i = 0; i < n2; i++)
			for(int j = 0; j < m2; j++)
				b[i][j] = sc.nextInt();

		int c[][] = new int[n1][m2];
		for(int i = 0; i < n1; i++){
			for(int j = 0; j < m2; j++){
				int sum = 0;
				for(int k = 0; k < m1; k++)
					sum += a[i][k]*b[k][j];
				c[i][j] = sum;
			}
		}

		for(int i = 0; i < n1; i++){
			for(int j = 0; j < m2; j++){
				if(j == 0)
					System.out.printf("%d", c[i][j]);
				else
					System.out.printf("%2d", c[i][j]);
			}
			//if(i != n1)
			//	System.out.println();
		}

	}
}
