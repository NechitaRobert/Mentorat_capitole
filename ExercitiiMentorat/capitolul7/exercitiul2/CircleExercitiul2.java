package exercitiul2;

// interface
interface interfataCerc {
	String toString1(double radius);
	String toString2(double radius);	
	double getArea();
	double getPerimeter();
}

// implements interface for class "circle " and inheritance variables from class "shape"
public class CircleExercitiul2 extends ShapeExercitiul2 implements interfataCerc {

	// declare variabile
	private double radius = 1.0;
	
	// create constructors
	public CircleExercitiul2() {}
	public CircleExercitiul2(String color, boolean filled, double radius) {
		super (color, filled);
		this.radius = radius;
	} 
	
	// encapsulation
	public double getRadius() {
		return this.radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	public double getArea() {
		return 3.14 * (radius * radius);
	}
	public double getPerimeter() {
		return  3.14 * (2 * radius);
	}
	
	
	// create string methods
	public String toString1 (double radius) {
		// nu stiu ce sa scriu aici
		return (super.getColor() + " " + super.getFilled() + " " + radius);
	}
	
	public String toString2 (double radius) {
		return ("Aria cercului este de " + getArea() +  " cm si perimetrul este de " + getPerimeter() + " cm");
	}
	
  
	
}

