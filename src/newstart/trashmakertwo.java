package newstart;
import java.util.Scanner;
public class trashmakertwo {
	static boolean isValid(String email) {
	      String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
	      return email.matches(regex);
	   }

	public static void main(String[] args) {
		Scanner lol = new Scanner(System.in);
		System.out.println("Geben sie ihre mail an:");
		String email = lol.nextLine();
		System.out.println("The E-mail ID is: " + email);
	    System.out.println("Is the above E-mail ID valid? " + isValid(email));

	}

}
