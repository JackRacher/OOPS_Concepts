package simple_OOPS_Program;

import java.util.*;

class Dice {

	int faceValue;

	void roll() {
		Random random = new Random();
		faceValue = random.nextInt(6) + 1;
	}
}

class Player {
	String pname;
	int pValue;

	void accept(String name) {
		pname = name;
	}

	void throwDice(Dice d1, Dice d2) {
		d1.roll();
		d2.roll();

		pValue = d1.faceValue + d2.faceValue;
		System.out.println(pValue + " = " + d1.faceValue + " + " + d2.faceValue);
	}

}

public class Dice_Game {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Dice d1 = new Dice();
		Dice d2 = new Dice();

		Player p1 = new Player();
		Player p2 = new Player();

		System.out.println("Enter p1 name: ");
		p1.accept(scanner.next());

		//Printing Player name
		System.out.println("Enter p2 name: ");
		p2.accept(scanner.next());

		p1.throwDice(d1, d2);
		p2.throwDice(d1, d2);

		String re = "";
		if (p1.pValue > p2.pValue) {
			System.out.println(p1.pname + ": p1 wins");
		} else if (p2.pValue > p1.pValue) {
			System.out.println(p2.pname + ": p1 wins");
		} else {
			re = "Try Again";
		}
		System.out.println(re);
		scanner.close();
	}
}
