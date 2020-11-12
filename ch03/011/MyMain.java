import java.util.Scanner;

public class MyMain{
	public static void main(String arga[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int g = 0;
		int h = 0;
		int i = 0;

		boolean end = false;
		for(g = 0; g <= 9; g++){
			for(h = 0; h <= 9; h++){
				for(i = 0; i <= 9; i++){
					if(a*100 + b*10 + c*11 + g*100 + h == e*1100 + i*10 + d){
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
			if(end){
				break;
			}
		}
		
		if(i == 10){
			System.out.print(-1);
		}else{
			System.out.println(g);
			System.out.println(h);
			System.out.print(i);
		}

	}
}
