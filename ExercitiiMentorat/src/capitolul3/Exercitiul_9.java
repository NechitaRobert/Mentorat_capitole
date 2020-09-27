package capitolul3;
// Scrieti un program java pentru a compara un sir dat cu un alt sir, ignorand
// litere mari sau mici

import java.util.Scanner;

public class Exercitiul_9 {

	public static void main(String args[])
	{
		String primaComparare;
		String aDouaComparare;
		
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.print("Prima valoare ");
		primaComparare = valoriTastatura.nextLine();
		System.out.print("A doua valoare ");
		aDouaComparare = valoriTastatura.nextLine();
		
		
		boolean egalitate = primaComparare.equalsIgnoreCase(aDouaComparare);
		System.out.println(egalitate);
		
		
		
	}
	
}
