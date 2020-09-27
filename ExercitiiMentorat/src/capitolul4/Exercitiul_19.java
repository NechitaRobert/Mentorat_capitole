package capitolul4;

/*Scrieti un program java care va copia elementele unei matrici(array bidimensional) intr-o alta
matrice(array bidimensional) astfel incat elementele copiate sa fie incrementate pe liniile
pare si decrementate pe liniile impare
 */

import java.util.Scanner;

public class Exercitiul_19 {

	public static void main(String args[])
	{
		int linie;
		int coloana;
		
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.println("Scrieti cate linii sa aiba matricea ");
		linie = valoriTastatura.nextInt();
		System.out.println("Scrieti cate coloane sa aiba matricea ");
		coloana = valoriTastatura.nextInt();
		
		int matrice[][] = new int[linie][coloana];
		
		for (int i  = 0; i < linie; i++)
		{
			for (int j  = 0; j < coloana; j++)
			{
				System.out.println("Specificati valoarea la coordonatele" + i + j);
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
		System.out.println();
		
		int nouaMatrice[][] = new int[linie][coloana];
		
		
		for (int i = 0; i < linie; i++)
		{
			for(int j = 0; j < coloana; j++)
			{
				nouaMatrice[i][j] = matrice[i][j];
					if( i % 2 == 0)
					{
						nouaMatrice[i][j]++;
					}
					else
					{
						nouaMatrice[i][j]--;
					}				
			}
		}
			
		for (int i = 0; i < linie; i++)
		{
			for (int j = 0; j < coloana; j++)
			{
				System.out.print("[" + nouaMatrice[i][j] + "]");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}
	
}
