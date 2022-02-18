package newstart;
import java.util.Scanner;
public class slaufeforwssd {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Gebe note ein");
	 int eingabe = sc.nextInt();
	 System.out.println("Du hast " + eingabe + " einegeben.");
	 
	 switch (eingabe) {
	 case 0: 
		 System.out.println(" Deine note ist scheisse!");
		 break;
	 case 1:
		 System.out.println(" Deine note ist scheisse!");
		 break;
	 case 2:
		 System.out.println(" Deine note ist scheisse!");
		 break;
	 case 3:
		 System.out.println(" Deine note ist scheisse!");
		 break;
	 case 4:
		 System.out.println(" Deine note ist ok!");
		 break;
	 case 5:
		 System.out.println(" Deine note ist gut!");
		 break;
	 case 6: 
		 System.out.println(" Deine note ist sehr gut!");
		 break;
	 }

	}

}
