//text book p100
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class MyMain{
	public static void main(String argsp[]){
		Scanner sc = new Scanner(System.in);
		float x = sc.nextFloat();

		NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance(Locale.TAIWAN);
		System.out.printf(moneyFormatter.format(x));
	}
}
