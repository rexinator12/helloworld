package newstart;
import java.util.Scanner;

public class onono {

	public static void main(String[] args) {
		Scanner noa = new Scanner(System.in);
		System.out.println("Zahl a eingeben");
		int a = noa.nextInt();
		Scanner nob = new Scanner(System.in);
		System.out.println("Zahl b eingeben");
		int b = nob.nextInt();
		
		if(a > b) {
			System.out.println("A ist grösser als B");
		}
		else if(a < b) {
			System.out.println("B ist grösser als A");
		}
		else {
			System.out.println("A und B sind gleich viel");
		}

	}

}
