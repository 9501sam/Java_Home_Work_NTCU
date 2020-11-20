"student1 use getGrade and setGrade, student2 use getName and setName"

public class Student{
	private int grade;
	private String name;

	//constructor
	public Student(){
		grade = 1;
		name = "NoNBame";
	}
	public Student(int grade, String name){
		this.grade = grade;
		this.name = name;
	}

	//f()
	public int getGrade(){
		return grade;
	}
	public boolean setGrade(int grade){
		this.grade = grade;
		return true;
	}
	public String getName(){
		return name;
	}
	public boolean setName(String name){
		this.name = name;
		return true;
	}
}

