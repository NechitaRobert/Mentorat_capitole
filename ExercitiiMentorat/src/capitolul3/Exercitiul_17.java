package capitolul3;
// Scrieti un program JAVA in care convertesti toate caractere dintr-un 
// sir in littere mari(UpperCase)

// importarea scanerului
import java.util.Scanner;

// declararea clasei
public class Exercitiul_17 {

	// declararea metodei main
	public static void main(String args[])
	{
		// declararea variabilei
		String propozitie;
		
		// creearea scanerului
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.println("Spuneti o propozitie ");
		propozitie = valoriTastatura.nextLine();
		
		// schimbarea literelor mici in litere mari din propozitie
		// se utlizeaza metoda "toUpperCase"
		// ex : ana are mere => ANA ARE MERE
		String propozitieCuLitereMari = propozitie.toUpperCase();
		
		// Afisarea string-ului original
		System.out.println("Propozitia originala : " + propozitie);
		// Afisarea string-ului actualizat
		System.out.println("Propozitia actualizata : " + propozitieCuLitereMari);
		
	}
	
}
