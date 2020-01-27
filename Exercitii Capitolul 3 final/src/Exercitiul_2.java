// Scrieti un program in java pentru a compara lexicografic doua siruri

import java.util.Scanner;
import java.util.Locale;


public class Exercitiul_2 {

	
	public static void main(String args[])
	{
		
		// declararea afirmatiilor
		String primaAfirmare;
		String aDouaAfirmare;
		
		// creearea scanerului
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.print("Scrieti va rog orice afirmatie doriti ");
		primaAfirmare = valoriTastatura.nextLine();
		System.out.print("Scrieti va rog orice afirmatie doriti ");
        aDouaAfirmare = valoriTastatura.nextLine();
        
        // compararea lexicografica
        // se face cu ajutorul "compareTo()"
        int comparare = primaAfirmare.compareTo(aDouaAfirmare);
        
        // compararea valorilor
        if (comparare < 0)
        {
        	System.out.println(primaAfirmare + " este mai mica decat " + aDouaAfirmare);
        }
        else if (comparare == 0)
        {
        	System.out.println(primaAfirmare + " este egala cu " + aDouaAfirmare);
        }
        else if (comparare > 0)
        {
        	System.out.println(primaAfirmare + " este mai mare cu " + aDouaAfirmare);
        }
        
	}
	
	
}
