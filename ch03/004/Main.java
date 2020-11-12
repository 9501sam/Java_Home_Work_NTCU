import java.util.Scanner;
import java.util.InputMismatchException;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n;
		try{
			n = sc.nextInt();
			switch(n){
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
					System.out.print("day");
					break;
				case 6:
					System.out.print("night");
					break;
				case 7:
					System.out.print("rest");
					break;
				default:
					System.out.print("Input Error");
					break;
			}
		}catch(InputMismatchException e){
			//System.err.print("Input Error!");
			System.out.print("Input Error");
		}
	}
}
