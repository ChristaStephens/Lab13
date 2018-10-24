package game;

public class Computer extends Player {
public int shoot;
	
	public Computer(String name, int shoot) {
		super();
		this.name = name;
		this.shoot = shoot;
	}

//	@Override
//	public String toString() {
//		return "Computer [shoot=" + shoot + ", name=" + name + "]";
//	}

	public Computer() {}
	
	@Override
	public Roshambo generateRoshambo() {

		return Roshambo.ROCK;
	}

	@Override
	public String toString() {
		return "RockPlayer chooses " + generateRoshambo();
	}
}
