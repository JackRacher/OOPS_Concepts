package simple_OOPS_Program;

class Student1{
	int sno;
	String sname;
	public Student1(int sno, String sname) {
		this.sno = sno;
		this.sname = sname;
	}

	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + "]";
	}
}

class Marks extends Student1{
	int m1, m2, m3;

	public Marks(int sno, String sname, int m1, int m2, int m3) {
		super(sno, sname);
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}

	@Override
	public String toString() {
		return "Marks [m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", sno=" + sno + ", sname=" + sname + "]";
	}
	
}
public class SimpleStudentMarksProgram {

	public static void main(String[] args) {
		Marks marks = new Marks(10, "Ramu", 59, 45, 58);
		System.out.println(marks.toString());
	}
}
