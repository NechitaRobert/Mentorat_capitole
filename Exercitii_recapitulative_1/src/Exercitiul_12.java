<<<<<<< HEAD

// Scrieti in java in care sa afiseze valoarea maxima si minima dintr-o matrice

import java.util.Scanner;

public class Exercitiul_12 {

	public static void main(String args[])
	{
		int linie;
		int coloana;
		
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.println("Specificati cate linii sa aiba matricea ");
		linie = valoriTastatura.nextInt();
		System.out.println("Speciicati cate coloane sa aiba matricea ");
		coloana = valoriTastatura.nextInt();
		
		int matrice[][] = new int[linie][coloana];
		for (int i = 0; i < linie; i++)
		{
			for (int j = 0; j < coloana; j++)
			{
				System.out.println("Specificati valoarea in locatia " + i + j);
				matrice[i][j] = valoriTastatura.nextInt();
			}
		}
		
		for (int i = 0; i < linie; i++)
		{
			for (int j = 0; j < coloana; j++)
			{
				System.out.print("[" + matrice[i][j] + "]");
			}
			System.out.println();
		}
		
		int minim = matrice[0][0];
		int maxim = matrice[0][0];
		
		for (int i = 0; i < linie; i++)
		{
			for (int j = 0; j < coloana; j++)
			{
				if( matrice[i][j] < minim )
				{
					minim = matrice[i][j];
				}
				
				if (matrice [i][j] > maxim)
				{
					maxim = matrice[i][j];
				}
				
			}
		}
		
		System.out.println("Valoarea minima a vectorului este " + minim);
		System.out.println("Valoarea maxima a vectorului este " + maxim);
		
	}
	
}
=======

// Scrieti in java in care sa afiseze valoarea maxima si minima dintr-o matrice

import java.util.Scanner;

public class Exercitiul_12 {

	public static void main(String args[])
	{
		int linie;
		int coloana;
		
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.println("Specificati cate linii sa aiba matricea ");
		linie = valoriTastatura.nextInt();
		System.out.println("Speciicati cate coloane sa aiba matricea ");
		coloana = valoriTastatura.nextInt();
		
		int matrice[][] = new int[linie][coloana];
		for (int i = 0; i < linie; i++)
		{
			for (int j = 0; j < coloana; j++)
			{
				System.out.println("Specificati valoarea in locatia " + i + j);
				matrice[i][j] = valoriTastatura.nextInt();
			}
		}
		
		for (int i = 0; i < linie; i++)
		{
			for (int j = 0; j < coloana; j++)
			{
				System.out.print("[" + matrice[i][j] + "]");
			}
			System.out.println();
		}
		
		int minim = matrice[0][0];
		int maxim = matrice[0][0];
		
		for (int i = 0; i < linie; i++)
		{
			for (int j = 0; j < coloana; j++)
			{
				if( matrice[i][j] < minim )
				{
					minim = matrice[i][j];
				}
				
				if (matrice [i][j] > maxim)
				{
					maxim = matrice[i][j];
				}
				
			}
		}
		
		System.out.println("Valoarea minima a vectorului este " + minim);
		System.out.println("Valoarea maxima a vectorului este " + maxim);
		
	}
	
}
>>>>>>> e991fb12e6548d27accefeb7dc13388b7e3b39cc
