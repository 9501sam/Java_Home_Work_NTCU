//text book p107
import java.util.Scanner;
import java.text.DecimalFormat;

public class MyMain{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		float x = sc.nextFloat();
		DecimalFormat f1 = new DecimalFormat("0.00");
		DecimalFormat f2 = new DecimalFormat("0.000");
		System.out.println(f1.format(x));
		System.out.print(f2.format(x));
	}
}
