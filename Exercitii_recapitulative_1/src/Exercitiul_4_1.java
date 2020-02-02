/*Luati de la tastatura 10 numere intregi si patrati-le intr-un array unidimensional
 *copiati toate elementele dintr-un array in altul in ordine inversa 
 */


import java.util.Arrays;
import java.util.Scanner;

public class Exercitiul_4_1 {
	
	public static void main(String args[])
	{
	    
		// declararea variabilei
		int dimensiune;
				
		// creearea scanerului
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.println("Specificati ce dimensiune sa aiba sirul : ");
	    dimensiune = valoriTastatura.nextInt();
		System.out.println("Specificati ce valori a-ti dori sa aiba vectorul : ");
		
		// creearea unui sir
		String vector[] = new String[dimensiune];
		
		// citirea si implementarea valorilor in sir
		for (int i = 0; i < dimensiune; i++ )
		{
			vector[i] = valoriTastatura.next();
		}
		System.out.println();
		
		// Afisarea sirului original
		System.out.println("Vector original : " + Arrays.toString(vector));
		
		// creearea unui vector nou pt a stoca valorile inversate din vectorul vechi
		String vectorNou[] = new String[dimensiune];
		
		// pt inversarea sirului se utilizeaza urm formula
		// invers = dimensiunea vectorului - i(de unde incepe vectorul) -1
		for(int i = 0; i < dimensiune; i++) 
		{	
			vectorNou[i] = vector[vector.length-i-1];
		}
		
		// afisarea rezultatului
		System.out.print("Vector Nou : " + Arrays.toString(vectorNou));
		valoriTastatura.close();
		
			
	}

}
