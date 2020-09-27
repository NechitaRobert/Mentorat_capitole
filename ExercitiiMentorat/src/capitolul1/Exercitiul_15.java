package capitolul1;
// Exercitiu in care calculam aria si perimetrul unui dreptunghi

// importarea scanerului
import java.util.Scanner;

// declararea clasei
public class Exercitiul_15 {

	// declararea metodei main
	public static void main(String args[])
	{
		// declararea variabilelor de instanta
		// perimetrul unui dreptunghi este P = 2(Lungimea + latimea)
		// aria unui dreptunghi este A = Lungimea*latimea
		double perimetru;
		double lungimeL;
		double latimeL;
		double arie;
		
		// creearea scanerului
		Scanner valoriTastatura = new Scanner(System.in);

		
		// implementarea introducerii valorilor
		System.out.print("Introduceti valoarea Lungimii ");
		lungimeL = valoriTastatura.nextDouble();
		System.out.print("Introduceti valoarea latimii ");
		latimeL = valoriTastatura.nextDouble();
		
		// Calcularea ariei si a perimetrului
		perimetru = 2*(lungimeL+latimeL);
		arie = lungimeL*latimeL;
		
		// Afisarea rezultatelor
		System.out.println("Valoarea ariei este de " + arie);
		System.out.println("Valoarea perimetrului este de " + perimetru);
		
	}
}
