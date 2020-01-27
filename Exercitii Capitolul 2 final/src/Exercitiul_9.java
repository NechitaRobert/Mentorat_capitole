// Scrieti un program JAVA in care se vor primi de la tastatura 5 numere si va fi atasata suma lor
// Aceste numere vor fi cerute folosind o instructiune iterativa

import java.util.Scanner;

public class Exercitiul_9 {
	
	public static void main(String args[])
	{
		
		int numere;
		int nrTastatura;
		int suma = 0;
		Scanner valoriTastatura = new Scanner(System.in);
		for(numere =0; numere < 5; numere++)
		{
			
  	  	    System.out.print("Introduceti numere : ");
	        nrTastatura = valoriTastatura.nextInt();
			
			suma += nrTastatura;
			// a = a + x;
		}
	
		
		//0,1,2,3,4,5
	
		System.out.println("Suma numerelor este " + suma);
		
	}

}
