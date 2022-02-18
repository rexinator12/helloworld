package packomat;

import java.util.Random;
import java.util.Scanner;

public class SchereSteinPapierEchseSpock{
	public static double play(double geld) {  
    Scanner scanner = new Scanner(System.in);
    int Punkte1 = 0;
    int Punkte2 = 0;
    int round = 0;
    boolean spielen = true;
    while (true) {
    	while(round == 0) {
    		System.out.println("Wieviel runden willst du spielen?");
    		round = scanner.nextInt();
    		scanner.nextLine();
    	}
    	// Array mit der Auswah
      String[] auswahl = {"stein", "papier", "schere", "echse", "spock"};
      // computer nimmt zufällig ein Figur
      String cmove = auswahl[new Random().nextInt(auswahl.length)];
      String move;
      //man kann auswählen wieviel runden man spielen kann
    //solange die Angabe nicht übereinstimmt geht es nicht weiter
      while(true) {
        System.out.println("Du wählst:(stein, papier, schere, echse, or spock)");
        move = scanner.nextLine();
        if (move.equalsIgnoreCase("stein") || move.equalsIgnoreCase("papier") || move.equalsIgnoreCase("schere") || move.equalsIgnoreCase("echse") || move.equalsIgnoreCase("spock")) {
          break;
        }else {
        System.out.println(move + " ungültige angabe");
        }
    }
      //vergleicht was wir haben und was computer hat
      System.out.println("Computer spielt: " + cmove);
      if (move.equals(cmove)) {
        System.out.println("Unentschieden");
      }
      else if (move.equalsIgnoreCase("stein")) {
        if (cmove.equalsIgnoreCase("papier")) {
          System.out.println("Papier überdeckt Stein. Du verlierst!");
          Punkte2++;
        } 
        else if (cmove.equalsIgnoreCase("schere")) {
          System.out.println("Stein zerstört Schere. Du gewinnst!");
          Punkte1++;
        } 
        else if (cmove.equalsIgnoreCase("echse")) {
          System.out.println("Stein zerquetscht Echse. Du gewinnst!");
          Punkte1++;
        } 
        else if (cmove.equalsIgnoreCase("spock")) {
          System.out.println("Spock vaporisiert Stein. Du verlierst");
          Punkte2++;
        }
      }
      
      else if (move.equalsIgnoreCase("papier")) {
        if (cmove.equalsIgnoreCase("stein")) {
          System.out.println("Papier überdeckt Stein. Du gewinnst!");
          Punkte1++;
        } 
        else if (cmove.equalsIgnoreCase("schere")) {
          System.out.println("Schere schneidet Papier. Du verlierst!");
          Punkte2++;

        }
        else if (cmove.equalsIgnoreCase("echse")) {
          System.out.println("Echse frisst Papier. Du verlierst!");
          Punkte2++;

        }
        else if (cmove.equalsIgnoreCase("spock")) {
          System.out.println("Papier wiederlegt Spock. Du gewinnst!");
          Punkte1++;
        }
      }
      
      else if (move.equalsIgnoreCase("schere")) {
        if (cmove.equalsIgnoreCase("papier")) {
          System.out.println("Schere schneidet Papier. Du gewinnst!");
          Punkte1++;
        }
        else if (cmove.equalsIgnoreCase("stein")) {
          System.out.println("Stein zerstört Schere. Du verlierst!");
          Punkte2++;

        }
        else if (cmove.equalsIgnoreCase("echse")) {
          System.out.println("Schere köpft Echse. Du gewinnst!");
          Punkte1++;

        }
        else if (cmove.equalsIgnoreCase("spock")) {
          System.out.println("Spock zerstört Schere. Du verlierst!");
          Punkte2++;
        }
      }
      
      else if (move.equalsIgnoreCase("echse")) {
        if (cmove.equalsIgnoreCase("stein")) {
          System.out.println("Stein zerquetscht Echse. Du verlierst!");
          Punkte2++;
        }
        else if (cmove.equalsIgnoreCase("papier")) {
          System.out.println("Echse frisst Papier. Du gewinnst!");
          Punkte1++;
        }
        else if (cmove.equalsIgnoreCase("schere")) {
          System.out.println("Schere köpft Echse. Du verlierst!");
          Punkte2++;
        }
        else if (cmove.equalsIgnoreCase("spock")) {
          System.out.println("Echse vergiftet Spock. Du gewinnst!");
          Punkte1++;
        }
      }
      
      else if (move.equalsIgnoreCase("spock")) {
        if (cmove.equalsIgnoreCase("papier")) {
          System.out.println("Papier wiederlegt Spock. Du verlierst!");
          Punkte2++;
        }
        else if (cmove.equalsIgnoreCase("stein")) {
          System.out.println("Spock vaporisiert Stein. Du gewinnst!");
          Punkte1++;
        }
        else if (cmove.equalsIgnoreCase("schere")) {
          System.out.println("Spock zerstört Schere. Du gewinnst!");
          Punkte1++;
        }
        else if (cmove.equalsIgnoreCase("echse")) {
          System.out.println("Echse vergiftet Spock. Du verlierst!");
          Punkte2++;
        }
      }
      //gibt punkte aus
      System.out.println("Deine Punktestand:"+ Punkte1
    		  + "\nComputer Punktestand:"+ Punkte2);
      if(Punkte2 == round) {
    	  Punkte1 = 0;
    	  Punkte2 = 0;
    	  geld = geld - 10;
    	  round = 0;
    	  System.out.println("Du hast verloren. Minus 10 Punkte"
    	  + "\n Kontostand: "+geld);
    	  System.out.println("Nochmals spielen? (ja/nein)");
          String playAgain = scanner.nextLine();
          if (!playAgain.equalsIgnoreCase("ja")) {
            break;
          }else if (!playAgain.equalsIgnoreCase("nein")) {
        	  continue;
          }
      }
      if(Punkte1 == round) {
    	  Punkte1 = 0;
    	  Punkte2 = 0;
    	  geld = geld + 10;
    	  round = 0;
    	  System.out.println("Du hast das Spiel gegen Computer gewonnen. Plus 10 Punkte"
    	  + "\n Kontostand: "+geld);
    	  System.out.println("Nochmals spielen? (ja/nein)");
          String playAgain = scanner.nextLine();
          if (!playAgain.equalsIgnoreCase("ja")) {
            break;
          } else if (!playAgain.equalsIgnoreCase("nein")) {
        	  continue;
          }
      }
    }
    return geld;
  }
}