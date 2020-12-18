import java.util.Scanner;

public class MyMain{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();

		int c;
		for(c = 0; c <= 9; c++){
			if(e*111 + c*101 + d*10 == b*101 + e*10)
				break;
		}
		if(c == 10)
			System.out.print(-1);
		else
			System.out.print(c);
	}
}
