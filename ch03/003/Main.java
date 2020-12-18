import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int layer = sc.nextInt();
		for(int i = 1; i <= layer; i++){
			int space = layer-i;
			int star = 2 * i - 1;

			for(int j = 1; j <= space; j++){
				System.out.print(" ");
			}

			for(int j = 1; j <= star; j++){
				System.out.print("*");
			}

			if(i != layer){
				System.out.println();
			}
		}
	}
}
