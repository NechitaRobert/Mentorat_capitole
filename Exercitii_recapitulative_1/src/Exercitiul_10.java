// Scrieti un program java in care initializati un array unidimensional cu 100 de elemente
// random

import java.util.Random;
import java.util.Arrays;

public class Exercitiul_10 {

	public static void main(String args[])
	{
		// intitalizarea elementului random
    	Random aleator = new Random();
		// creearea unei variabile random
		int numereAleatoare = aleator.nextInt(10);
		// creearea vector
		int vector[] = new int[10];
		
		for (int i = 0; i < 10; i++)
		{   
            
			// pt generarea numerelor de la 0 la 100
			int numarAleator = (int)(100 * Math.random());
			vector[i] = numarAleator;
			
			// pentru un sigur element aleator sa populeze tot sirul
			//vector[i] = numereAleatoare; 
			
			// pentru un sir in care sa populeze cu valori diferite
			//vector[i] = aleator.nextInt();
			
		}
		
		// afisarea airului cu valori diferite
		System.out.println(Arrays.toString(vector));
		
//		for (int i = 0; i < 10; i++)
//		{
//		    // afisarea pt un singur element aleator ce populeaza tot sirul
//			System.out.println(vector[i]);
//	     
//		}
		
		
	}
	
}
