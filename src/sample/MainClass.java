package sample;

public class MainClass {
	
	public static void main(String[] args) {
        Car myCar = new Car("V8", 4);
        myCar.startCar();
    }

}

/*class Car extends Engine{
	
	private String type;
	private int count;
	
	
	public Car(String type, int count) {
		super(type);
		type = this.type;
		count = this.count;
	}
	
	Wheels wheels = new Wheels(count);
	public void startCar() {
		
		super.start();
		wheels.rotate();		
	}
}*/
class Car{
	private Engine er ;
	private Wheels wr;
	
	public Car(String str , int countType) {
		this.er = new Engine(str);
		this.wr = new Wheels(countType);
	}
	
	public void startCar() {
		er.start();
		wr.rotate();
	}
}

class Engine {
    private String type;
 
    public Engine(String type) {
        this.type = type;
    }
 
    public void start() {
        System.out.println(type + " engine started.");
    }
}
 
class Wheels  {
    private int count;
 
    public Wheels(int count) {
        this.count = count;
    }
 
    public void rotate() {
        System.out.println("Wheels are rotating.");
    }
}
 
 
