package simple_OOPS_Program;

abstract class Student{
	String studentName;
	String studentClass;
	protected static int totalNoOfStudents;
	
	abstract void getPercentage();
	
	public Student(){
		System.out.println("Default constructor");
	}
	static int getNoOfStudents() {
		return totalNoOfStudents;
	}

	public Student(String studentName, String studentClass) {
		this();
		this.studentName = studentName;
		this.studentClass = studentClass;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentClass=" + studentClass + "]";
	}
	
}
class PhysicsStudent{
	int physicmarks;
	int chemistryMarks;
	int mathsmarks;
	
	
	
}

class HistoryStudent{
	
}
public class Collage_Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
