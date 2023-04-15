package week6finalproject;

public class App {

	public static void main(String[] args) {
		Deck newDeck = new Deck();
		//Where you can add names to the players
		Player player1 = new Player("Valgard");
		Player player2 = new Player("Rosso");
		
		newDeck.shuffle();
		
		//This shows the players getting cards
		for (int i = 0; i < 26; i++) {
			player1.draw(newDeck);
			player2.draw(newDeck);
		}
		
		player1.describe();
		player2.describe();
		
		int player1Value, player2Value;
		
		
		//This checks to see who has the higher value and then deems who gets the points
		for (int i = 0; i < 26; i++) {
			
			player1Value = player1.flip().getValue();
			
			player2Value = player2.flip().getValue();
			
			if (player1Value > player2Value) {
				player1.incrementScore();
					System.out.println(player1.getName() + " Takes the round ");
					
			}
			else if (player2Value > player1Value) {
				player2.incrementScore();
				System.out.println(player2.getName() + " Takes the round ");
				
			}
			else {
				System.out.println("Draw");
				
			}
			System.out.println("Score -" + player1.getName() + ": " + player1.getScore() +" " + player2.getName() + ": " + player2.getScore() + "\n");
			
		}
		
		//Showing the final score and winner
		System.out.println("Final Score - " + player1.getName() + ": " + player1.getScore() + " " + player2.getName() + ": " + player2.getScore() + "\n");
		if (player1.getScore() > player2.getScore()) {
			System.out.println(player1.getName() + " Is the victor!");
		}
		else if (player2.getScore() > player1.getScore()) {
			System.out.println(player2.getName() + " Is the victor!");
		}
		else {
			System.out.println("The game is a draw!");
		}

	}

}
