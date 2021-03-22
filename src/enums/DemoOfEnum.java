package enums;

enum Operations{
	ADD, SUB, MUL, DIV
}
class Test{
	int a, b;
	Operations op;
	public Test(int a, int b, Operations op) {
		super();
		this.a = a;
		this.b = b;
		this.op = op;
	}

	String getOperations() {
		String res = "";
		switch (op) {

		case ADD:
			res = "Sum = " + (a + b);
			break;
		case SUB:
			res = "SUB = " + (a - b);
			break;
		case MUL:
			res = "Mul = " + (a * b);
			break;
		case DIV:
			res = "Div = " + (a / b);
			break;

		default:
			break;
		}
		return res;
		
	}
}
public class DemoOfEnum {
	public static void main(String[] args) {
		Test test = new Test(10, 20, Operations.ADD);
		System.out.println(test.getOperations());
	}
	

}
