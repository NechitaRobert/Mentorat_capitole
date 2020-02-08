<<<<<<< HEAD
/* Scrieti un program java pentru a gasit al doilea cel mai mare element dintr-un array
 * unidimensional
 * Sorteaza vectorul si preia a doua valoare
 * 
 * */

import java.util.Arrays;
import java.util.Scanner;

public class Exercitiul_9 {

	public static void main(String args[])
	{
			
		
		int dimensiune;
		String index;
		
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.println("Spuneti ce dimensiune sa aiba vectorul ");
		dimensiune = valoriTastatura.nextInt();
		
		System.out.println("Specificati valorile vectorului ");
		String vector[] = new String[dimensiune];
		
		for (int i  = 0; i < vector.length ; i++)
		{
			vector[i] = valoriTastatura.next();
		}
		
		// sortarea vectorului
		Arrays.sort(vector);
		// preluarea valorii 
		System.out.println(vector[2]);
		
	    
		

		
		
	}
	
}
=======
/* Scrieti un program java pentru a gasit al doilea cel mai mare element dintr-un array
 * unidimensional
 * Sorteaza vectorul si preia a doua valoare
 * 
 * */

import java.util.Arrays;
import java.util.Scanner;

public class Exercitiul_9 {

	public static void main(String args[])
	{
			
		
		int dimensiune;
		String index;
		
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.println("Spuneti ce dimensiune sa aiba vectorul ");
		dimensiune = valoriTastatura.nextInt();
		
		System.out.println("Specificati valorile vectorului ");
		String vector[] = new String[dimensiune];
		
		for (int i  = 0; i < vector.length ; i++)
		{
			vector[i] = valoriTastatura.next();
		}
		
		// sortarea vectorului
		Arrays.sort(vector);
		// preluarea valorii 
		System.out.println(vector[2]);
		
	    
		

		
		
	}
	
}
>>>>>>> e991fb12e6548d27accefeb7dc13388b7e3b39cc
