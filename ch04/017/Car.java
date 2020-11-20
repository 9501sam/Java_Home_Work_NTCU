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

	public Car(int sp){
		speed = sp;
		mileage = 0;
		color = "NoColor";
		brand = "NoBrand";
	}

	public Car(String br){
		speed = 0;
		mileage = 0;
		color = "NoColor";
		brand = br;
	}

	public Car(String co, String br){
		speed = 0;
		mileage = 0;
		color = co;
		brand = br;
	}

	public Car(int sp, int mil, String co, String br){
		speed = sp;
		mileage = mil;
		color = co;
		brand = br;
	}

}
