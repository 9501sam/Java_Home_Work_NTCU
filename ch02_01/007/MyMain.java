impor java.util.Scanner;

public class MyMain{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double t = sc.nextDouble();
		double d = sc.nextDouble();
		double ans = t/d;
		System.out.printf("%.2f", ans);
	}
}
