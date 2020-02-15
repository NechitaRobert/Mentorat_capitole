// Exercitiu in care convertim kilometrii pe ora in mile pe ora

// Importarea scanerului
import java.util.Scanner;

// Declararea clasei
public class Exercitiul_20 {
	
	// Declararea metodei main
	public static void main(String args[])
	{
		// Declararea variabilelor de instanta
		// Formula convertii din km/h in mile/h 
		// mile = km/h * 0.62137
		double km, m;
		
		// creearea scannerului
		Scanner kilometri = new Scanner(System.in);
		
		// Introducerea valorilor
		System.out.print("Introduceti cati km/h a-ti parcurs ");
		km = kilometri.nextDouble();
		
		// Aplicarea formulei
		m = km * 0.62137;
		
		// Afisarea rezultatelor
		System.out.println("A-ti parcurs " + m + " mile pe ora");
		
	}

}
