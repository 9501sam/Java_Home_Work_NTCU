import java.util.Scanner;
import java.math.BigInteger;

public class Factorial{

	static BigInteger f(int n){
		BigInteger ans = new BigInteger("1");
		for(int i = 2; i <= n; i++)
			ans = ans.multiply(BigInteger.valueOf(i));
		return ans;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print(f(num));
	}
}
