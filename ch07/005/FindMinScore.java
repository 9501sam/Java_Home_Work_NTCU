import java.util.Scanner;
import java.lang.Math;

public class FindMinScore{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		String inputStr[] = str.split(" ");

		double a[] = new double[5];
		for(int i = 0; i < 5; i++)
			a[i] = Double.valueOf(inputStr[i]);

		for(int i = 0; i < 5; i++){
			int minIndex = i;
			for(int j = i+1; j < 5; j++){
				if(a[j] < a[minIndex])
					minIndex = j;
			}

			double temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
			
			String t = inputStr[i];
			inputStr[i] = inputStr[minIndex];
			inputStr[minIndex] = t;
		}

		System.out.println("Output");
		System.out.println("The least score is " + inputStr[0]);
		System.out.println("The scores are:");
		for(int i = 0; i < 5; i++){
			System.out.print(inputStr[i] + " differs from min by ");
			System.out.printf("%.1f", a[i]-a[0]);
			if(i != 4)
				System.out.println();
		}

	}

}
