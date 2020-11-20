//text book 274 278
import java.util.Scanner;
import java.util.StringTokenizer;

public class MyMain{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringTokenizer words = new StringTokenizer(str, ", "); //note: the space

		String lastName = words.nextToken();
		String firstName = words.nextToken();
		String middleName = words.nextToken();

		System.out.print("Hello");
		
		if(!firstName.equalsIgnoreCase("None"))
			System.out.print(" " + firstName);

		if(!middleName.equalsIgnoreCase("None"))
			System.out.print(" " + middleName);

		if(!lastName.equalsIgnoreCase("None"))
			System.out.print(" " + lastName);

	}
}
