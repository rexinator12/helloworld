package newstart;
import java.util.Scanner;
public class trashmakerzero {

	public static void main(String[] args) {
		Scanner uno = new Scanner(System.in);
		System.out.println("Gebe Zahl ein:");
		String resultat = uno.nextLine();
		boolean numeric = true;

        try {
            Double num = Double.parseDouble(resultat);
        } catch (NumberFormatException e) {
            numeric = false;
        }

        if(numeric)
            System.out.println(resultat + " is a number");
        else
            System.out.println(resultat + " is not a number");
    }
}
		


