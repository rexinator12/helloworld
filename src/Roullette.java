import java.util.Random;
import java.util.Scanner;

public class Roullette {
	//imports
	static Random rand = new Random();
	static Scanner scan = new Scanner(System.in);
	
	//main play function, accepts balance
	public static double play(double balance) {
		//variables 
		double bet = 0;
		String prediciton;
		boolean play = true;
		
		//loops if the player wants to play
		while (play) {
			//makes sure player has balance to play
			if (balance == 0) {
				return balance;
			}
			//prints gameplay
			System.out.println("Your Balance: " + balance);
			System.out.println("How much do you want to bet");
			//sets bet
			bet = betting.bet(bet, balance);
			//subtracts bet from balance
			balance -= bet;
			System.out.println("What do you want to bet on? (Red x2, Black x2, Green x14)");
			
			//checker to make sure input is valid
			while (true) {
				String answer = scan.next();
				//checks input if it's red black or green
				if (answer.toLowerCase().equals("red")) {
					prediciton = "red";
					break;
				} else if (answer.toLowerCase().equals("black")) {
					prediciton = "black";
					break;
				} else if (answer.toLowerCase().equals("green")) {
					prediciton = "green";
					break;
				//invalid if it's not one of those three
				} else {
					System.out.println("Invalid Input");
				}
			}
			//runs wheel function and adds it to balance (if lost, bet = 0)
			balance += wheel(bet, prediciton);
			
			//play again checker
			System.out.println("Want to play again? (Yes/No) ");
			while (true) {
				String answer = scan.next();
				if (answer.toLowerCase().equals("yes")) {
					break;
				} else if (answer.toLowerCase().equals("no")) {
					play = false;
					break;
				} else {
					//if input invalid, loops
					System.out.println("Invalid Input");
				}
			}
			
		}
		//returns balance to keep track of main balance variable in casino
		return balance;
	}
	
	//random number generator for the wheel
	public static double wheel(double bet, String prediction) {
		//gets number 0-14
		int spin = rand.nextInt(15);
		//if number is x, then write green and if bet = prediction, pay out
		if (spin == 0) {
			System.out.println("Wheel landed on Green");
			bet = (prediction == "green") ? bet * 14 : 0;
		} else if (spin < 8) {
			System.out.println("Wheel landed on Black");
			bet = (prediction == "black") ? bet * 2 : 0;
		} else{
			System.out.println("Wheel landed on Red");
			bet = (prediction == "red") ? bet * 2 : 0;
		}
		//returns bet to use 
		return bet;
	}
}
