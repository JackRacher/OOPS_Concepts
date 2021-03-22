package abstractAndInterface;

import java.util.Scanner;

interface Shape{
	void accept(Scanner sc);
	void cal_Area();
	void dispArea();
}
class Rectangle implements Shape{
	double length, breath, area;
	@Override
	public void accept(Scanner sc) {
		System.out.println("Enter length and breath: ");
		length = sc.nextDouble();
		breath = sc.nextDouble();
		
	}

	public void cal_Area() {
		area = length * breath;
	}

	@Override
	public void dispArea() {
		System.out.println("Area of rectangle is " + area);
	}
	
}

class Square implements Shape{
	double side, area;
	@Override
	public void accept(Scanner sc) {
		System.out.println("Enter side: ");
		side = sc.nextDouble();
		
	}

	public void cal_Area() {
		area = side * side;
	}

	@Override
	public void dispArea() {
		System.out.println("Area of rectangle is " + area);
	}
	
}
public class Interface_Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape obj = null;
		obj = new Rectangle();
		obj.accept(sc);
		obj.cal_Area();
		obj.dispArea();
		
		obj = new Square();
		obj.accept(sc);
		obj.cal_Area();
		obj.dispArea();
	}

}
