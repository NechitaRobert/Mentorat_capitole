/*Scrieti un program care sa calculeze suma cifrelor pentru elementele unei matrici(array
bidimensional). Daca elementele acelei matrici sunt de tip String va trebui sa afisezi cate
litere sunt prezente in elementele acelei matrici.
 */

import java.util.Scanner;


public class Exercitiul_17 {

	public static void main(String args[])
	{
		int rand;
		int coloana;
		
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.println("Scrieti cate linii are matricea ");
		rand = valoriTastatura.nextInt();
		System.out.println("Scrieti cate coloane are matricea ");
		coloana = valoriTastatura.nextInt();
		
		// pentru suma elementelor din matrice
		int suma = 0;
		int matriceNumere[][] = new int[rand][coloana];
		
		for (int i = 0; i < rand; i++)
		{
			for (int j = 0; j < coloana; j++)
			{
				System.out.println("Specificati valorile pentru " + i + j);
				matriceNumere[i][j] = valoriTastatura.nextInt();
			}
		}
		
		for (int i = 0; i < rand; i++)
		{
			for (int j = 0; j < coloana; j++)
			{
				System.out.print("[" + matriceNumere[i][j] + "]");
			}
			System.out.println();
		}
		
		for (int i = 0; i < rand; i++)
		{
			for (int j = 0; j < coloana; j++)
			{
				suma = suma + matriceNumere[i][j];
			}
		}
		
		System.out.println("Suma elementelor din matrice este " + suma);
		
	
	}
	
}
