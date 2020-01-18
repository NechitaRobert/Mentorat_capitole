//Scrie un program in java unde userul va introduce la tastatura un numar si va forma urmatorul pattern
//Exemplu : Input 4
//          Output 1
//                 2 3
//                 4 5 6
//                 7 8 9 10
//Nota : am mai adaugat si de unde sa inceapa numarul 
//Exemplu : Nr de inceput 2
//          Input randuri 3
//          Output 2
//                 3 4
//                 5 6 7

import java.util.Scanner;


public class Exercitiul_14 {

	public static void main(String args[])
	{   
		
		// declararea variabilelor
		int rand_coloana;
        int numar;
        
        // creearea scanerului
        Scanner numar_tastatura = new Scanner(System.in);
        System.out.print("Cu ce numar a-ti dori sa incepeti? ");
        numar = numar_tastatura.nextInt();
		
        System.out.print("Cate randuri si coloane a-ti vrea? ");
        rand_coloana = numar_tastatura.nextInt();
        
        // crearea matricei (mai degraba e o pseudo-matrice/ matrice falsa )
        
        // intai pentru randuri
		for( int i = 0; i < rand_coloana; i++)
		{
			// acuma pt coloana
			// scrii aici j < i + 1 ca fiecare rand trebuie sa creasca cu 1 si sa fie mai mic decat coloana
			for(int j = 0; j < i + 1; j++)
			{
				// aici pui numar++ pt ca trebuie nr sa creasca cu +1 din 1 in 1 
				// cum ar trebui sa arate
				System.out.print( numar++  + " ");
			}
			// Afisarea
			System.out.println();
		}
        
        
	}
}
