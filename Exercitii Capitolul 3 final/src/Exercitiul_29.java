// Scrieti un proram java pentru a aduna 2 matrici de aceeasi dimensiune

// importarea scanerului
import java.util.Scanner;

// declararea clasei
public class Exercitiul_29 {

	// declararea metodei main
	public static void main(String args[])
	{
		//variabile pentru construirea matricii 
		int linie;
		int coloana;
		
		// creearea scanerului
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.println("Scrieti va rog cate linii sa aiba matricea ");
		linie = valoriTastatura.nextInt();
		System.out.println("Scrieti va rog cate coloane sa aiba matricea ");
		coloana = valoriTastatura.nextInt();
		
		// creearea matricelor
		int primaMatrice[][] = new int[linie][coloana];
		int aDouaMatrice[][] = new int[linie][coloana];
		// pentru a insuma 2 matrici trebuie sa cream inca unu
		// l-am denumit "suma"
		        int suma[][] = new int[linie][coloana];
		
		// citirea primei matrici si implementarea valorilor in matrice
		for (int i = 0; i < linie; i++ )
		{
			for (int j = 0; j < coloana; j++ )
			{
				System.out.println("Introduceti valorile pentru elementul " + i + " " + j);
				primaMatrice[i][j] = valoriTastatura.nextInt();
			}
			System.out.println();
		}
		
		// citirea celei de-a doua matrice si implementarea valorilor in matrice
		for (int i = 0; i < linie; i++)
		{
			for (int j = 0; j < coloana; j++)
			{
				System.out.println("Introduceti valorile pentru elementul " + i + " " + j);
				aDouaMatrice[i][j] = valoriTastatura.nextInt();
			}
			System.out.println();
		}
		
		
		// Afisarea primei matrici
		// Nota : Acest bloc nu este obligatoriu, a fost creat pt a verifica daca e citit corect
		for (int i = 0; i < linie; i++)
		{
			for (int j = 0; j < coloana; j++)
			{
				System.out.print(primaMatrice[i][j] + " ");
			}
			System.out.println();
		}
	
		System.out.println();
		
		// Afisarea celui de-a 2 matrice
		// Nota : Acest bloc nu este obligatoriu, a fost creat pt a verifica daca e citit corect
		for (int i = 0; i < linie; i++)
		{
			for (int j = 0; j < coloana; j++)
			{
				System.out.print(aDouaMatrice[i][j] + " ");
			}
			System.out.println();
		}
		
		// citirea si implementarea matricei suma 
	    for (int i = 0; i < linie; i++)
	    {
	    	for (int j = 0; j < coloana; j++)
	    	{   
	    		// insumarea matricelor
	    		suma[i][j] = primaMatrice[i][j]+aDouaMatrice[i][j];
	    	}
	    	System.out.println();
	    }		
		
	    // Afisarea matricei suma
		for (int i = 0; i < linie; i++)
		{
			for (int j = 0; j < coloana; j++)
			{
   			    System.out.print(suma[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
