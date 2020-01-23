// Scrieti un program in JAVA care sa afiseze caracterul de la o anumita
// pozitie din string


import java.util.Scanner;
import java.util.Locale;

public class Exercitiul_1 {

	public static void main(String args[])
	{
		// declararea variabilei
		String propozitie;
		
	
		
		// creearea scanerului
		Scanner valori_tastatura = new Scanner(System.in);
		System.out.println("Scrieti va rog ce doriti ");
		propozitie = valori_tastatura.nextLine();
		
		
		// utilizarea indexarii
		// se utlizeaza pt a arata valoarea dintr-un string dintr-o anumita pozitie
		int index1 = propozitie.charAt(0);
		// afisarea valorii 
		System.out.println((char)index1);
		
	}
	
}
