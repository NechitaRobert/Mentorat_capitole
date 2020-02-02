/*Luati 5 numere de la tastatura si stocati-le intr-un array unidimensional.
 * Din nou cereti utilizatorului sa scrie un numar la tastatura iar pentru fiecare 
 * numar inserat ii veti spune daca este prezent in acel array 
 * */

import java.util.Scanner;

public class Exercitiul_2 {

	public static void main(String args[])
	{
		// creearea variabilelor
		int numarulCeTrebuieCautat;
		boolean numarGasit = false;
		int vector[] = new int[5];
		
		// creearea scaneului
		Scanner valoriTastatura = new Scanner(System.in);
		// implementarea introducerii valorilor in vector
		System.out.println("Specificati ce valori are vectorul : ");
		
		// citirea vectorului
		for (int i = 0; i < 5; i++)
		{
			vector[i] = valoriTastatura.nextInt();
		}
		
		// implementarea introducerii de cautare in vector
		System.out.println("Specificati ce numar cautati in vector : ");
		numarulCeTrebuieCautat = valoriTastatura.nextInt();
		
		// metoda de cautare in vector
		for (int i = 0; i < 5; i++)
		{
			// se va cauta pentru fiecare valoare din vector
			for (int numar : vector)
			{
				// daca numarul a fost gasit ...
				if (numarulCeTrebuieCautat == numar)
				{
					//... se va declara true  si se va opri executia loop
					numarGasit = true;
					break;
				}
				
			}
		}
		
		// conditia daca numarul se afla in parametrii vectorului
		if(numarGasit)
		{
			// daca nr a fost gasit in vector...se va executa linia de mai jos
			System.out.println("Numarul " + numarulCeTrebuieCautat + " a fost gasit");
		}
		else
		{
			// daca nr nu a fost gasit in vector... se va execua linia de mai jos
			System.out.println("Numarul " + numarulCeTrebuieCautat + " nu a fost gasit");
		}
	}
	
}
