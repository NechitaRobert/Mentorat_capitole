// Scrieti un program care care sa afiseze suma si produsul elementelor unei matrici
// array bidimensional de pe o anumita coloana

import java.util.Scanner;

public class Exercitiul_14 {

	public static void main(String args[])
	{
		int linie;
		int coloana;
		int sumaDePeOColoana = 0;
		int produsulDePeOAnumitaColoana = 0;
		
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.println("Specificati cate linii sa aiba matricea ");
		linie = valoriTastatura.nextInt();
		System.out.println("Specificati cate coloane sa aiba matricea ");
		coloana = valoriTastatura.nextInt();
		
		int matrice[][] = new int[linie][coloana];
		
		for (int i = 0; i < linie; i++)
	    {
			for (int j = 0; j < coloana; j++)
			{
				System.out.println("Specificati valoarea pt locatia " + i + j);
				matrice[i][j] = valoriTastatura.nextInt();
			}
		}
		
		for (int i = 0; i < linie; i++)
		{
			for (int j = 0; j < coloana; j++)
			{
				System.out.print(matrice[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Specificati ce coloana a-ti dori sa insumati valorile ");
		coloana = valoriTastatura.nextInt();
		for (int i  = 0; i < linie; i++)
		{
			sumaDePeOColoana += matrice[i][coloana];
			
		}
		System.out.println("Suma valorilor " + sumaDePeOColoana);
		
		// bug
		System.out.println("Specificati ce coloana a-ti dori sa inmultiti valorile ");
		coloana = valoriTastatura.nextInt();
		for (int i = 0; i < linie; i++)
		{
			produsulDePeOAnumitaColoana *= matrice[i][coloana];
		}
		System.out.println("Produsul valorilor " + produsulDePeOAnumitaColoana);
		
		
		
	}
	
	
}
