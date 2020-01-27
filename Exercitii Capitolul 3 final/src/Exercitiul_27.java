// Scrie un program java pentru a gasi valorile duplicate ale unui array

import java.util.Scanner;
import java.util.Arrays;

public class Exercitiul_27 {

	public static void main(String args[])
	{
		
		int dimensiune;
		int i = 0;
		int j = 0;
		
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.println("Specificati dimensiunea sirului :");
		dimensiune = valoriTastatura.nextInt();
		
		System.out.println("Specificati ce valori contine sirul : ");
		
		// pt valori numerice
//		int vector[] = new int[dimensiune];
		
		// pt valori nenumerice
		String vector[] = new String[dimensiune];
		
		for ( i = 0; i < dimensiune; i++)
		{
			// pt valori numerice
//			vector[i] = valoriTastatura.nextInt();
			
			  // pt valori nenumrice
			  vector[i] = valoriTastatura.next();
		}
		
		// Afisarea vectorului construit
		System.out.print("Valorile vectorului sunt : ");
		for (i = 0; i < dimensiune; i++)
		{
			System.out.print(vector[i] + " ");
		}
		System.out.println();
		
		// Pt aflarea valorilor multiple in vector
		for (i = 0; i < dimensiune - 1; i++)
		{
			for (j = i + 1; j < dimensiune;  j++)
			{   
				// pt valori numerice
//				if((vector[i]) == (vector[j]) && ( i != j))
//				{
//					System.out.println("Elementele duplicate sunt : " + vector[j]);
//				}
				
				// pt valori nenumerice
				if( (vector[i].equals(vector[j]) ) && ( i != j) )
				{
					System.out.println("Elementele duplicate sunt : " + vector[j]);
				}
				
				
			}
		}
		
	}
	
}
