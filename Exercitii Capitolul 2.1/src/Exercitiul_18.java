//Scrie un program JAVA unde userul va insera n numere de la tastatura dupa care
//va fi printat la consola suma numerelor pare din acele numere

//  EROARE : EX : 2468 RETURNEAZA 12
import java.util.Scanner;

public class Exercitiul_18 {

	public static void main(String args[])
	{
		
		// declararea variabilelor
		int numar;
		int invers = 0;
		int suma_para = 0;
		
	
		
		// creearea scanerului
		Scanner numar_tastatura = new Scanner(System.in);
		System.out.print("Spuneti un numar ");
		numar = numar_tastatura.nextInt();
		
		
		// Pentru a calcula suma numerelor pare dintr-un numar trebuie sa facem urmatorii pasi:
		// 1. Trebuie sa inversam numarul. De exemplu : 1234 va deveni 4321
		// 2. Dupa care aplicam operatorul "modulus" si extragem ultima cifra, care va deveni de fapt prima cifra
		//    a unui numar astfel incat ca ea sa devina o cifra impara
		// 3. Urmatoarea cifra va fi o cifra para dupa care vom face suma in randuri alternative.
		
		while( numar != 0 )
		{
			
			// inversarea numarului
			int cifra = numar % 10;
			invers = invers * 10 + cifra;
			numar = numar / 10;
			
			// adunarea cifrelor pare din numar
		    suma_para = suma_para + (numar % 10);
		   
			
		}
		
		// Afisarea rezultatului
		System.out.println("Suma numerelor pare din cifra este " + suma_para);
		
			
			
	}
		
		
		
		
	}
	

