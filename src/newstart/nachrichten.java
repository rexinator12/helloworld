package newstart;

public class nachrichten {

		  public static void main(String [] args) {
		    int x = 0;
		    int y = 30;
		    for (int au�en = 0; au�en < 3; au�en++) {
		      for(int innen = 4; innen > 1; innen--) {

				x--;

		        y = y - 2;
		        if (x == 6) {
					break; 
				} 
				x = x + 3; 
			} 
			y = y - 2; } 
		    System.out.println(x + " " + y);
		  }


}
