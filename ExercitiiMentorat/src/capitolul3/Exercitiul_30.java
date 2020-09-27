package capitolul3;
// Scrieti un program java pentru a testa egalitatea a doi vectori

// importarea
import java.util.Scanner;
import java.util.Arrays;

// declararea clasei
public class Exercitiul_30 {

	// declararea metodei main
	public static void main(String args[])
	{
		// declararea variabilei
		int dimensiune;
		
		// creearea scanerului
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.println("Spuneti dimensiunea vectorului ");
		dimensiune = valoriTastatura.nextInt();
				
		// creearea vectorilor
		String primulVector[] = new String[dimensiune];
		String alDoileaVector[] = new String[dimensiune];
		
		// citirea si implementarea valorilor primului vector
		System.out.println("Specificati valorile sirului pentru primul vector ");
		for (int i = 0; i < dimensiune; i++ )
		{
			primulVector[i] = valoriTastatura.next();
		}
		
		// citirea si implementarea valorilor celui de-al doilea vector
		System.out.println("Specificati valorile sirului pentru al doilea vector ");
		for (int i = 0; i < dimensiune; i++ )
		{
			alDoileaVector[i] = valoriTastatura.next();
		}	
		
		// afisarea primului vector
		for (int i = 0; i < dimensiune; i++)
		{
			System.out.print(primulVector[i] + " ");
		}	
		System.out.println();
		
		// afisarea celui de-al doilea vector
		for (int i = 0; i < dimensiune; i++)
		{
			System.out.print(alDoileaVector[i] + " ");
		}	
		System.out.println();
		
		
		// compararea vectorilor
		// se poate cu metoda "equals" inclus in conditia unui "if"
		if(Arrays.equals(primulVector, alDoileaVector))
		{   
			// daca ambii vectori au aceleasi valori, va afisa rezultatul de mai jos
			System.out.println("Vectorii au aceleasi valori");
		}
		else
		{   
			// daca ambii vectori au cel putin o valoare care nu coincid, atunci se va afisa rezultatul de mai jos
			System.out.println("Vectorii nu aceleasi valori");
		}

		
	}
}
