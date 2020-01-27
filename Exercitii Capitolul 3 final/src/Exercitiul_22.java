// Scrie un program java pentru a testa daca un array contine o valoare specifica  

import java.util.Scanner;

public class Exercitiul_22 {

	public static void main(String args[])
	{
		
		int dimensiune;
		int numarSpecific;
		boolean gasit = false;
		
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.println("Specificati dimensiunea vectorului : ");
		dimensiune = valoriTastatura.nextInt();
		System.out.println("Specificati o valoare in care sa verifice daca acea valoare exista in vector ");
		numarSpecific = valoriTastatura.nextInt();
		
		System.out.println("Specificati ce valori contine vectorul : ");
		
		int vector[] = new int[dimensiune];
		
		for(int i = 0; i < dimensiune; i++)
		{
			vector[i] = valoriTastatura.nextInt();
			for ( int numar : vector)
			{
				if (numarSpecific == numar)
				{
  				    gasit = true;
					break;
				}
			}
		}
		if(gasit)
		{
			System.out.println( "numarul " + numarSpecific + " este gasit in sir");
		}
		else
		{
			System.out.println("numarul " + numarSpecific + "nu a fost gasit in sir");
     	}
		
		
	}
	
	
}
