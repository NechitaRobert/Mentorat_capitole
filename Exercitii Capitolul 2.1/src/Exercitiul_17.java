// Scrie un program JAVA unde userul va insera un numar la tastatura dupa care va printa acel
// numar in ordine inversa


import java.util.Scanner;

public class Exercitiul_17 {

	public static void main(String args[])
	{
		// declararea variabilelor
		int numar;
		int invers = 0;
		
		// creearea scanerului
		Scanner numar_tastatura = new Scanner(System.in);
		System.out.print("Scrieti un numar ");
		numar = numar_tastatura.nextInt();
		
		// initializarea algoritmului
		// 1 pas : declaram ca nr inversat e 0
		// 2 pas : declaram ca nr declarat trebuie sa fie diferit de 0
		// 3 pas : multiplicam numarul inversat cu 10 + adaugam restul numarului declarat
		// 4 pas : impartim la 10 numarul inversat
		// 5 pas : impartim numarul prin 10
		// 6 pas : returnarea(sa se afiseze) numarul inversat
		while(numar != 0 )
		{
			int cifra = numar % 10;
			invers = invers * 10 + cifra;
			numar = numar / 10;
			// numar /= 10;
					
		}
		
		System.out.println("Numarul scris invers este " + invers);
		
	}
	
}
