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
		Scanner lungime = new Scanner(System.in);
		Scanner latime = new Scanner(System.in);
		
		// Introducerea valorilor
		System.out.print("Introduceti valoarea Lungimii ");
		lungimeL = lungime.nextDouble();
		System.out.print("Introduceti valoarea latimii ");
		latimeL = latime.nextDouble();
		
		// Calcularea ariei si a perimetrului
		perimetru = 2*(lungimeL+latimeL);
		arie = lungimeL*latimeL;
		
		// Afisarea rezultatelor
		System.out.println("Valoarea ariei este de " + arie);
		System.out.println("Valoarea perimetrului este de " + perimetru);
		
	}
}
