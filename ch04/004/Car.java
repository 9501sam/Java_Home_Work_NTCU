public class Car{
	int speed;
	int mileage;
	String color;
	String brand;

	public boolean setSpeed(int speed){
		this.speed = speed;
		return true;
	}
	public boolean setMileage(int mileage){
		this.mileage = mileage;
		return true;
	}
	public boolean setColor(String color){
		this.color = color;
		return true;
	}
	public boolean setBrand(String brand){
		this.brand = brand;
		return true;
	}
	public boolean setCar(String color, String brand){
		setColor(color);
		setBrand(brand);
		return true;
	}
	public boolean setCar(int speed, int mileage, String color, String brand){
		setColor(color);
		setBrand(brand);
		setSpeed(speed);
		setMileage(mileage);
		return true;
	}
}
