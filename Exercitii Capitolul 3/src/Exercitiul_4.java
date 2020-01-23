
import java.util.Scanner;
import java.util.Locale;

public class Exercitiul_4 {

	public static void main(String args[])
	{
		String primul_argument;
		String al_doilea_argument;
		
		Scanner valori_tastatura = new Scanner(System.in);
		System.out.print("Tastati ce argumente doriti ");
		primul_argument = valori_tastatura.nextLine();
		System.out.print("Tastati ce argumente doriti ");
		al_doilea_argument = valori_tastatura.nextLine();
		
		String concatenare;
		concatenare = primul_argument.concat(al_doilea_argument);
		// Sau mai putea scrie 
		// String concatenare = primul_argument.concat(al_doilea_argument);
		
		System.out.println(concatenare);
		
		
		
		
		
	}
	
}
