import java.util.Scanner;
import java.lang.Math;

public class MyMain{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		if(x >= 0){
			System.out.print(Math.sqrt(x));
		}else{
			System.out.print("NaN");
		}
	}
}
