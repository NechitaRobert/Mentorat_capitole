<<<<<<< HEAD
/*Scrieti un program care verifica daca un o matrice(array bidimensional) este “column-magic”
(adica fiecare coloana are aceeasi suma de elemente)
*/

import java.util.Scanner;

public class Exercitiul_16 {

	public static void main(String args[])
	{
		int linie;
		int coloana;
		int sumaColoanelor = 0;
		
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.println("Scrieti va rog cate linii are matricea ");
		linie = valoriTastatura.nextInt();
		System.out.println("Scrieti va rog cate coloane are matricea ");
		coloana = valoriTastatura.nextInt();
		
		int matrice[][] = new int[linie][coloana];
		
		for (int i = 0; i < linie; i++)
		{
			for (int j = 0; j < coloana; j++)
			{
				System.out.println("Scrieti ce valoare doriti sa aiba in locatia " + i + j);
				matrice[i][j] = valoriTastatura.nextInt();
				
			}
		}
		
		
		for (int i = 0; i < linie; i++)
		{
			for (int j = 0; j < matrice[0].length ; j++)
			{
				System.out.print("[" + matrice[i][j] + "]");
			}
			System.out.println();
		}
		
		
		for (int j = 0; j < coloana; j++)
		{
			sumaColoanelor =0;
		    for (int i = 0; i < linie; i++)
		    {
		    	sumaColoanelor = sumaColoanelor + matrice[i][j];
		    }
		    System.out.println(sumaColoanelor);
		}
		
		
	}
	
}
=======
/*Scrieti un program care verifica daca un o matrice(array bidimensional) este “column-magic”
(adica fiecare coloana are aceeasi suma de elemente)
*/

import java.util.Scanner;

public class Exercitiul_16 {

	public static void main(String args[])
	{
		int linie;
		int coloana;
		int sumaColoanelor = 0;
		
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.println("Scrieti va rog cate linii are matricea ");
		linie = valoriTastatura.nextInt();
		System.out.println("Scrieti va rog cate coloane are matricea ");
		coloana = valoriTastatura.nextInt();
		
		int matrice[][] = new int[linie][coloana];
		
		for (int i = 0; i < linie; i++)
		{
			for (int j = 0; j < coloana; j++)
			{
				System.out.println("Scrieti ce valoare doriti sa aiba in locatia " + i + j);
				matrice[i][j] = valoriTastatura.nextInt();
				
			}
		}
		
		
		for (int i = 0; i < linie; i++)
		{
			for (int j = 0; j < matrice[0].length ; j++)
			{
				System.out.print("[" + matrice[i][j] + "]");
			}
			System.out.println();
		}
		
		
		for (int j = 0; j < coloana; j++)
		{
			sumaColoanelor =0;
		    for (int i = 0; i < linie; i++)
		    {
		    	sumaColoanelor = sumaColoanelor + matrice[i][j];
		    }
		    System.out.println(sumaColoanelor);
		}
		
		
	}
	
}
>>>>>>> e991fb12e6548d27accefeb7dc13388b7e3b39cc
