//Scrie un program JAVA unde userul va insera n numere de la tastatura dupa care
//va fi printat la consola suma numerelor pare din acele numere

import java.util.Scanner;

public class Exercitiul_18 {

	public static void main(String args[])
	{
		
		// declararea variabilelor
		int numar;
		int invers = 0;
		int sumaPara = 0;
		
		
		// creearea scanerului
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.print("Spuneti un numar ");
		numar = valoriTastatura.nextInt();
		
		/* metoda de executiei a blocului de mai jos
		 * de exemplu 2583 trebuie sa dea ca rezultat 10
		 * 
		 *  daca numarul (2583 > 0) atunci
		 *  cifra (2)     %10 => 2 : 10 = 0 rest 2 => cifra = 2 (de la rest)
		 *  daca 2(cifra) % 2 =>  2 : 2 = 1 rest 0 
		 *  => sumaPara(0) = sumaPara(0) + 2 => 2 
		 *  cifra (25)    %10 => 25 : 10 = 2 rest 5 => cifra = 5(de la rest)
		 *  daca 5(cifra) % 2 =>  5 : 2 = 2 rest 1 
		 *  => stop ; nu se executa sumaPara
		 *  cifra (258)   % 10 => 258 : 10 = 25 rest 8 => cifra = 8
		 *  daca 8(cifra) % 2  =>   8 : 4 = 2 rest 0
		 *  => sumaPara(2) = sumaPara(2) + 8 = 10
		 *  cifra (2583) % 10 => 2583 : 10 = 258 rest 3 => cifra = 3
		 *  daca 3(cifra) % 2 =>    3 : 2 = 1 rest 1
		 *  => stop : nu se executa sumaPara
		 *  ==> stop se opreste executia while (nu mai are numere)
		 *  REZULTAT = 10;
		 *  
		 * */
		
		        
			while(numar > 0)
			{
			    int cifra = numar % 10;
			    if(cifra % 2 == 0)
			    {
			    	sumaPara = sumaPara + cifra;
			    }
			    numar = numar / 10;
			}
			
			
		
		// Afisarea rezultatului
		System.out.println("Suma numerelor pare din cifra este " + sumaPara);
		
			
			
	}
		
		
		
		
	}
	

