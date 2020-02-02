// Luati 5 numere de la tastatura si stocati-le intr-un array unidimensional
// Afiseaza fiecare element rasturnat

import java.util.Scanner;

public class Exercitiul_1 {

	public static void main(String args[])
	{
		// declararea vectorului
		int vector[] = new int[5];
		
		// creearea scanerului
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.println("Scrieti valorile dorite : ");
		
		// citirea vectorului
		for (int i = 0; i < 5; i++ )
		{
			vector[i] = valoriTastatura.nextInt();
		}
		
		// afisarea vectorului
		for (int i = 0; i < 5; i++)
		{
			System.out.print( vector[i] + " ");
		}	
		
		// pt inversarea numerelor
		
		// se implementeaza o variabila noua pt a ne ajuta sa inversam cifrele din fiecare valoare
		int invers = 0;
	

		// implementarea inversatii cifrelor din fiecare valoare
		for (int i = 0; i < 5; i++)
		{
			invers = 0; 
			// aici implementam inversarea cifrelor pt fiecare valoare i
			while(vector[i] != 0)
			{
				// implementarea formulei
				// formula functioneaza in felul urmator :
				
/*  formula : x = x * 10 + x % 10;
 *            n = n / 10
 *  exemplu : n(numar) = 4856
 *  4856 diferit de 0? => da => se executa iteratia
 *  4856 = 4856 * 10 + 4856 % 10(4856 : 10 = 485 r 6) = 48560 + 6 = 48566 = 4856[6] 
 *  4856 = 4856 / 10 = 485 rest x
 *   485 =  485 * 10 +  485 % 10  (485 : 10 = 48 r 5) =  4850 + 5 =  4855 =  485[5] 
 *   485 =  485 / 10 =  48 rest x
 *    48 =   48 * 10 +  48 % 10   (48 : 10 = 4 r 8)   =   480 + 8 =  488  =  48[8]
 *    48 =   48 / 10 =  4 rest x
 *     4 =    4 * 10 +  4 % 10    (4 : 10 = 0 r 4)    =    40 + 4 =    44 =  4[4]
 *     4 =    4 / 10 = 0 => STOP ITERATIE
 *   Afisare rezultat : 6584
 * */
				invers = invers * 10 + vector[i] % 10 ;
				vector[i] = vector[i] / 10;
				
			}
			vector[i] = invers;
			
		}
		System.out.println();
		
		// afisarea rezultatelor
		for (int i = 0; i < 5; i++)
		{
			System.out.print(vector[i] + " ");
		}
		
		
		
	}
	
}
