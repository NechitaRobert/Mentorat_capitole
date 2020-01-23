// Scrieti un program in java pentru a compara lexicografic doua siruri

import java.util.Scanner;
import java.util.Locale;


public class Exercitiul_2 {

	
	public static void main(String args[])
	{
		
		// declararea afirmatiilor
		String prima_afirmare;
		String a_doua_afirmare;
		
		// creearea scanerului
		Scanner valori_tastatura = new Scanner(System.in);
		System.out.print("Scrieti va rog orice afirmatie doriti ");
		prima_afirmare = valori_tastatura.nextLine();
		System.out.print("Scrieti va rog orice afirmatie doriti ");
        a_doua_afirmare = valori_tastatura.nextLine();
        
        // compararea lexicografica
        // se face cu ajutorul "compareTo()"
        int comparare = prima_afirmare.compareTo(a_doua_afirmare);
        
        // compararea valorilor
        if (comparare < 0)
        {
        	System.out.println(prima_afirmare + " este mai mica decat " + a_doua_afirmare);
        }
        else if (comparare == 0)
        {
        	System.out.println(prima_afirmare + " este egala cu " + a_doua_afirmare);
        }
        else if (comparare > 0)
        {
        	System.out.println(prima_afirmare + " este mai mare cu " + a_doua_afirmare);
        }
        
	}
	
	
}
