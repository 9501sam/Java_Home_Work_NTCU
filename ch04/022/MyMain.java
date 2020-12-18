import java.util.Scanner;
import java.lang.Math;

public class MyMain{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();

		if(num >= 0.0){
			System.out.print(Math.sqrt(num));
		}else{
			System.out.print("NaN");
		}

	}
}
