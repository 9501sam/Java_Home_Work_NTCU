import java.util.Scanner;

public class Main{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int count = 0;
		boolean end = false;
		for(int i = 0; i < w; i++){
			for(int j = 0; j < h; j++){
				count++;
				if(i == x && j == y){
					System.out.print(count);
					end = true;
				}
				if(end){
					break;
				}
			}
			if(end){
				break;
			}
		}

	}
}
