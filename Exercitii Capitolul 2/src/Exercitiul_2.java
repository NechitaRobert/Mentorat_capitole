// Scrieti un program in java in care luati de la tastatura un numar iar programul
// va imprima la consola daca acel numar este pozitiv sau negativ.
// Programul trebuie sa ruleze la infinit

import java.util.Scanner;

public class Exercitiul_2 {

	public static void main(String args[])
	{
		int numar;
		
		Scanner numar_tastatura = new Scanner(System.in);
		System.out.println("Scrieti un numar : ");
		numar = numar_tastatura.nextInt();
		
		while(numar < 0 )
		{
		   System.out.println("Numarul este negativ");
			
		}
		while(numar > 0)
		{
			System.out.println("Numarul este pozitiv");
		}
		
		
	}
	
}
