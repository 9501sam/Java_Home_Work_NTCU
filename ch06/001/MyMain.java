import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class MyMain{
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String numStr[] = str.split(" ");
		int numAmount = numStr.length;
		if(numAmount > 50)
			numAmount = 50;

		int num[] = new int[numAmount];

		for(int i = 0; i < numAmount; i++)
			num[i] = Integer.valueOf(numStr[i]);
		
		Arrays.sort(num);

		int thisNumber = num[numAmount-1];
		int amountOfThisNumber = 1;
		for(int i = numAmount-2; i >= 0; i--){
			if(num[i] != thisNumber){
				System.out.println(thisNumber + " " + amountOfThisNumber);
				thisNumber = num[i];
				amountOfThisNumber = 1;
			}else{
				amountOfThisNumber++;
			}
		}
		System.out.print(thisNumber + " " + amountOfThisNumber);
		
	}
}
