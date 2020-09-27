package exercitiul2;

// interface for rectangle
interface interfataDreptunghi {

	double getArea(double width, double length);
	double getPerimeter(double width, double length);
}

// implements interface and inheritance variabiles from shape
public class RectangleExercitiul2 extends ShapeExercitiul2 implements interfataDreptunghi{
	
	// variables
	protected double width;
	protected double length;
	
	// constructors
	public RectangleExercitiul2() {}
	public RectangleExercitiul2 (double width, double length) {
		this.width = width;
		this.length = length;
		System.out.println("Construtor RectangleExercitiul2");
	}
	public RectangleExercitiul2( String color, boolean filled) {
	    super (color, filled); 
	}
	
	
	// encapsulation
	public double getWidth() {
		return this.width;
	}
	public void setWidth(double width) {
	     this.width = width;
	}
	
	
	public double getLength() {
		return this.length;
	}
	public void setLength(double length) {
	    this.length = length;
	}
	
	
	// methods
	public double getArea (double width, double length) 
	{
		return width * length;
	}
	public double getPerimeter (double width, double length)
	{
		return 2 * (width + length);
	}
	
	
	@Override
	public String toString() {
		return "RectangleExercitiul2 [width=" + this.width + ", length=" + this.length + "]";
	}
	

}

	
	

