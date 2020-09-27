package capitolul3;
// Scrie un program in JAVA pentru a creea un vector de caractere dintr-un string

// importarea scanerului
import java.util.Scanner;

// declararea clasei
public class Exercitiul_15 {

	// declararea metodei main
	public static void main(String args[])
	{
		// creearea variabilei de instanta
		String propozitie;
		
		// creearea scanerului
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.println("Creati o propozitie ");
		propozitie = valoriTastatura.nextLine();
		
		// transformarea ditr-un string intr-un vector
		// se utilizeaza metoda "toCharArray"
		// ex : string Ana => vector {'A' , 'n' , 'a'}
		char vector[] = propozitie.toCharArray();
		
		// Afisarea rezultatelor
		System.out.println(vector);
		
	}
	
}
