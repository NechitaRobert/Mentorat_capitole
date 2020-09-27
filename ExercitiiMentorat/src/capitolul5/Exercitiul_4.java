package capitolul5;
/*Scrieti un program care citeste un set de numere intregi si
apoi imprimati pe rand suma numerelor pare, suma numerelor
impare si cate cifre sunt in total in acel set de numere.
 * */

import java.util.Scanner;

public class Exercitiul_4 {

	public static void main(String args[])
	{
		int dimensiune;
		
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.println("Specificati dimensiunea sirului : ");
		dimensiune = valoriTastatura.nextInt();
		
	    int sir[] = new int[dimensiune];
	    System.out.println("Specificati valorile sirului : ");
		for (int i = 0; i < dimensiune; i++)
		{
			sir[i] = valoriTastatura.nextInt();
		}
		
		for (int i = 0; i < dimensiune; i++)
		{
			System.out.print("[" + sir[i] + "]");
		}
		System.out.println();
		
		
		int sumaPara = 0;
		int sumaImpara = 0;
		
		for (int i = 0; i < dimensiune; i++)
		{
				if (sir[i] % 2 == 0)
				{
					sumaPara = sumaPara + sir[i];
				}
				else
				{
					sumaImpara = sumaImpara + sir[i];
				}		
		}
		
		System.out.println("Suma numerelor pare este  " + sumaPara);
		System.out.println("Suma numerelor impare este " + sumaImpara);
		
		int numarulDeCifre = 0;
		
		for (int i = 0; i < dimensiune; i++)
		{
			while(sir[i] != 0)
			{
				sir[i] = sir[i] / 10;
				numarulDeCifre++;
			}
		}
		
		System.out.println("Vectorul are " + numarulDeCifre + " cifre");
		
		valoriTastatura.close();
	}
	
}
