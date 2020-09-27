package exercitiul13;

public class Square extends Rectangle{

	private double side;
    public Square() {}
	
    
	public Square(double side, double width, double length) {
		super (width, length);
		this.side = length;
	    this.side = width;
	}
	
	public Square(double side, String color, boolean filled ) {
		super (color, filled);
	}
	
	
	
	public double getSide() {
		return this.side;
	}
	public void setSide(double side) {
		this.side = length;
		this.side = width;
	}
	
	
	
	public void setWidth(double side, double length) {
		this.side = length;
	}
	public void setLength(double side, double width) {
		this.side = width;
	}
	
	
	
	public String toString (double side)
	{
		return (super.getFilled() + " " + super.getColor() + " " + side);
	}
	
	
	public static void main(String args[])
	{
		 Square patrat = new Square();
		    
		 // nu afiseaza 1 :(...de ce?
		    double latura = patrat.getSide();
		    System.out.println(latura);
		   
		     patrat.setWidth(latura);
		     patrat.setLength(latura);
		     
		     String informatie = patrat.toString(latura);
		     System.out.println(informatie);
	}
}
