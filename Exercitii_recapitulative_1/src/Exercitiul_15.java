// Scrie un program care verifica daca o matrice este row magic
// Adica fiecare rand are aceeasi suma de elemente

import java.util.Scanner;

public class Exercitiul_15 {

	public static void main(String args[])
	{
		int linie;
		int coloana;
		int sumaRandurilor = 0;
		
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.println("Scrieti cate linii sa aiba matricea ");
		linie = valoriTastatura.nextInt();
		System.out.println("Scrieti cate coloane sa aiba matricea ");
		coloana = valoriTastatura.nextInt();
		
		int matrice[][] = new int[linie][coloana];
		

		for(int i = 0; i < linie; i++)
		{
			for (int j = 0; j < coloana; j++)
			{  
				System.out.println("Specificati valorile pentru " + i +" "+ j);
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
		
		
    	for (int i = 0; i < linie; i++)
		{
			sumaRandurilor = 0;
			for (int j = 0; j < coloana ; j ++)
			{
				sumaRandurilor = sumaRandurilor + matrice[i][j];
			}
			System.out.println("Suma " + (i + 1) + " rand este " + sumaRandurilor);
		}
		
		valoriTastatura.close();	
		
		
	}
	
}
