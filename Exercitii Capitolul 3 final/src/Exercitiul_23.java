// Scrieti un program in JAVA pentru a gasi indexul unui element din matrice


// problema : nu stiu cum sa fac sa afiseze toate locatiile la un anumit numar
// de exemplu nr 1  de la matricea 1 2 sa-mi zica ca odata in locatia 0 0
//                                 1 3       si inca odata in locatia 1 0

import java.util.Scanner;

public class Exercitiul_23 {

	public static void main(String args[])
	{
		// variabile pt construirea matricii
		int linie;
		int coloana;
		
		// variabila pt a declara indexul 
		int index;
		// variabile pt locatia numarului index (coordonatele numarului indexat)
		int randLocatie = 0;
		int coloanaLocatie = 0;
		
		// creearea scanerului
		Scanner valoriTastatura = new Scanner(System.in);
		
		System.out.println("Specificati cate linii sa aiba matricea : ");
     	linie = valoriTastatura.nextInt();
		System.out.println("Specificati cate coloane sa aiba matricea : ");
		coloana = valoriTastatura.nextInt();
	
		// citirea si creearea matricii
		int matrice[][] = new int[linie][coloana];
		
		for (int i = 0 ; i < linie ; i ++)
		{
			for (int j = 0; j < coloana; j++ )
			{
				System.out.println("Introduceti valoarea pt elementul " + i + " " + j);
				matrice[i][j] = valoriTastatura.nextInt();
				 
			}
			System.out.println();
		}
		
		// afisarea matricii
		// nota : partea aceasta nu este necesara...
		// dar am creat-o pt a verifica daca programul ruleaza corect matricea
		for (int i = 0; i < linie ; i ++)
		{
			for (int j = 0; j < coloana; j++ )
			{
				System.out.print(matrice[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
	  
		System.out.println("Specificati un numar ce doriti sa il cautati in matrice ");
		index = valoriTastatura.nextInt();
		System.out.println();
		
		// citirea elementului si verificarea sa in matrice
		for (int i = 0; i < linie ; i++ )
		{
			for (int j = 0; j < coloana; j++ )
			{
				if(matrice[i][j] == index)
				{
					randLocatie = i;
					coloanaLocatie = j;
				}
					
			}
			
		}
		
		// conditionarea numarului indexat daca exista sau nu in matrice
		// matrice[randLocatie][coloanaLocatie] va face legatura cu "for"-ul de mai sus unde coordonatele sunt deja atribuite
		// i pentru rand; j pt coloana
		if(index == matrice[randLocatie][coloanaLocatie])
		{
			// daca exista : se va executa acest system.out.println
			System.out.println("Valoarea precizata se afla in locatia " + randLocatie + " " + coloanaLocatie);
		}
		else
		{ 
			// daca nu exista : se va executa acest system.out.println
			System.out.println("Numarul nu exista in matrice ");
		}		
		
				
	}
	
}
