
public class Circle extends Shape {

	private double radius = 1.0;
	
	public Circle() {}
	public Circle(String color, boolean filled, double radius) {
		super (color, filled);
		this.radius = radius;
	} 
	
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
	
	public String toString (double radius) 
	{
		// nu stiu ce sa scriu aici
		return (super.getColor() + " " + super.getFilled() + " " + radius);
	}
	
	public static void main (String args[])
	{
		Circle cerc = new Circle();
		
		double radius = cerc.getRadius();
		System.out.println(radius);
		
		double arie = cerc.getArea();
		System.out.println(arie);
		
		double perimetru = cerc.getPerimeter();
		System.out.println(perimetru);
		
		
		String informatie = cerc.toString(radius);
		System.out.println(informatie);
	}
	
}
