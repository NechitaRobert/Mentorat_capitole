package exercitiul3;


public class Triangle extends Shape {

	private int baza;
	private int inaltimea;
	
	public Triangle() {}
	public Triangle(int baza, int inaltimea, String color) {
		super(color);
		this.baza = baza;
		this.inaltimea = inaltimea;
	}
	
	public int getBaza() {
		return this.baza;
	}
	public int setBaza(int baza) {
		return this.baza = baza;
	}
	
	
	public int getInaltime() {
		return this.inaltimea;
	}
	public int setInaltime(int inaltimea) {
		return this.inaltimea = inaltimea;
	}
		
	
	@Override
	double getArea() {
		return (baza*inaltimea)/2 ;
	}

	
	@Override
	public String toString() {
		return "Triangle [baza=" + baza + ", inaltimea=" + inaltimea
				+  ", getColor()=" + getColor() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	@Override
	public void print() {
		System.out.println("Cati cm are baza ? : ");
		baza = valoriTastatura.nextInt();
		System.out.println("Cati cm are inaltimea ? : ");
		inaltimea = valoriTastatura.nextInt();
		
	}
	
	// metoda test
	public static void main(String args[])
	{
		Triangle triunghi = new Triangle();
		triunghi.print();
		double arieTriunghi = triunghi.getArea();
		System.out.println("Aria triunghiului este de " + arieTriunghi);
		String informatieTriunghi = triunghi.toString();
		System.out.println(informatieTriunghi);
	}
	
	
	

}
