import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Blackjack {
	//Imports vaious things aswell as sets base balance
	static Cards deck = new Cards();
	static Random rand = new Random();
	static Scanner scan = new Scanner(System.in);
	static ArrayList<String> dealer = new ArrayList<String>();
	static ArrayList<String> player = new ArrayList<String>();
	
	//Main Function 
	public static double play(double balance) {
		System.out.println("With how many decks would you like to play? ");
		//Sets amount of decks of cards there are in use
		deck.decks(amountOfDecks());
		
		//loops
		boolean play = true;
		while(play) {
			if (balance == 0) {
				return balance;
			}
			
			//main turn function
			balance = turn(balance);
			
			//Play again checker. 
			System.out.println("Want to play again? (Yes/No) ");
			while (true) {
				String answer = scan.next();
				if (answer.toLowerCase().equals("yes")) {
					break;
				} else if (answer.toLowerCase().equals("no")) {
					play = false;
					break;
				} else {
					System.out.println("Invalid Input");
				}
			}
			
			//if there the deck is running low on cards, add another deck
			if (deck.cards.size() < 10) {
				System.out.println("Not enough cards left, Adding another deck.");
				deck.decks(1);
			}
		}
		return balance;
	}
	
	//turn function used for player turns, runs once on call
	public static double turn(double balance) {
		//random variables
		boolean play = true;
		boolean lose = false;
		double bet = 0;
		boolean blackjack = false;
		
		System.out.println("Your balance is: " + balance + ". How much would you like to bet?");
		//sets bet thanks to betting function
		bet = betting.bet(bet, balance);
		//deals 4 cards, 2 to the player and 2 to the dealer
		randCard(player);
		randCard(dealer);
		randCard(player);
		randCard(dealer);

		//shows cards to player and one of the dealer cards
		System.out.println("Your Cards: " + player + "\nYour Total: " + value(player) + "\nDealers Card: " + dealer.get(1));
		//while loop to indicate the player hasn't chosen stay yet
		while (play){
			if (value(player) == 21 && player.size() == 2) {
				blackjack = true;
				break;
			}
			//if the card value is higher than 21, player busts and breaks out of the loop
			if (value(player) > 21) {
				System.out.println("Bust");
				lose = true;
				break;
			}
			System.out.println("What would you like to do? (Hit, Stay)");
			//Input checker, accepts stay and hit, on hit, gives 1 card to player. On stay, sets play to false breaking out of the outer loop 
			while (true) {
				String input = scan.next().toLowerCase();
				if("hit".equals(input)) {
					randCard(player);
					System.out.println("Your Cards: " + player + "\nYour Total: " + value(player));
					break;
				//on stay, it exits loop
				} else if ("stay".equals(input)) {
					play = false;
					break;
				} else {
					System.out.println("Invalid Input");
				}
			}
		}
		System.out.println("Dealers hand: " + dealer);
		//if the player hasn't busted yet, this runs.
		if (lose == false && blackjack == false) {
			//dealer is given cards until his card value is over 16, prints the result
			boolean dealerBlackjack = (value(dealer) == 21) ? true : false;
			while (value(dealer) < 17) {
				randCard(dealer);
				System.out.println("Dealers Hand: " + dealer);
			}
			//checks if dealer got over 21
			if (value(dealer) > 21) {
				System.out.println("Dealer Busted, you win!");
				balance += bet;
			//if player won, he wins the bet
			} else if (value(player) > value(dealer)) {
				System.out.println("You Win");
				balance += bet;
			//if player and dealer have the same card value, the player gets the bet back (nothing happens as the bet never got subtracted from the balance)
			} else if (value(player) == (value(dealer))&& !dealerBlackjack) {
				System.out.println("Push");
			} else {
			//if player lost, he looses his bet
				System.out.println("You Lose!");
				balance -= bet;
			}
		//makes sure that if there's a blackjack, the player wins 1.5 (unless dealer also has a blackjack)
		} else if (blackjack == true) {
			//dealer also has blackjack, Push
			if (value(dealer) == 21) {
				System.out.println("Push");
			} else {
				//pay 1.5x
				System.out.println("Blackjack");
				balance += bet * 1.5;
			}
		}else {
			//if the player did bust, loses and loses the bet
				System.out.println("You Lose");
				balance -= bet;
		}
		//clears the hands
		dealer.clear();
		player.clear();
		//returns balance to keep track of main balance variable in casino
		return balance;
	}
	//checker if number is valid 
	public static int amountOfDecks() {
		int amount;
		do {
			//checks if input is an integer
            if (!scan.hasNextInt()) {
            	System.out.println("Input has to be a whole number");
            	scan.next();
            } else {
            	break;
            }
            
        } while(true);
		amount = scan.nextInt();
		//input has to be bigger than 0
        if (amount <= 0) {
        	System.out.println("Input has to be >0");
        	//function calls itself
        	amountOfDecks();
        }
		return amount;
	}
	//generates random number and takes card out or array according to number
	public static void randCard(ArrayList<String> person) {
		int randCard = rand.nextInt(deck.cards.size());
		person.add(deck.cards.get(randCard));
		deck.cards.remove(randCard);
	}
	//goes through the hand and counts the value
	public static int value(ArrayList<String> person) {
		int Value = 0; 
		int j = 0; //used to count aces, in case a person gets a double ace
		for (String i : person) {
			//Face cards have a value of 10
			if (i.equals("King")|| i.equals("Queen")|| i.equals("Jack")){
				Value += 10;
				//ace either 11 or 1 depending if the value of the hand will go over 21 or not
			} else if (i.equals("Ace")) {
				Value += 11;
				j++;
			//if card isn't a face card, turns string into int
			} else {
				Value += Integer.parseInt(i);
			}
		}
		//ace value of 1 due to hand being larger than 21
		//j is there to make sure that if there are 2 aces, one can still be 11 and the other one is 1.
		while (j > 0) {
			if (Value > 21) {
				Value -= 10;
			}
			j--;
		}
		return Value;
	}
}