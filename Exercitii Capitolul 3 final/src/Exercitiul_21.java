// Scrieti un program java pentru a calcula valoarea medie a elementelor unui array/vector(sir)

// importarea scanerului
import java.util.Scanner;

// declararea clasei
public class Exercitiul_21 {

	// declararea metodei main
	public static void main(String args[])
	{
		
		// declararea variabilelor
		int dimensiune;
		// ca media numerelor sa nu fie rotunjita trebuie declarate cu double
		double suma = 0; // declaram ca incepem de la 0 => vom specifica mai tarziu
		double medie;    
		
		// crearea scanerului
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.println("Specificati dimensiunea vectorului ");
		dimensiune = valoriTastatura.nextInt();
		
		System.out.println("Specificati ce valori contine vectorul:  ");
		
		// declararea vectorului
		int vector[] = new int[dimensiune];
		
		// citirea vectorului
		for(int i = 0; i < dimensiune; i++)
		{ 
			// imprimarea vectorului cu valori specificate prin scanner
			vector[i] = valoriTastatura.nextInt();
			
			// insumarea valorilor imprimate in scaner
			// nota : trebuie specificat ca incepe din vector
			// exemplu : forma incepe      : suma(0) = x + vector(0) 
			//           de unde suma(0)   : unde e specficat ca variabila 'suma' incepe cu valoarea 0
			//           de unde vector(0) : unde e specificat ca vectorul incepe cu valoarea 0
			//           dimeniunea vectorului : 4  ----- valori vector {2, 3, 5, 4}
			//           0 = 2  + 0 => 2           
			//           2 = 3  + 2 => 5
			//           5 = 5  + 5 => 10
			//          10 = 10 + 4 => 14 
			//          14 = suma 
			
			suma = suma + vector[i];
			 
		}
		// Afisarea sumei din vector
		System.out.println("Suma numerelor din vector este " + suma);
		
		// media numerelor = suma totala / la cate numere sunt
		// exemplu = 14 / 4 => 3.5
		
		// putem folosi metoda " .length " pt a numara cate valori sunt imprimate in vector
	    // medie  = suma / vector.length;
	    
	    // -- O alta metoda ce putem face media --
	    // dat faptul ca am specificat mai sus dimensiunea vectorului
		 medie = suma / dimensiune;
	    
	    // Afisarea rezultatului
		System.out.println("Valoarea medie a valorilor din vector este " + medie);
		
		
		
	}
	
}
