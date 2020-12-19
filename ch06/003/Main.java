import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		str1 = str1.toLowerCase();
		String str2 = sc.next();
		str2 = str2.toLowerCase();

		int index = 0; //point to str1;
		for(int i = 0; i < str2.length(); i++){ //str2.charAt(i) is target
			while(index < str1.length() && str1.charAt(index) != str2.charAt(i))
				index++;
			if(index >= str1.length())
				break;
		}

		if(index < str1.length())
			System.out.print("Y");
		else
			System.out.print("N");
	}
}
