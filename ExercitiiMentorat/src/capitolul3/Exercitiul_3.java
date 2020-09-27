package capitolul3;
// Scrieti un program in java pentru a compara lexicografic
// ignorand diferente dintre litere mici si litere mari (ex : "e" si "E")
//  "e" si "E " vor fi considerate egale

import java.util.Scanner;
import java.util.Locale;

public class Exercitiul_3 {

	public static void main(String args[])
	{
		String primu_argument;
		String al_doilea_argument;
		
		Scanner valori_tastatura = new Scanner(System.in);
		System.out.println("Scrieti va rog orice afirmatie ");
		primu_argument = valori_tastatura.nextLine();
		System.out.println("Scrieti va rog orice afirmatie ");
		al_doilea_argument = valori_tastatura.nextLine();
		
		int comparare = primu_argument.compareToIgnoreCase(al_doilea_argument);
		
		if (comparare < 0)
		{
			System.out.println(primu_argument + " Are mai putine argumente decat " + al_doilea_argument );
		}
		else if (comparare == 0)
		{
			System.out.println(primu_argument + " Are aceleasi argumente ca  " + al_doilea_argument );	
		}
		else if (comparare > 0)
		{
			System.out.println(primu_argument + " Are mai multe argumente ca  " + al_doilea_argument );	
		}
		
	}
}
