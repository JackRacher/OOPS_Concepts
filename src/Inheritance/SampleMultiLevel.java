package Inheritance;

import java.math.BigInteger;

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

class BaseClass{
	public static int sum(int a, int b) {
		return a + b;
	}
}

class DerivedClass extends BaseClass{
	public static int sum(int a, int b) {
		return 2*a + 2*b;
	}
}

public class SampleMultiLevel {

	public static void main(String[] args) {
		C obj = new C();
		
	}
}
