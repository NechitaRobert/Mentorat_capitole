package exercitiul2;

// interface for shape class
interface interfataShape {
	String toString (String color, boolean filled);
}

// implements interface for abstract class "Shape"
public abstract class ShapeExercitiul2 implements interfataShape, Patrat {

	// declare variabile
	private String color = "red" ;
	private boolean filled = true ;
	
	// create constructors
	public ShapeExercitiul2() {}
	public ShapeExercitiul2(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	// encapsulation
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
	    this.color = color;
	}
	
	public boolean getFilled() {
		return this.filled;
	}
	public void getFilled(boolean filled) {
		this.filled = filled;
	}
	
	
	// create a method
	public String toString(String color, boolean filled) {
		return (color  + " " + filled);
	} 
	
	
	
	
	
	
	
	
}