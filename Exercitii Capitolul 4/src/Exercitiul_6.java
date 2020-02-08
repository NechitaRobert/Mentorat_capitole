/*Scrieti un program pentru a calcula suma urmatoarelor serii in
care n este introdus de utilizator:
1 + 1/2 + 1/3 + 1/4 + 1/5 + ... + 1/n
 * */

import java.util.Scanner;

public class Exercitiul_6 {

	public static void main(String args[])
	{
		double cateNumere;
		double suma = 0;
		
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.println("Specificati cate numere vreti sa insumati in seria armonica ");
		cateNumere = valoriTastatura.nextInt();
		
		for (double i = 1; i <= cateNumere; i++)
		{
			System.out.print(1/i + " + " + 0);
			suma = suma + (1/i);	
		}
		
		System.out.println();
		System.out.println("Suma seriei armonice pana la " + cateNumere + " este de " + suma);
		
		valoriTastatura.close();
		
	}
	
}
