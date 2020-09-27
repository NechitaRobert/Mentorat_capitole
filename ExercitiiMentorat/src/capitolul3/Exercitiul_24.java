package capitolul3;
// Scrieti un program java pentru a copia un array

import java.util.Scanner;
import java.util.Arrays;

public class Exercitiul_24 {

	public static void main(String args[])
	{
		
		int dimensiune;
		
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.println("Specificati ce dimensiune a-ti dori sa aiba sirul dumneavoastra de numere ?" );
		dimensiune = valoriTastatura.nextInt();
		System.out.println("Ce valori sa aiba vectorul ? : ");
		
		String vector[] = new String[dimensiune];
		
		for (int i = 0; i < dimensiune; i ++)
		{
			vector[i] = valoriTastatura.next();
		}
		System.out.println();
		
		
		String vectorNou[] = new String[dimensiune];
		System.out.println("Vector vechi : " + Arrays.toString(vector));
		
		for (int i = 0; i < dimensiune; i++ )
		{
			vectorNou[i] = vector[i];
		}
		
		System.out.println("Vector nou : " + Arrays.toString(vectorNou));
		
		
	}
	
}
