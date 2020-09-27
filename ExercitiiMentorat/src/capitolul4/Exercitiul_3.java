package capitolul4;
/*Luati 10 numere de la tastatura si imprimati urmatoarele
 * Cate numere pozitive au fost inserate
 * Cate numere negative au fost inserate
 * Cate numere pare au fost inserate
 * Cate numere impare au fost inserate
 */


import java.util.Scanner;

public class Exercitiul_3 {

	public static void main(String args[])
	{
		// declararea vectorului
		
		int vector[] = new int[10];
		// declararea variabilelor
		int numerePozitive = 0;
		int numereNegative = 0;
		int numerePare = 0;
		int numereImpare = 0;
		
		// creearea scanerului
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.println("Specificati valorile vectorului : ");
		
	    // citirea vectorului 
		for ( int i = 0; i < 10; i++)
		{
			vector[i] = valoriTastatura.nextInt();
		}
		
		// afisarea vectorului
		for ( int i = 0; i < 10; i++)
		{
			System.out.print(vector[i] + " ");
		}
		System.out.println();
		
		// pentru numararea numerelor pozitive si negative
		for (int i = 0; i < 10; i++)
		{
			// intai verifica fiecare numar si daca respecta conditia de mai jos atunci...
			// daca fiecare numar e mai mare ca 0
			if(vector[i] >= 0)
			{
				//.. se va executa linia de mai jos...
				numerePozitive++;
			}
			// ..altfel...
			else
			{
				// se va executa linia de mai jos
				numereNegative++;
			}
		}
		
		// pentru numararea numerelor pare si impare
		for (int i = 0; i < 10; i++)
		{
			// intai verifica fiecare numar si daca respecta conditia de mai jos atunci...
			// daca fiecare numar impartit la 2 da rest 0
			if(vector[i] % 2 == 0)
			{   
				//.. se va executa linia de mai jos...
				numerePare++;
			}
			//..altfel...
			else
			{ 
				//.. se va executa linia de mai jos..
				numereImpare++;
			}
		}
		
		// afisarea rezultatelor
		System.out.println("Numere pozitive : " + numerePozitive);
		System.out.println("Numere negative : " + numereNegative);
		System.out.println("Numere pare : "     + numerePare);
		System.out.println("Numere impare : "   + numereImpare);
		
		
	}
	
}
