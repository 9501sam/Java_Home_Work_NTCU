import java.util.Scanner;

public class MyMain{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		if( id.length() == 10 && ('A' <= id.charAt(0) && id.charAt(0) <= 'Z') 
				&& (id.charAt(1) == '1' || id.charAt(1) == '2') ){
			System.out.print(1);
		}else{
			System.out.print(0);
		}
	}
}
