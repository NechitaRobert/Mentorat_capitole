// Scrie un program java pentru a obtine lungimea unui sir dat

import java.util.Scanner;

public class Exercitiul_11 {
    
	public static void main(String args[])
	{
		String argument;
		//todo: nume variabila
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.println("Tastati ce doriti ");
		argument = valoriTastatura.nextLine();
		
		int dimensiuneaStringului = argument.length();
		System.out.println(dimensiuneaStringului);
		
		
	}
	
	
}
