package exercitiul3;


public class mainExercitiul3 {

	public static void main(String args[])
	{
		Shape forma;
		
		Rectangle dreptunghi = new Rectangle();
		forma = dreptunghi;
		forma.print();
		System.out.println("Aria dreptunghiului este de " + forma.getArea());
		System.out.println(forma.toString());
		
		
		Triangle triunghi = new Triangle();
		forma = triunghi;
		forma.print();
		System.out.println("Aria triunghiului este de " + forma.getArea());
		System.out.println(forma.toString());
			
		
	}
	
	
	
}
