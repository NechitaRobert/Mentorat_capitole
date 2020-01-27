// Scrieti in java pentru a calcula coeficientul(presupun catul) si restul

// importarea scanerului
import java.util.Scanner;

// declararea clasei
public class Exercitiul_25 {
	
	// declararea metodei main
	public static void main(String args[])
	{   
		// declararea variabilelor de instanta
		// formula unei impartiti
		// deimpartitor : impartitor = catul + restul
		int deimpartitor, impartitor, cat, rest;
		
		// creearea scanerului
		 Scanner valoriTastatura = new Scanner(System.in);
		 
		// implementarea introducerii valorilor
		System.out.print("Valoarea deimpartitorului ");
		deimpartitor = valoriTastatura.nextInt();
		System.out.print("Valoarea impartitorului ");
		impartitor = valoriTastatura.nextInt();
		
		// aplicarea formulei
		cat = deimpartitor / impartitor ;
		rest = deimpartitor % impartitor ;
		
		// afisarea rezultatelor
		System.out.println("Valoarea catului este " + cat);
		System.out.println("Valoarea restului este " + rest);
		 
		 
	}

}
