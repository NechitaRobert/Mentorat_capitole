package capitolul4;

// scrieti un program java pentru a elimina un element dintr-un araay unidimensional

import java.util.Scanner;

public class Exercitiul_8 {

	public static void main(String args[])
	{
		
		// declararea variabilelor
		int dimensiune;
		int stergere;
		int numarare = 0;
		
		// creearea scanerului
		Scanner valoriTastatura = new Scanner(System.in);
		// specificarea dimensiunii vectorului
		System.out.println("Specificati dimensiunea vectorului : ");
		dimensiune = valoriTastatura.nextInt();
		
		// creearea vectorului
		int vector[] = new int[dimensiune];
		
		// specificarea valorilor vectorului
		System.out.println("Specificati valorile vectorului : ");
		for (int i = 0; i < dimensiune; i++)
		{
			vector[i] = valoriTastatura.nextInt();
			
		}
		
		// specificam ce valoare va trebui sa fie stearsa din vector
		System.out.println("Specificati ce valoare doriti sa stergeti : ");
		stergere = valoriTastatura.nextInt();
		
		// din vector...
		for (int i = 0; i < dimensiune; i++)
		{
			// daca din vector se gaseste elementul specificat care trebuie sters...
			if(vector[i] == stergere)
			{
				// atunci vectorul va fi cu o unitate mai mica...
		        for (int j = i; j < (dimensiune - 1); j++)
		        {
		            
		        	vector[j] = vector[j + 1];
		        }
				numarare++;
				break;
			}
			
		}
		
		
		if (numarare == 0)
		{
			// daca nr nu a fost gasit se va afisa mesajul de mai jos
			System.out.println("Acest numar " + stergere + " nu a fost gasit");
		}
		else
		{   
			// daca nr a fost gasit se va afisa urm mesaj si noul vector
			System.out.println("Numarul " + stergere + " a fost sters cu succes");
			System.out.println("Vectorul va avea urmatoarea forma : ");
			for (int i = 0; i < ( dimensiune - 1); i++)
			{
				System.out.print("[" + vector[i] + "]");
			}
		}
		
	}
	
}
