// Am bug aici

import java.util.Scanner;


public class Exercitiul_19 {

	public static void main(String args[])
	{
		int temporal;
		int numar;
		boolean prim = true;
		
		int suma = 0;
		int cifre = 0;
		
		Scanner numar_tastatura = new Scanner(System.in);
		System.out.print("Introduceti numarul");
		numar = numar_tastatura.nextInt();
		
		for(int i = 2; i <= numar/2; i++ )
		{
			temporal = numar % i;
			if (temporal == 0)
			{
				prim = false;
				break;
			}
		}
		if(prim)
		{
			System.out.println(numar + " Este un numar prim");
			while(numar != 0)
			{
				numar = numar / 10;
				++ cifre;
				suma = suma + numar % 10;
				
			}
			System.out.println("Suma cifrelor numarului este " + suma);
		}
		else
		{
			System.out.println(numar + " Nu este un numar prim");
		}
		
		
		
	}
	
}
