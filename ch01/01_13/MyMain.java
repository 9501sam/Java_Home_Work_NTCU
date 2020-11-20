import java.util.Scanner;

public class MyMain {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int M=sc.nextInt();/*兩人相差距離數*/ //要用double去讀
		double S=sc.nextDouble(); //題目只有一個輸入，上一行已經讀過了


		/*(S*1)+ M > (S*0.762)*/
		S>0.762S-M; //java 沒有直接解不等式的功能
		System.out.println(Math.floor(S)); //無條件進入是用ceil



	}

}

