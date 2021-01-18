import java.util.Scanner;

class C{
	public C(int b){
		setBasePay(b);
	}

	public void setBasePay(int b){
		basePay = b;
	}
	public int getBasePay(){
		return basePay;
	}

	public int getSalary(){
		return basePay;
	}
	private int basePay;
	//public static int lunch = 1800;

}

class B extends C{
	public B(int b){
		super(b);
	}
	public int getSalary(){
		return super.getBasePay() + 1800 + 3000;
	}
}

class A extends B{
	public A(int b){
		super(b);
	}
	public int getSalary(){
		return super.getBasePay() + 1800 + 2000 + 5000;
	}
}

public class Demo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int basePay = sc.nextInt();
		C p1 = new C(basePay);
		B p2 = new B(basePay);
		A p3 = new A(basePay);
		System.out.println(p1.getSalary());
		System.out.println(p3.getSalary());
		System.out.print(p2.getSalary());
	}
}
