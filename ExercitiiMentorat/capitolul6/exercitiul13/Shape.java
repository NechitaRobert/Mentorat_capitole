package exercitiul13;

public class Shape {

	private String color = "red" ;
	private boolean filled = true ;
	
	public Shape() {}
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
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
	
	public String toString(String color, boolean filled) {
		return (color  + " " + filled);
	} 
	
	public static void main (String args[])
	{
		Shape forma = new Shape();
		String culoare = forma.getColor();
		Boolean umplut = forma.getFilled();
		
		String rosuUmplut = forma.toString(culoare, umplut);
		System.out.println(rosuUmplut);
	}
	
}
