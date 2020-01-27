// Scrieti un program in java in care luati 3 numere de la tastatura si imprimati cel mai mare numar

import java.util.Scanner;

public class Exercitiul_3 {
	
	public static void main(String args[])
	{
		// declararea variabilelor
		int a;
		int b;
		int c;

	    // creearea scanerului
		Scanner valoriTastatura = new Scanner(System.in);
		
		System.out.print("Scrieti primul numar : ");
		a = valoriTastatura.nextInt();
	
		System.out.print("Scrieti al doilea numar : ");
		b = valoriTastatura.nextInt();

		System.out.print("Scrieti al treilea numar : ");
		c = valoriTastatura.nextInt();
		
		
		// metoda de imprimare a celui mai mare numar
		if (a > b && a > c)
		{
			System.out.println("Primul numar este cel mai mare");
		}
		else if ( b > a && b > c)
		{
			System.out.println("Al doilea numar este mai mare");
		}
		else if (c > a && c > b)
		{
			System.out.println("Al treilea numar este mai mare");
		}
		
		
		
		}
	
	}
	


