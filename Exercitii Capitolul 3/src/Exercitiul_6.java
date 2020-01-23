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
		
		// declararea variabilelor de instanta
		int dimensiune;
		
		// creearea scanerului
		Scanner valori_tastatura = new Scanner(System.in);
		System.out.println("Ce dimensiune sa aiba vectorul ");
		dimensiune = valori_tastatura.nextInt();
		
		System.out.println("Ce valori sa aiba vectorul ");
		
		// creearea vectorului
		char vector[] = new char[dimensiune];
		
		// metoda de citire a vectorului
		for(int i = 0; i < dimensiune; i++ )
		{
			vector[i] = valori_tastatura.next().charAt(i);
		}
		System.out.println();
		
		// afisarea vectorului
//	    for(int i = 0; i < dimensiune; i++)
//	    {
//	    	System.out.println(vector[i] + " ");
//	    }
	    
		// utlizarea metodei copuValueOf
		// tehnic el copie anumite valori dintr-un vector pe care il declari 
		// jos am spus sa-mi copie valorile de la patratica 1 pan la patratica 3
	    String valori = String.copyValueOf(vector, 1, 3);
	    // aici imi va afisa rezultatele
	    System.out.println(valori);
		
		
	}
	
}
