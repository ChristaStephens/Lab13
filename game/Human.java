package game;

public class Human extends Player {
	
	public int shoot;
	
	public Human(String name, int shoot) {
		super();
		this.name = name;
		this.shoot = shoot;
	}
	// need 123 shoot
	public Human() {}
	
	@Override
	public String toString() {
		return "Human [shoot=" + shoot + ", name=" + name + "]";
	}
	
	@Override
	public Roshambo generateRoshambo() {

		if (roshamboChoice.equalsIgnoreCase("R")) {
			return Roshambo.ROCK;
		} else if (roshamboChoice.equalsIgnoreCase("P")) {
			return Roshambo.PAPER;
		} else
			return Roshambo.SCISSORS;
	}
	
	

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getRoshamboChoice() {
		return roshamboChoice;
	}

	@Override
	public void setRoshamboChoice(String roshamboChoice) {
		this.roshamboChoice = roshamboChoice;
	}
	
	
	
}
