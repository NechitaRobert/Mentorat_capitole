package capitolul4;
/*Scrieti un program java care va copia elementele unei matrici(array bidimensional) intr-o alta
matrice(array bidimensional) astfel incat elementele copiate sa fie scrise rasturnat..
Ex
12 13 14 21 31 41
15 16 17 => 51 61 71
18 19 21 81 91 12
 * 
 * 
 * */
import java.util.Scanner;

public class Exercitiul_18 {

	public static void main(String agrs[])
	{
		int linie;
		int coloana;
		int invers = 0; 
		
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
				System.out.println("Specificati ce valoare sa aiba la coordonatele " + i + j);
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
			for (int j = 0; j < coloana; j++)
			{   
				invers = 0;
				while (matrice[i][j] != 0)
				{
					invers = invers * 10 + matrice[i][j] % 10;
					matrice[i][j] = matrice[i][j] / 10;
					
				}
				matrice[i][j] = invers;
			}
		}
		System.out.println();
		
		int matriceInversa [][] = new int[linie][coloana];
		
		
		for (int i = 0; i < linie; i++)
		{
			for (int j = 0; j < coloana; j++)
			{
				matriceInversa[i][j] = matrice[i][j];
			}
		}		
		
		for (int i = 0; i < linie; i++)
		{
			for (int j = 0; j < coloana; j++)
			{
				System.out.print("[" + matriceInversa[i][j] + "]");
			}
			System.out.println();
		}
	
	
		
	}
	
}