/*Idem ca exercitiul 4_1 doar ca in loc de array unidimensional avem o matrice
 */

import java.util.Scanner;

public class Exercitiul_4 {

	public static void main(String args[])
	{
		// creearea variabilei matrice 
		int matrice[][] = new int[2][5];
		// creearea radului
		int rand = matrice.length;
		System.out.println(rand);
		// creearea coloanelor
		int coloana = matrice[0].length;
		System.out.println(coloana);
		
		// creearea scanerului
		Scanner valoriTastatura = new Scanner(System.in);
		
		// citirea si implementarea valorilor in matrice
		for (int i = 0; i < rand; i++)
		{
			for (int j = 0; j < coloana; j++)
			{
				System.out.println("Valoare la coordonatele " + i + j);
				matrice[i][j] = valoriTastatura.nextInt();
			}
			System.out.println();
		}
		
		// afisarea matricei
		for (int i = 0; i < rand; i++)
		{
			for(int j = 0; j < coloana; j++)
			{
				System.out.print(matrice[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		// creearea unei noi matrici pt stocarea valorilor inversate
		int matriceInversa[][] = new int[rand][coloana];
		
		// schimbul ordinei valorilor
		// ex : prima valoare va deveni ultima valoare
		for (int i = 0; i < rand; i ++ )
		{
			for (int j = 0 ; j < coloana ; j++ )
			{
				matriceInversa[i][j] = matrice[rand-i-1][coloana-j-1];
				
			}

		}
		
		// afisarea matricei inversate
		for (int i = 0; i < rand; i++)
		{
			for (int j = 0; j < coloana; j++)
			{
				System.out.print(matriceInversa[i][j] + " ");
				
			}
			System.out.println();
		}
		
		
		
		
	}
	
}
