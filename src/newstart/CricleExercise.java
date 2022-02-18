package newstart;

public class CricleExercise {

	public static void main(String[] args) {
		Circle firstCircle = new Circle();
		Circle secondCircle = new Circle();
		Circle thirdCircle = new Circle();
		
		firstCircle.radius = 3;
		secondCircle.radius = 8;
		thirdCircle.radius = 5;
		
		System.out.println("Kreis : Radius " + firstCircle.radius + " Umfang: " + firstCircle.getUmfang() + " Flache: " + firstCircle.getFlache());
		System.out.println("Kreis : Radius " + secondCircle.radius + " Umfang: " + secondCircle.getUmfang() + " Flache: " + secondCircle.getFlache());
		System.out.println("Kreis : Radius " + thirdCircle.radius + " Umfang: " + thirdCircle.getUmfang() + " Flache: " + thirdCircle.getFlache());

	}
	
}