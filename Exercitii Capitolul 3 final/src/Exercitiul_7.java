// Scrieti un program java pentru a verifica daca un sir dat se termina cu 
// continutul altui sir

import java.util.Scanner;

public class Exercitiul_7 {

	public static void main(String args[])
	{
		
		// declararea instantelor
		String primulArgument;
		String alDoileaArgument;
		String cautare;
		
		// declararea scanerelor pt variabile
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.print("Scrieti primele argumente ");
		primulArgument = valoriTastatura.nextLine();
		System.out.print("Scrieti al doilea argument ");
		alDoileaArgument = valoriTastatura.nextLine();
		System.out.print("Cu ce elemente a-ti dori sa faceti cautarea ? ");
        cautare = valoriTastatura.nextLine();		
		
        // pentru verificarea continutului sirurilor se face cu endWith
        // acestea vor indica cu "adevarat" sau "fals" daca sirurile se termina cu elementele precizate
		boolean primulRezultat = primulArgument.endsWith(cautare);
		boolean alDoileaRezultat = alDoileaArgument.endsWith(alDoileaArgument);
		
		// afisarea rezultatelor
		System.out.println(primulRezultat);
		System.out.println(alDoileaRezultat);
		
		
	}
	
}
