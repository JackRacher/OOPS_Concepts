package Inheritance;

class A{
	A(){
		System.out.println("A class constructor");
	}
}
class B extends A{
	B(){
		System.out.println("B class constructor");
	}
}

class C extends B{
	C(){
		System.out.println("c class constructor");
	}
}
public class SampleMultiLevel {

	public static void main(String[] args) {
		C obj = new C();
	}
}
