
import java.util.Scanner;
import java.util.Locale;


public class Exercitiul_5 {

	public static void main(String args[])
	{
		
		String primul_argument;
		String al_doilea_argument;
		
		Scanner valori_tastatura = new Scanner(System.in);
		System.out.print("Tastati ce doriti ");
		primul_argument = valori_tastatura.nextLine();
		System.out.print("Tastati ce doriti ");
		al_doilea_argument = valori_tastatura.nextLine();
		
		System.out.print(primul_argument.contains(al_doilea_argument));
		
		
		
	}
	
}
