// Am bug aici

import java.util.Scanner;


public class Exercitiul_19 {

	public static void main(String args[])
	{   
		
		// declararea variabilelor
		int temporal;
		int numar;
		boolean prim = true;
		
		// declararea variabilelor pt suma cifrelor din numar
		int suma = 0;
		int cifre = 0;
		
		// creearea scanerului
		Scanner numar_tastatura = new Scanner(System.in);
		System.out.print("Introduceti numarul");
		numar = numar_tastatura.nextInt();
		
		// initializarea algoritmului 
		// Nota : Vezi ciurul lui Eratostene
		
		// initializarea incepe de la 2 pana la cel mai mare numar ce urmeaza a fi testat pt primalitate
		for(int i = 2; i <= numar/2; i++ )
		{   
			
			temporal = numar % i;
			if (temporal == 0)
			{
				prim = false;
				break;
			}
		}
		
		// verificarea daca nr este prim sau nu 
		if(prim)
		{   
			// afisarea rezultatului
			System.out.println(numar + " Este un numar prim");
			while(numar != 0)
			{
			    // daca este prim atunci va efectua urm bloc pt a insuma cifrele din nr
				suma = suma + numar % 10;
				numar = numar / 10;
				
			}
			// afisarea sumei
			System.out.println("Suma cifrelor numarului este " + suma);
		}
		else
		{   
			// afisarea rezultatului
			System.out.println(numar + " Nu este un numar prim");
		}
		
		
		
	}
	
}
