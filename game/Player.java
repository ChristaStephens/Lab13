package game;

public abstract class Player {
	
	//We want this to be used across the whole app
	public String name; 
	public String roshamboChoice;
	
	public Player() {}
	
	public Player (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract Roshambo  generateRoshambo();

	public String getRoshamboChoice() {
		return roshamboChoice;
	}

	public void setRoshamboChoice(String roshambo) {
		this.roshamboChoice = roshambo;
	}

	
}
