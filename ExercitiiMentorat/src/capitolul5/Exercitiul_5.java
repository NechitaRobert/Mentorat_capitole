package capitolul5;
/*Scrieti un program pentru a imprima seria Fibonacci de n
termeni in care n este introdus de utilizator:
0 1 1 2 3 5 8 13 24
 * */

import java.util.Scanner;

public class Exercitiul_5 {

	public static void main(String args[])
	{
		
		int cateNumere;
		int primuNumar = 0;
		int alDoileaNumar = 1;
		int suma = 0;
		
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.println("Specificati cate numere a-ti dori sa afiseze in sirul lui Fibonnaci ? :");
		cateNumere = valoriTastatura.nextInt();
		
		for (int i = 0; i < cateNumere; i++)
		{
			System.out.print(primuNumar + " ");
			
			suma = primuNumar + alDoileaNumar;
			primuNumar = alDoileaNumar;
			alDoileaNumar = suma;
					
		}
		
		valoriTastatura.close();
		
	}
	
	
}
