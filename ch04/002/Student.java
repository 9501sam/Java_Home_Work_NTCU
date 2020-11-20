public class Student{
	int age;
	int grade;
	String name;
	String id;

	boolean setAge(int age){
		this.age = age;
		return true;
	}
	
	boolean setId(String id){
		this.id = id;
		return true;
	}

	boolean setStudent(int grade, String name, String id){
		this.grade = grade;
		this.name = name;
		this.id = id;
		return true;
	}
}
