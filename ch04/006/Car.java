public class Car{
	//data member
	int speed;
	int mileage;
	String color;
	String brand;

	public Car(){
		speed = 0;
		mileage = 0;
		color = "NoColor";
		brand = "NoBrand";
	}

	public Car(int sp, int mi, String co, String br){
		speed = sp;
		mileage = mi;
		color = co;
		brand = br;
	}

	public int getSpeed(){
		return speed;
	}

	public int getMileage(){
		return mileage;
	}

	public String getColor(){
		return color;
	}

	public String getBrand(){
		return brand;
	}

	public boolean setSpeed(int sp){
		speed = sp;
		return true;
	}

	public boolean setMileage(int mi){
		mileage = mi;
		return true;
	}

	public boolean setColor(String co){
		color = co;
		return true;
	}

	public boolean setBrand(String br){
		brand = br;
		return true;
	}

}
