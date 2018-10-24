package game;

import java.util.Scanner;

public class GameApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Human player = new Human(); //human
		Computer quartz = new Computer(); //rock
		ComputerRandom beamo = new ComputerRandom(); //cpu random player
		String opponentPrompt = "Enter 1 for RockPlayer or 2 for CPU";
		String gameChoice = "R for rock, P for paper or S for scissors?:";
		String endGame = "Want to play again?(Y/N)";
		//String enterName = "Hello player, Enter your name: ";

	}
	
	
	
		public void playRockPaperScissors() {
			boolean keepPlaying = true;
			Player p = null;

			//get player name
			

			System.out.println("Which player do you want to play?");
			//int versus = 
			if (versus == 1) {
				p = quartz;
			} else if (versus == 2) {
				p = beamo;
			}

			
			Scanner scnr;
			String choice;
			Human player;
			do {

				System.out.println("Lets play.....Ready");
				System.out.println(" what is your choice?");
				scnr.nextLine();
				
				
				
				player.setRoshamboChoice(choice);
				for (int i = 3; i > 0; i--) {
					System.out.println("...." + i);
				}

				gameLogic(p);

				//keep playing?/end game
				}
		while (keepPlaying);

			System.out.println("Thanks for playing");

			scnr.close();
		



		/**
		 * @param p
		 * @see game logic for win or loss using strings
		 */
		private void gameLogic(Player p) {
			Human player;
			String playerOne = player.generateRoshambo().toString();
			System.out.println(player.getName() + " has " + playerOne);

			String opponent = p.generateRoshambo().toString();
			System.out.println("Opponent has " + opponent);

			if (playerOne.equals("ROCK") && opponent.equals("PAPER")) {
				System.out.println("You lose");
			} else if (playerOne.equals("PAPER") && opponent.equals("ROCK")) {
				System.out.println("You Win");
			} else if (playerOne.equals("ROCK") && opponent.equals("SCISSORS")) {
				System.out.println("You Win");
			} else if (playerOne.equals("SCISSORS") && opponent.equals("ROCK")) {
				System.out.println("You lose");
			} else if (playerOne.equals("PAPER") && opponent.equals("SCISSORS")) {
				System.out.println("You Lose");
			} else if (playerOne.equals("SCISSORS") && opponent.equals("PAPER")) {
				System.out.println("You Win");
			} else {
				System.out.println("Tie");
				}
			}
			
			private static String hello() {
				return "Hello Friend! Let's Play Rock, Paper Scissors!";
		}
}



		private void gameLogic(Player p) {
			// TODO Auto-generated method stub
			
		}
}
