package simple_OOPS_Program;

public class ConstructorOverloading {
	ConstructorOverloading(){
		System.out.println("Default");
	}
	
	ConstructorOverloading(int no){
		this();
		System.out.println("1 prm");
	}
	
	public static void main(String[] args) {
		//ConstructorOverloading c = new ConstructorOverloading(10);
	}
}
