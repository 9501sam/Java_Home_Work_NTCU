import java.util.Scanner;

public class Demo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		double n = sc.nextDouble();

		double guess = n / 2.0;
		double r = 0.0;
		for(int i = 1; i <= 7; i++){
			r = n / guess;
			guess = (guess + r) / 2.0;
		}

		System.out.printf("%.0f", r);
	}
}
