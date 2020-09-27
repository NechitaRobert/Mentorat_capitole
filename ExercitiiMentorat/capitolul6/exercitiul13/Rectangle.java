package exercitiul13;

public class Rectangle extends Shape {
	
	protected double width = 1.0;
	protected double length = 1.0;
	
	public Rectangle() {}
	
	public Rectangle (double width, double length) {
		this.width = width;
		this.length = length;
	}
	public Rectangle( String color, boolean filled) {
	    super (color, filled);
	}
	
	
	
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
	
	
	
	public double getArea (double width, double length) 
	{
		return width * length;
	}
	public double getPerimeter (double width, double length)
	{
		return 2 * (width * length);
	}
	
	
	
	public String toString ()
	{
		return (super.getColor() + " " + super.getFilled() + " " + width + " " + length );
	}
	
	
	public static void main(String args[])
	{
		Rectangle dreptunghiular = new Rectangle();
		double latime = dreptunghiular.getWidth();
		System.out.println(latime);
		double inaltime = dreptunghiular.getLength();
		System.out.println(inaltime);
		
		double arie = dreptunghiular.getArea(latime, inaltime);
		System.out.println("Aria dreptunghiului este de " + arie + " cm");
		double perimetru = dreptunghiular.getArea(latime, inaltime);
		System.out.println("Perimetrul dreptunghiului este de " + perimetru + " cm");
		
		String informatie = dreptunghiular.toString();
		System.out.println(informatie);
		
		
	}
	

}
