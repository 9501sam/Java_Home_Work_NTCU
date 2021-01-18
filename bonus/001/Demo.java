import java.util.Scanner;

class Rectangular{
	public Rectangular(int l, int w){
		setLength(l);
		setWidth(w);
	}
	public void setLength(int l){
		length = l;
	}
	public void setWidth(int w){
		width = w;
	}
	public int getLength(){
		return length;
	}
	public int getWidth(){
		return width;
	}
	private int length;
	private int width;
}

class Cuboid extends Rectangular{
	public Cuboid(int l, int w, int h){
		super(l, w);
		setHeight(h);
	}
	public void setHeight(int h){
		height = h;
	}
	public int getHeight(){
		return height;
	}
	public int getArea(){
		int area = 0;
		area += getLength() * getWidth();
		area += getLength() * getHeight();
		area += getWidth() * getHeight();
		area *= 2;
		return area;
	}
	public int getVolume(){
		return getLength() * getWidth() * getHeight();
	}
	private int height;
}

public class Demo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		Cuboid c = new Cuboid(l, w, h);
		System.out.println(c.getVolume());
		System.out.print(c.getArea());
	}
}
