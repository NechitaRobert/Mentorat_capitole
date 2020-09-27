package exercitiul4;

public class Exercitiul4 {

	public static void main(String args[])
	{

		ShapeExercitiul4 forma;
		RectangleExercitiul4 dreptunghi = new RectangleExercitiul4();	
		forma = dreptunghi;
		forma.print();
		System.out.println(forma.arie());
		System.out.println(forma.toString());
		System.out.println("Lungimea dreptunghiului este de " + dreptunghi.getLungime() + " cm");
		System.out.println("Latimea dreptunghiului este de " + dreptunghi.getLatime() + " cm");
	
		System.out.println();
		CircleExercitiul4 cerc = new CircleExercitiul4();
		forma = cerc;
		forma.print();
		System.out.println(forma.arie());
		System.out.println(forma.toString());
		System.out.println("Raza cercului este de " + cerc.getRaza() + " cm");
	

		
	}
	
	
}
