package capitolul3;
// Scrie un program Java pentru a concatena doua siruri

import java.util.Scanner;
import java.util.Locale;

public class Exercitiul_4 {

	public static void main(String args[])
	{
		String primulArgument;
		String alDoileaArgument;
		
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.print("Tastati ce argumente doriti ");
		primulArgument = valoriTastatura.nextLine();
		System.out.print("Tastati ce argumente doriti ");
		alDoileaArgument = valoriTastatura.nextLine();
		
		String concatenare;
		concatenare = primulArgument.concat(alDoileaArgument);
		// Sau mai putea scrie 
		// String concatenare = primul_argument.concat(al_doilea_argument);
		
		System.out.println(concatenare);
		
		
		
		
		
	}
	
}
