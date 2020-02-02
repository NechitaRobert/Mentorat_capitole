/*Scrieti un program pentru a gasi suma si produsul tuturor elementelor unui array
 *unidimensional
 * */

import java.util.Scanner;

public class Exercitiul_5 {

	public static void main(String args[])
	{
		// creearea variabilelor
		int dimensiune;
		int suma = 0;
		int produs = 1;
		
		// creearea scanerului
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.println("Specificati dimensiune vectorului ");
		dimensiune = valoriTastatura.nextInt();
		
		// creearea matricii
		int vector[] = new int[dimensiune];
		
		// citirea si implementarea valorilor in vector
		System.out.println("Specificati valorile vectorului ");
		for (int i = 0; i < dimensiune; i++)
		{
			vector[i] = valoriTastatura.nextInt();
		}
		
		for (int i = 0; i < dimensiune; i++)
		{
			// suma numerelor
			// exemplu : 1 2 4
			/*  0 = 0 + pozitia[0] => 0 = 0 + 1 = 1
			 *  1 = 1 + pozitia[1] => 1 = 1 + 2 = 3
			 *  3 = 3 + pozitia[2] => 3 = 3 + 4 = 7
 			 */
			suma = suma + vector[i];	
		}
		
		// afisarea sumei
		System.out.println("Suma numerelor este " + suma);
		
		
		for (int i = 0; i < dimensiune; i++)
		{	
			// idem si la produs doar ca va fi inmultire
			produs = produs * vector[i];
		}
		
		// afisarea produsului
		System.out.println("Produsul numerelor este " + produs);
		
		
	}
	
}
