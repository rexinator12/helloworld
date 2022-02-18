package newstart;
import java.util.Scanner;
public class trashmakeruno {

	public static void main(String[] args) {
		Scanner lol = new Scanner(System.in);
		System.out.println("gebe string ein");
		String loli = lol.nextLine();
		int n =	loli.length();
		char first = loli.charAt(0);
		char last = loli.charAt(n - 1);
		System.out.println("First: " + first);
		System.out.println("Last: " + last);
		
		

	}

}
