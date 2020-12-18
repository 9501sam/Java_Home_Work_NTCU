import java.util.Scanner;
import java.lang.Math;

public class MyMain{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double OH = sc.nextDouble();
		double ph = 14.00 + Math.log(OH)/Math.log(10);
		System.out.printf("%.2f", Math.round(ph*100)/100.00);
	}
}
