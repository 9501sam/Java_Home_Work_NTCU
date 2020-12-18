import java.util.Scanner;
import java.lang.Math;

public class GradeBookDemo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int student = sc.nextInt();
		int test = sc.nextInt();

		int a[][] = new int[student][test];

		for(int i = 0; i < student; i++)
			for(int j = 0; j < test; j++)
				a[i][j] = sc.nextInt();

		for(int i = 0; i < test; i++){ //exam"i+1": 
			int sum = 0;
			for(int j = 0; j < student; j++)
				sum += a[j][i];
			System.out.println("exam" + (i+1) + ":" + Math.round((double)sum/student));
		}

		for(int i = 0; i < student; i++){ //student i+1
			int sum = 0;
			for(int j = 0; j < test; j++)
				sum += a[i][j];
			System.out.println("st" + (i+1) + ":" + Math.round((double)sum/test));
		}
	}
}
