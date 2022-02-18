package packomat;
import java.util.Random;
import java.util.Scanner;
public class kopfoderzahl {
    public static double play(double geld)  {
        int mo = 0;
        int random;
        double einsatz = 0;
        String koz111;
        boolean play = true;
        while (play) {
            if(geld <= 0) {
                System.out.println("Du hast kein geld");
                play(geld);
            }
            //checkt ob einsatz ein double ist und ob man noch geld hat
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Wieviel Geld willst du einsetzen?");
        if(scan2.hasNextDouble()) {
            einsatz = scan2.nextDouble();
            scan2.nextLine();
        }else { 
            System.out.println("Bitte gebe ein Zahl ein");
            kopfoderzahl.play(geld);
        }
        
        if(einsatz > geld) {
            System.out.println("Du hast nicht so viel Geld. Du hast "+geld);
            play(geld);
        }
        //checkt ob man kopf oder zahl schreibt, setzt dann es in mo 
        while(true) {
            System.out.println("Kopf oder Zahl?");
            koz111 = scan2.nextLine();
            if (koz111.equals("Zahl") || koz111.equals("Kopf")) {
              break;
            }
            System.out.println(koz111 + " ungültige angabe");
        }
        while(true) {
            if (koz111.equals("Kopf")) {
                mo = 0;
                break;
                
            } else if (koz111.equals("Zahl")) {
                mo = 1;
                break;
                
            } else {
                System.out.println("Invalid Input");
                
            }
        }
            Random rand = new Random();
            random = rand.nextInt(2);
            if(random == 0) {
                System.out.println("Kopf");
            }else {
                System.out.println("Zahl");
            }
            if(mo == random) {
                System.out.println("Du hast gewonnen");
                geld = geld - einsatz;
                einsatz = einsatz * 2;
                geld = geld + einsatz;
                System.out.println(geld);
                
            }else {
                System.out.println("Du hast verloren"); 
                geld = geld - einsatz;
                System.out.println(geld);
            }
            System.out.println("Willst du nochmals spielen? (ja/nein) ");
            while (true) {
                String answer = scan2.next();
                if (answer.toLowerCase().equals("ja")) {
                    kopfoderzahl.play(geld);
                } else if (answer.toLowerCase().equals("nein")) {
                    play = false;
                    break;
                } else {
                    System.out.println("Invalid Input");
                }
                
            }
        }
        return geld;
    }
}