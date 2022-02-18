package packomat;

import java.util.Scanner;


public class Starter {
	public static void main(String[] args) {
		String game;
		Scanner scan = new Scanner(System.in);
		double geld = 100;
		System.out.println("Dein Kontostand: " + geld);
		while (true) {
		System.out.println("Was möchtest du spielen?(kopfoderzahl, STPES)");
		game = scan.nextLine();
		if (game.equalsIgnoreCase("kopfoderzahl")) {
			kopfoderzahl.play(geld);
		} else if (game.equalsIgnoreCase("STPES")) {
			SchereSteinPapierEchseSpock.play(geld);
			}
		 else {
				System.out.println("Invalid input");
	}
		if (geld == 0) {
			System.out.println("Du hast kein geld");
		}
 }
}
}
