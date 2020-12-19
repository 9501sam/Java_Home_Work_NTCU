public class Demo{
	public static void main(String argsp[]){
		A haha = new A(13);
		B baba = new B(14);
		B jaja = new B(haha);
		B gaga = new B(baba);

		haha.print();
		baba.print();
		jaja.print();
		gaga.print();
	}
}
