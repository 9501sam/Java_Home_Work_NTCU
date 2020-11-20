public class Student{
	public int age;
	public int grade;
	public String name;
	public String id;

	public Student(){
		age = 20;
		grade = 1;
		name = "NoName";
		id = "ACS001";
	}

	public Student(int age){
		this.age = age;
		grade = 1;
		name = "NoName";
		id = "ACS001";
	}

	public Student(String name){
		age = 20;
		grade = 1;
		this.name = name;
		id = "ACS001";
	}

	public Student(int age, int grade, String name, String id){
		this.age = age;
		this.grade = grade;
		this.name = name;
		this.id = id;
	}

}
