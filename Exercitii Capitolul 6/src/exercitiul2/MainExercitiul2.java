package exercitiul2;

public class MainExercitiul2 {

	public static void main(String args[] ) {
		
        // circle
        CircleExercitiul2 cerc = new CircleExercitiul2();
		double radius = cerc.getRadius();
		System.out.println("Raza cercului este " + radius);
		double arie = cerc.getArea();
		System.out.println("Aria cercului este " + arie);
		double perimetru = cerc.getPerimeter();
		System.out.println("Perimetrul cercului este " + perimetru);
		String informatie = cerc.toString2(radius);
		System.out.println(informatie);
		String toString1 = cerc.toString1(radius);
		System.out.println(toString1);
	    System.out.println();
		
		// rectangle
		RectangleExercitiul2 dreptunghiular = new RectangleExercitiul2(1, 2);
		double latime = dreptunghiular.getWidth();
		System.out.println(latime);
		double inaltime = dreptunghiular.getLength();
		System.out.println(inaltime);
		double arie2 = dreptunghiular.getArea(latime, inaltime);
		System.out.println("Aria dreptunghiului este de " + arie2 + " cm");
		double perimetru2 = dreptunghiular.getArea(latime, inaltime);
		System.out.println("Perimetrul dreptunghiului este de " + perimetru2 + " cm");
	    System.out.println(dreptunghiular.toString());
		System.out.println();
	    
		// square
	    SquareExercitiul2 patrat = new SquareExercitiul2(2, 3, 4 );
		System.out.println(patrat.toString());
	}
	
}
