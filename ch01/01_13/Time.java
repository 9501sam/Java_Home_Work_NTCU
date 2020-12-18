import java.util.Scanner;

public class Time {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		double M=sc.nextDouble();/*兩人相差距離數*/ //要用double去讀
		M = M*100; //把M換成公分
		double rate = 100 - 30*2.54; //每秒兩人會接近的距離（公分）
		double ans = M/rate; 
		ans = Math.ceil(ans); 

		System.out.printf("%.0f", ans);



	}

}

