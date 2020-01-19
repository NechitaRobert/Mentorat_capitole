// Scrie un program in JAVA pentru aflarea factorialului oricarui
// numar inserat la tastatura
// Ex : Input = 3
//      Output = 1*2*3

import java.util.Scanner;


public class Exercitiul_16 {

	public static void main(String args[])
	{
		
		// declararea variabilelor
		int numar;
		int initializare;
		int produs = 1 ;
		
		// creearea scanerului
		Scanner numar_tastatura = new Scanner(System.in);
		System.out.print("Spuneti numarul ");
		numar = numar_tastatura.nextInt();
		
		// intitalizarea algoritmului
		// vom folosi for pentru exprimarea factorialului
		for( initializare = 1; initializare <= numar; initializare++ )
		{
			produs *= initializare;
		}
		
		// Afisarea rezultatului
		System.out.println("Numarul factorial este " + produs);
		
	}
}
