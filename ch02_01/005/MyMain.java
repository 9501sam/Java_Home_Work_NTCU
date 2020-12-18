import java.util.Scanner;

public class MyMain{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double income = sc.nextDouble();
		double tax = 0;

		if(income <= 15000){
			System.out.print("0.00");
		}else if(15000 < income && income <= 30000){
			tax = (income-15000) * 0.05;
			System.out.printf("%.2f", tax);
		}else if(30000 < income){
			tax += (15000) * 0.05;
			tax += (income - 30000) * 0.1;
			System.out.printf("%.2f", tax);
		}
	}
}
