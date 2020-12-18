import java.util.Scanner;

public class MyMain{
	public static void main(String args[]){
		Scanne sc = new Scanner(System.in);
		long ms = sc.nextLong();

		long s = ms/1000;

		long m = s/60;
		s = s%60;

		long h = m/60;
		m = m%60;

		long d = h/24;
		h = h%24;

		System.out.print(d + " " + h + " " + m + " " + s);
	}
}
