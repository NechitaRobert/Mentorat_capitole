// Scrieti un program JAVA pt a gasi elementele comune intre doua siruri/vectori

// importarea scanerului
import java.util.Scanner;

// declararea clasei
public class Exercitiul_28 {

	// declararea metodei main
	public static void main(String args[])
	{
		
		// creearea variabilelor
		int dimensiune;
		int i = 0; // variabila i e pt primulVector
		int j = 0; // variabila j e pt alDoileaVector
		
		// creearea Scanerului
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.println("Specificati dimensiunea vectorului : ");
		dimensiune = valoriTastatura.nextInt();
		
		// creearea vectorilor
		int primulVector[]   = new int[dimensiune];
		int alDoileaVector[] = new int[dimensiune];
		
		// citirea vectorului si implementarea valorilor in vector -- pt primul vector
		System.out.println("Specificati valorile primului Vector : ");
		for( i = 0; i < dimensiune; i++)
		{
			primulVector[i] = valoriTastatura.nextInt();
		}
		System.out.println();
		
		// citirea vectorului si implementarea valorilor in vector -- pt al 2-lea vector
		System.out.println("Specificati valorile celui de-al doilea Vector : ");
		for (j = 0; j < dimensiune; j++)
		{
			alDoileaVector[j] = valoriTastatura.nextInt();
		}
		System.out.println();
		
		// Afisarea primului vector
		System.out.print("Valorile vectorului sunt : ");
		for ( i = 0; i < dimensiune; i++)
		{
		    System.out.print(primulVector[i] + " ");
		}
		System.out.println();
		
		// Afisarea celui de-al doilea vector
		System.out.print("Valorile vectorului sunt : ");
		for (j = 0; j < dimensiune; j++)
		{
			System.out.print(alDoileaVector[j] + " ");
		}
		System.out.println();
		
		// compararea vectorilor pt a afla daca cele doua au elemente comune
		// se face printr-o matrice (tabel bidimensional)
		for ( i = 0; i < dimensiune; i++)
		{
			for ( j = 0; j < dimensiune; j++)
			{   
				// aici se va compara cei 2 vectori
			    // gasirea se face cu ajutorul unor indexi impliciti 
				if((primulVector[i]) == (alDoileaVector[j]))
				{
					// daca se vor gasi elemente comune vor afisate rezultatele
					System.out.println("Elementele comune sunt " + primulVector[i]);
				}
			}
		}
		
	}
}
