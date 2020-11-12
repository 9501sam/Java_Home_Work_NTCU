//text book p106
import java.util.Scanner;
import java.text.DecimalFormat;

public class MyMain{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		float x = sc.nextFloat();

		DecimalFormat f = new DecimalFormat("0.00%");

		System.out.print(f.format(x));
	}
}
