/*Scrieti un program pentru a gasi valoarea unui numar ridicat
la puterea altuia.
 * */
import java.util.Scanner;

public class Exercitiul_3 {
	
	public static void main(String args[])
	{
		int baza;
		int putere;
		int rezultat = 1;
		
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.println("Specificati valoarea bazei puterii ");
		baza = valoriTastatura.nextInt();
		System.out.println("Speciicati exponentul puterii ");
		putere = valoriTastatura.nextInt();
		
		for (int i = 0; i < putere; i++)
		{
			rezultat = rezultat * baza;
		}
		
		System.out.println(baza + " ridicat la puterea a " + putere + " este " + rezultat);
		
		valoriTastatura.close();
		
	}

}
