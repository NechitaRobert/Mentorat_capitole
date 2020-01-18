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
		int deimpartitorD, impartitorI, cat, rest;
		
		// creearea scanerului
		 Scanner deimpartitor = new Scanner(System.in);
		 Scanner impartitor = new Scanner(System.in);
		 
		// creearea valorilor
		System.out.print("Valoarea deimpartitorului ");
		deimpartitorD = deimpartitor.nextInt();
		System.out.print("Valoarea impartitorului ");
		impartitorI = impartitor.nextInt();
		
		// aplicarea formulei
		cat = deimpartitorD / impartitorI ;
		rest = deimpartitorD % impartitorI ;
		
		// afisarea rezultatelor
		System.out.println("Valoarea catului este " + cat);
		System.out.println("Valoarea restului este " + rest);
		 
		 
	}

}
