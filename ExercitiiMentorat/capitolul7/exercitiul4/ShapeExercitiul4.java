package exercitiul4;

import java.util.Scanner;

abstract class ShapeExercitiul4 {

    String culoare;
    
    
	Scanner valoriTastatura  = new Scanner(System.in);
	public void print() {}

	// aici faci sa ascunzi metodelele fata de utilizator
	abstract double arie();  // metoda din circle  si rectangle
	public abstract String toString(); // metoda de afisarare din circle si rectangle
	
	public ShapeExercitiul4() {}
	// constructorul pentru clasa abstracta
	// constructor for abstract class
	public ShapeExercitiul4(String color) {
		this.culoare = color;
	}
	
	public String getCuloare() {
		return this.culoare;
	}
	public String setCuloare(String culoare) {
		return this.culoare = culoare;
	}
		
//	// metoda pt clasa abstracta
//	// method for abstract class
//	public String getColor() {
//		return culoare;
//	}
//	
	
	
}