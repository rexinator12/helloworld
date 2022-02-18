package newstart;

public class Circle {
	double radius;
	
	double getUmfang() {
		return 2 * SomeMaths.pi * radius;
		
		
	}
	double getFlache() {
		return SomeMaths.getSquare(radius) * SomeMaths.pi;
	}
	public static void main(String[] args) {
		

	}

}
