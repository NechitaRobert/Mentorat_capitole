package capitolul3;
// Scrie un program JAVA pentru a verifica daca un sir dat incepe cu continutul 
// unui alt sir

// importarea 
import java.util.Scanner;

// declararea clasei
public class Exercitiul_14 {

	// declararea metodei main
	public static void main(String args[])
	{
		// declararea variabilelor de instanta
		String oPropozitie;
		String cuvant;
		
		// creearea scanerului
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.println("Scrieti o propozitie pentru primul String ");
		oPropozitie = valoriTastatura.nextLine();
		System.out.println("Ce cuvant credeti ca incepe propozitia ? ");
		cuvant = valoriTastatura.nextLine();
		
		// verificarea daca inceputul propozitiei incepe cu continutul altui sir
		// se face cu metoda "startsWith"
		// exemplu : Stringul creat  : Ana are mere
		//           Cuvantul cautat : Ana
		boolean primaVerificare = oPropozitie.startsWith(cuvant);
		
		// afisarea rezutatului
		// trebuie sa fie true daca se ia in calcul exemplul de mai sus
		System.out.println(oPropozitie + " incepe cu " + cuvant + " ? " + primaVerificare);
		
	}
}
