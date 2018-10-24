package game;

import java.util.Random;

public class ComputerRandom extends Player {
	
public int shoot;
	
	public ComputerRandom(String name, int shoot) {
		super();
		this.name = name;
		this.shoot = shoot;
	}
	
	public ComputerRandom() {}
	
	public Roshambo generateRoshambo() {
		Random rand = new Random();
		int n = rand.nextInt(3);

		if (n == 0) {
			return Roshambo.ROCK;
		} else if (n == 1) {
			return Roshambo.PAPER;
		} else {
			return Roshambo.SCISSORS;
		}
	}
//	@Override
//	public String toString() {
//		return "ComputerRandom [shoot=" + shoot + ", name=" + name + "]";
//	}

}
