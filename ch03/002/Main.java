import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		char ch;

		for(int i = 1; i <= 5; i++){
			ch = sc.next().charAt(0);
			if(ch == 'a'){
				System.out.print("A");
			}else if(ch == 'b'){
				System.out.print("B");
			}else if(ch == 'c'){
				System.out.print("C");
			}else if(ch == 'd'){
				System.out.print("D");
			}else if(ch == 'e'){
				System.out.print("E");
			}else{
				System.out.print("Z");
			}

			if(i < 5){
				System.out.print(" ");
			}
		}
	}
}
