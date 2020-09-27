package capitolul3;
// Scrie un program JAVA pentru a converti caracterele dintr-un sir in litere
// mici(lower case)

// importarea
import java.util.Scanner;

// declararea clasei
public class Exercitiul_16 {

	// declararea metodei main
	public static void main(String args[])
	{
		// declararea variabilei
		String propozitie;
		
		// creearea scanerului
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.println("Spuneti o propozitie ");
		propozitie = valoriTastatura.nextLine();
		
		// schimbarea elementelor scrise cu litere marti din propozitie in litere mici
		// se utilizeaza metoda "toLowerCase()"
		String propozitieNumaiCuLitereMici = propozitie.toLowerCase();
		
		// afisarea primului string
		System.out.println("Propozitia originala : " + propozitie);
		// afisarea string-ului schimbat
		System.out.println("Propozitia actualizata : " + propozitieNumaiCuLitereMici);
		
	}
	
}
