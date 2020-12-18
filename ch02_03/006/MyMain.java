//http://zetcode.com/java/numberformat/
//https://blog.csdn.net/well386/article/details/53945796
//use double
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
import java.math.RoundingMode;

public class MyMain{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		NumberFormat Y1 = NumberFormat.getCurrencyInstance(Locale.US);
		//Y1.setRoundingMode(RoundingMode.HALF_UP);
		NumberFormat Y2 = NumberFormat.getCurrencyInstance(Locale.TAIWAN);
		//Y2.setRoundingMode(RoundingMode.HALF_UP);
		System.out.println(Y1.format(x));
		System.out.print(Y2.format(x));
	}
}
