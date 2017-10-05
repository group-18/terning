package terning;

import java.util.Random;

public class Dice {
	private Random rand;


	public Dice() {
		this.rand = new Random();
	}


	// roll the die and return the value (1-6)
	public int roll() {
		return this.rand.nextInt(6) + 1;
	}
	
	// roll the die n times and print the values
	public void rollMultiple(int n) {
		for (int i=1; i<=n; i++) {
			System.out.print(roll() + " ");
		}		
	}
}
