package capitolul1;
// Exercitiul in care schimbam valorile a 2 varaibile intre ele
// de exemplu a = 3 si b = 4 va fi a = 4 si b = 3

// Importarea scanerului
import java.util.Scanner;


// Declararea clasei
public class Exercitiul_11 {
	
	// Declarea punctului de pornire
	public static void main(String args[])
	{
		// declararea variabilelor de instanta
		int a;
		int b;
		int t;
	
	
	// Creearea scanerului
	Scanner schimb = new Scanner(System.in);
	
	// implementarea introducerii valorilor
	System.out.print("Introdu valoarea lui a : ");
	a = schimb.nextInt();
	
	System.out.print("Introdu valoarea lui b : ");
	b = schimb.nextInt();
	
	System.out.println("Valorile lui a si b inainte de schimb sunt : " + a + " si " + b);
	
	// Schimbarea valorilor intre variabile
	// Nota : Se va folosi o variabila temporara care o vom numi "t"
	
	t = a;
	a = b;
	b = t;
	
	// Afisarea valorilor dupa ce sunt schimbate
	System.out.println("Valorile lui a si b dupa schimb sunt : " + a + " si " + b);
	
	
	}
	

}
