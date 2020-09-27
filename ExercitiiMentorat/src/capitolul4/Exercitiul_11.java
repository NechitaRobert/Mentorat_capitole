package capitolul4;

// Scrieti un program java pentru a gasi valorile duplicate dintr-un array unidimensional

import java.util.Scanner;

public class Exercitiul_11 {

	public static void main(String args[])
	{
		int i = 0;
		int j = 0;
		int sir[] = new int[5];
		
		Scanner valoriTastatura = new Scanner(System.in);
		
		System.out.println("Specificati valorile sirului");
		for (i = 0; i < sir.length; i++)
		{
			sir[i] = valoriTastatura.nextInt();
		}
		
		for (i = 0; i < sir.length - 1; i++)
		{
			for (j = i + 1 ; j < sir.length; j++)
			{
				
				if(sir[i] == sir[j] && (i !=j))
				{
					System.out.println("Elementele duplicate sunt " + sir[j]);
				}
				
				// nota pe viitor
				// cum fac sa apara odata daca am mai mult de 2 valori identice
				
			}
		}
		
		valoriTastatura.close();
	}
	
}
