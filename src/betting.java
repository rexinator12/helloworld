import java.util.Scanner;

//betting function used by both Blackjack and Roulette
public class betting {
	static Scanner scan = new Scanner(System.in);
	public static double bet(double bet, double balance) {
		do {
			//checks if input is a double
            if (!scan.hasNextDouble()) {
            	System.out.println("Input has to be a whole number");
            	scan.next();
            } else {
            	break;
            }
        } while(true);  
		//if bet is too big, complains
		bet = scan.nextDouble();
        if (bet <= 0 || bet > balance) {
        	System.out.println("You must have enough balance and bet size has to be >0. Your Balance: "+ balance);
        	bet(bet, balance);
        }
		return bet;
	}
}
