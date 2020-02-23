package exercitiul3;

import java.util.Scanner;

public abstract class Shape {
	

	Scanner valoriTastatura = new Scanner(System.in);
	
	abstract double getArea();
    public abstract String toString();
    public abstract void print();
    
	private String color = "albastru";
	
	Shape() {}
	Shape(String color) {
	   this.color = color;	
	}
	
	
	public String getColor() {
		return this.color;
	}
	public String setColor(String color) {
		return this.color = color;
	}

	
}
