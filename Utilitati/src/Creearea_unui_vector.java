

import java.util.Scanner;

public class Creearea_unui_vector {

	public static void main(String args[])
	{
		// creearea unui vector
		// String[] variabila = {"valoare", "valoare", etc}
		//String[] a = {"1", "2", "3", "4"};
		
		//System.out.println(a[0]);
		
		// creeam o variabila pt a defini dimensiunea sirului
     	int dimensiune;
		
		
		// creeam un scanner pt a specifica dimensiunea vectorului si pt a specifica valorile sale
		Scanner valori_tastatura = new Scanner(System.in);
		System.out.println("Ce dimensiune sa aiba vectorul ? ");
    	dimensiune = valori_tastatura.nextInt();
		System.out.println("Ce valori sa aiba vectorul ");
		
		// declararea vectorului 
//		int vector[] = new int[dimensiune];
		// pentru valori String(sir de caractere)
		String vector[] = new String[dimensiune];
		
		// citirea vectorului
		for(int i = 0; i < dimensiune; i++ )
		{
//			vector[i] = valori_tastatura.nextInt();
			// pentru valori string(sir de caractere)
			vector[i] = valori_tastatura.nextLine();
		}
		System.out.println();
		
		// afisarea vectorului
		for(int i = 0; i < dimensiune; i++ )
		{
			System.out.print(vector[i] + " ");
		}
		
		
		
		
		
	}
	
}
