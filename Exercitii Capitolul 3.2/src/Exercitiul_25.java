
import java.util.Scanner;

public class Exercitiul_25 {

	public static void main(String args[])
	{
		int dimensiune;
		
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.println("Specificati dimensiunea sirului : ");
		dimensiune = valoriTastatura.nextInt();
		System.out.println("Specificati valorile dimensiunii sirului : ");
		
		int vector[] = new int[dimensiune];
		int maxim = vector[0];
		int minim = vector[0];
			
		for (int i = 0; i < dimensiune; i++)
		{
			vector[i] = valoriTastatura.nextInt();
			
		}
		
		for (int i = 0; i < dimensiune; i ++)
		{
			if( vector[i] > maxim)
			{
				maxim = vector[i];
			}
			if( vector[i] < minim)
			{
				minim = vector[i];
			}
		}
			
		System.out.println("Valoarea maxima a vectorului este " + maxim);
		System.out.println("Valoarea minima a vectorului este " + minim);
		
	}
	
}
