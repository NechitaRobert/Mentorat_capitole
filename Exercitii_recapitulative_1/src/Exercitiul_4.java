
import java.util.Scanner;

public class Exercitiul_4 {

	public static void main(String args[])
	{
		int matrice[][] = new int[2][5];
		int rand = matrice.length;
		System.out.println(rand);
		int coloana = matrice[0].length;
		System.out.println(coloana);
		
		Scanner valoriTastatura = new Scanner(System.in);
		
			
		for (int i = 0; i < rand; i++)
		{
			for (int j = 0; j < coloana; j++)
			{
				System.out.println("Valoare la coordonatele " + i + j);
				matrice[i][j] = valoriTastatura.nextInt();
			}
			System.out.println();
		}
		
		for (int i = 0; i < rand; i++)
		{
			for(int j = 0; j < coloana; j++)
			{
				System.out.print(matrice[i][j] + " ");
			}
			System.out.println();
		}
		
		// nota fa pe foaie cu coordonatele
		int matriceInversa[][] = new int[rand][coloana];
		
		for (int i = rand - 1 ; rand >= 0; i -- )
		{
			for (int j = coloana - 2 ; coloana >= 0; j-- )
			{
				matriceInversa[rand-1-i][coloana-1-j] = matrice[i][j];
				
			}

		}
		
		
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
