public class Car{
	public int speed;
	public int mileage;
	public String color;
	public String brand;

	public Car(){
		speed = 0;
		mileage = 0;
		color = "NoColor";
		brand = "NoBrand";
	}

	public Car(int sp, int mil, String co, String br){
		speed = sp;
		mileage = mil;
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

	public boolean setMileage(int mil){
		mileage = mil;
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

	public boolean setCar(String co, String br){
		color = co;
		brand = br;
		return true;
	}

	public boolean setCar(int sp, int mil, String co, String br){
		speed = sp;
		mileage = mil;
		color = co;
		brand = br;
		return true;
	}

	public boolean setColor(String co, String mil){
		return true;
	}

	public boolean setColor(int cp, int br, String co, String mil){
		return true;
	}

}
