package capitolul3;
// Scrieti u program java pentru a testa daca un sir dat contine o secventa
// specificata de valori char

import java.util.Scanner;
import java.util.Locale;


public class Exercitiul_5 {

	public static void main(String args[])
	{
		
		String primulArgument;
		String alDoileaArgument;
		
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.print("Tastati ce doriti ");
		primulArgument = valoriTastatura.nextLine();
		System.out.print("Tastati ce doriti ");
		alDoileaArgument = valoriTastatura.nextLine();
		
		System.out.print(primulArgument.contains(alDoileaArgument));
		
		
		
	}
	
}
