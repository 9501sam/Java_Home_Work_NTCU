//https://stackoverflow.com/questions/13927326/reading-input-till-eof-in-java
import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		char seat[][] = new char[8][4];
		//for(int i = 0; i <= 7; i++)
		//	for(int j = 0; j < 4; j++)
		//		seat[i][j] = (char)(j + 'A');
		//
		for(int i = 0; i <= 7; i++){
			seat[i][0] = 'A';
			seat[i][1] = 'B';
			seat[i][2] = 'C';
			seat[i][3] = 'D';
		}
			//for(int j = 0; j < 4; j++)
			//	seat[i][j] = (char)(j + 'A');

		String str = "";
		while(sc.hasNext()){
			str = sc.next();
			str = str.toUpperCase();
			if('1' <= str.charAt(0) && str.charAt(0) <= '7' &&
					'A' <= str.charAt(1) && str.charAt(1) <= 'D'){
				seat[str.charAt(0) - '0'][str.charAt(1) - 'A'] = 'X';
			}else{
				System.out.print("ERROR");
				return;
			}
		}

		for(int i = 1; i <= 7; i++){
			System.out.print(i + " ");
			for(int j = 0; j < 4; j++){
				System.out.print(seat[i][j]);
				if(j != 3)
					System.out.print(" ");
			}
			if(i != 7)
				System.out.println();
		}

	}
}
