// Scrie un program in java pentru a verifica daca doua obiecte String contin
// aceleasi date

import java.util.Scanner;


public class Exercitiul_8 {

	public static void main(String args[])
	{
		String primaDeclaratie;
		String aDouaDeclaratie;
		
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.print("Scrieti prima declaratie ");
		primaDeclaratie = valoriTastatura.nextLine();
		System.out.print("Scrieti urmatoarea declaratie ");
		aDouaDeclaratie = valoriTastatura.nextLine();
		
		
		boolean comparare = primaDeclaratie.contentEquals(aDouaDeclaratie);
		System.out.println(comparare);
		
		
	}
	
}
