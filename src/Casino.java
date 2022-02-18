import java.util.Scanner;
public class Casino {
	public static void main(String[] args) {
		//imports
		Scanner scan = new Scanner(System.in);
		//balance to 100 for use by the games
		double balance = 100;
		System.out.println("Your Balance: " + balance);
		//infinite loop so player can switch between games back and fourth
		while (true) {
			//Scanner to see where he wants to play
			System.out.println("Where do you want to play? (Blackjack, Roulette)");
			String answer = scan.next();
			//if answer = x, the run the play function of the game
			if (answer.toLowerCase().equals("blackjack")) {
				balance = Blackjack.play(balance);
				System.out.println("Your Balance: " + balance);
			} else if (answer.toLowerCase().equals("roulette")) {
				balance = Roullette.play(balance);
				System.out.println("Your Balance: " + balance);
			//if neither, invalid input
			} else {
				System.out.println("Invalid input");
			}
			//if balance = 0, it breaks out of the play loop and tells the player that they're broke
			if (balance == 0) {
				System.out.println("Your broke, you suck at gambling");
				break;
			}
		}
	}
}