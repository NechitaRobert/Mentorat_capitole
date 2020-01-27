// Scrie un program java pentru a afla daca o regiune din sirul curent se potriveste
// cu o regiune dintr-un alt sir

import java.util.Scanner;


public class Exercitiul_12 {

	public static void main(String args[])
	{
		
		String primaPropozitie;
		String aDouaPropozitie;
		
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.println("Scrieti o propozitie ");
		primaPropozitie = valoriTastatura.nextLine();
		System.out.println("Scrieti o alta propozitie ");
		aDouaPropozitie = valoriTastatura.nextLine();
		
		// in region match punem (de unde incepem(pt prima variabila), variabila cu care comparam, de unde incepem(pt a 2-a variabila), pana unde terminam(pt a 2-a variabila) )
		boolean exempluPotrivire = primaPropozitie.regionMatches(0, aDouaPropozitie, 0, 2);
		System.out.println(exempluPotrivire);
		
	}
	
	
	
}
