/*Scrieti o mini aplicatie in care veti avea urmatoarele case-uri:
->aduna 3 numere luate de la tastatura
->citeste de la tastatura un array unidimensioal de la tastatura apoi imprima elementele
acestuia in ordine inversa
->citeste de la tastatura un array bidimensioal de la tastatura apoi imprima elementele
acestuia incrementate cu o unitate
->citeste de la tastatura un array unidimensioal si afiseaza suma elementelor pare
->citeste de la tastatura un array bidimensional si afiseaza modulul fiecarui element
*Vei folosi instructiunea switch iar fiecare cerinta de mai sus va fi un case.
*Nu uita de “default”.
*/
import java.util.Scanner;

public class Exercitiul_20_ {

	static Scanner valoriTastatura = new Scanner(System.in);
	
	public static void main(String args[])
	{	
		
		int sectiune;
		int dimensiune;
		int sumaNumerelorPare = 0;
		int linie;
		int coloana;
		
		while(true)
		{
			System.out.println("1 - Adunarea a 3 numere de la tastatura");
			System.out.println("2 - Schimbarea valorilor din vector");
			System.out.println("3 - Incrementarea valorilor cu +1 intr-o matrice");
			System.out.println("4 - Afisarea numerelor pare dintr-un array unidimensional");
			System.out.println("5 - Afisarea modulului fiecarui element dintr-o matrice ");
			sectiune = valoriTastatura.nextInt();
		
		switch(sectiune)
		{
		case 1:
		
			int numere;
			int suma = 0;
			System.out.println("Specificati ce numere doriti sa utlizati ");
			for (int i = 0; i < 3; i++)
			{
				numere = valoriTastatura.nextInt();
				suma = suma + numere;
			}
		    System.out.println("Suma numerelor este : " + suma);
		    System.out.println();
		    
		break;
		case 2:
			
			System.out.println("Specificati dimensiunea sirului : ");
			dimensiune = valoriTastatura.nextInt();
			
		    int sir[] = new int[dimensiune];
		        for (int i = 0; i < dimensiune; i++)
		        {
		        	System.out.println("Scrieti va rog valorile in pozitia : " + i);
		        	sir[i] = valoriTastatura.nextInt();
		        }
			    
		        for (int i = 0; i < dimensiune; i++)
		        {
		        	System.out.print("[" + sir[i] + "]");
		        }
		        System.out.println();
			
		        for (int i = dimensiune -1; i >= 0; i--)
		        {
		        	System.out.print("[" + sir[i] + "]");
		        }
		    System.out.println();
		        
		break;
        case 3 :		
			
			System.out.println("Specificati cate linii sa aiba matricea : ");
			linie = valoriTastatura.nextInt();
			System.out.println("Specificati cate coloane sa aiba matricea : ");
			coloana = valoriTastatura.nextInt();
			
			int matrice[][] = new int[linie][coloana];
			
			for (int i = 0; i < linie; i++)
			{
				for (int j = 0; j < coloana; j++)
				{
					System.out.println("Specificati ce valoare va avea in locatia " + i + j);
					matrice[i][j] = valoriTastatura.nextInt();
				}
			}
	        
			for (int i = 0; i < linie; i++)
			{
				for (int j = 0; j < coloana; j++)
				{
					System.out.print("[" + matrice[i][j] + "]");
				}
				System.out.println();
			}
			System.out.println();
			
			for (int i = 0; i < linie; i++)
			{
				for (int j = 0; j < coloana; j++)
				{
					matrice[i][j]++;
				}
			}
			
			for (int i = 0; i < linie; i++)
			{
				for (int j = 0; j < coloana; j++)
				{
					System.out.print("[" + matrice[i][j] + "]");
				}
				System.out.println();
			}
			System.out.println();
		  
		break;
		case 4:
			
			System.out.println("Specificati cate valori sa aiba sirul : ");
			dimensiune = valoriTastatura.nextInt();
			
			int sir2[] = new int[dimensiune];
			for (int i = 0; i < dimensiune; i ++)
			{
				System.out.println("Specificati valoarea pt locatia " + i + " :");
			   	sir2[i] = valoriTastatura.nextInt();
			}
			
			for (int i = 0; i < dimensiune; i++)
			{
				System.out.print("[" + sir2[i] + "]");
			}
			
			for (int i = 0; i < dimensiune; i++)
			{
				if(sir2[i] % 2 == 0)
				{
				    sumaNumerelorPare = sumaNumerelorPare + sir2[i];
				}
			}
			System.out.println();
			System.out.println("Suma numerelor pare este " + sumaNumerelorPare);
			System.out.println();
			
		break;
		case 5:
			
			System.out.println("Specificati cate linii sa aiba matricea : ");
			linie = valoriTastatura.nextInt();
			System.out.println("Specificati cate coloane sa aiba matricea : ");
			coloana = valoriTastatura.nextInt();
			
			int matrice2[][] = new int[linie][coloana];
			
			for (int i = 0; i < linie; i++)
			{
				for (int j = 0; j < coloana; j++)
				{
					System.out.println("Specificati ce valoare va avea in locatia " + i + j);
					matrice2[i][j] = valoriTastatura.nextInt();
				}
			}
	        
			for (int i = 0; i < linie; i++)
			{
				for (int j = 0; j < coloana; j++)
				{
					System.out.print("[" + matrice2[i][j] + "]");
				}
				System.out.println();
			}
			System.out.println();
			
			int matriceModul[][] = new int[linie][coloana];
			int numarImpartitor;
			System.out.println("Specificati cu ce numar a-ti dori sa impartiti : ");
			numarImpartitor = valoriTastatura.nextInt();
			
			for (int i = 0; i < linie; i++)
			{
				for (int j = 0; j < coloana; j++)
				{
		   		   matriceModul[i][j] = matrice2[i][j] % numarImpartitor;
				}
			}
			
			for (int i = 0; i < linie; i++)
			{
				for (int j = 0; j < coloana; j++)
				{
					System.out.print("[" + matriceModul[i][j] + "]");
				}
				System.out.println();
			}
			System.out.println();
			
		break;
		default:
			System.out.println("A-ti tastat un numar gresit, incercati din nou! ");
			System.out.println();
		
		}
		
		}
		
		
	}
	
}
