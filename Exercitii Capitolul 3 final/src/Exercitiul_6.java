//Scrieti un program java pentru a crea un obiect String cu continutul
// unui array de caractere
// Ex : char[] vector = new char[] {'1' , '2' , '3' , '4'};
// Din acest tablou de caractere va trebui sa contruiesti un 
// obiect de tip String 
// Foloseste metoda copyValueOf;
// String valori = String.copyValueOf(vector, 1, 3);

// importarea scanerului
import java.util.Scanner;

// declararea clasei
public class Exercitiul_6 {

	// metoda main
	public static void main(String args[])
	{
		// declararea vectorului
		char[] vector = new char[] {'1','2','3','4'};
		
		// creearea unui string ce va contine elementele vectorului
		// in cazul asta valorile care incep de la index1.(valoare 2) pana la index3.(valoarea 4)
		String valori = String.copyValueOf(vector, 1, 3);
		// Afisarea rezultatelor
		System.out.println(valori);
		
		
		// ----------- NOTA ------------
		// In cazul de mai jos nu e posibil ca valorile char sa aiba mai mult de 1 element 
		// Dar este bun doar daca pui un element pe 1 valoare
		// De exemplu : char '12' va fi citit doar '1' in schimb daca pui '2' va citi '2' - idem pt litere
		// e ok si exemplu asta doar cand trebuie sa luam in calcul doar primu element 

		
//		// declararea variabilelor de instanta
//		int dimensiune;
//		
//		// creearea scanerului
//		Scanner valori_tastatura = new Scanner(System.in);
//		System.out.println("Ce dimensiune sa aiba vectorul ");
//		dimensiune = valori_tastatura.nextInt();
//		
//		System.out.println("Ce valori sa aiba vectorul ");
//		
//		// creearea vectorului
//		char vector[] = new char[dimensiune];
//		
//		// metoda de citire a vectorului
//		for(int i = 0; i < dimensiune; i++ )
//		{
//			vector[i] = valori_tastatura.next().charAt(0);
//		}
//		System.out.println();
//		
//		// afisarea vectorului
////	    for(int i = 0; i < dimensiune; i++)
////	    {
////	    	System.out.println(vector[i] + " ");
////	    }
//	    
//		// utlizarea metodei copuValueOf
//		// tehnic el copie anumite valori dintr-un vector pe care il declari 
//		// jos am spus sa-mi copie valorile de la patratica 1 pan la patratica 3
//	    String valori = String.copyValueOf(vector, 1, 3);
//	    // aici imi va afisa rezultatele
//	    System.out.println(valori);
//		
		
	}
	
}
