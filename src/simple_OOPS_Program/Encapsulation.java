package simple_OOPS_Program;

class Rectangle{
	double length;
	double breath;
	
	Rectangle(double length, double breath){
		this.length = length;
		this.breath = breath;
	}
	
	double getArea() {
		return length * breath;
	}
	
	double getParimeter() {
		return 2 * (length + breath);
	}
}

public class Encapsulation {
//	static int num1 = 10;
//	int num2 = 20;
//	static void sum() {
//		Encapsulation encapsulation = new Encapsulation();
//		System.out.println(num1 + encapsulation.num2);
//	}
	
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle(10.0, 20.5);
		System.out.println(r.getArea());
		System.out.println(r.getParimeter());
//		sum();
//		String name = "hai";
//		System.out.println(name.replace(name.charAt(0), name.toUpperCase().charAt(0)));
	}

}
