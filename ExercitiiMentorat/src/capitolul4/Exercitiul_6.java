package capitolul4;

/* Scrieti un program pentru a verfica daca elementele unui array unidimensional
 * sunt acceasi sau nu citite din fata sau din spate 
 * ex : [2,3,15,15,3,2]
 */

import java.util.Scanner;

public class Exercitiul_6 {

	public static void main(String args[])
	{
		
		// formula simpla
        
		// creearea unui sir
	    int[] a = {2,3,15,15,3,2};
	    
	    // creearea unei valori booleene pt a stabili daca sunt egale sau nu
	    boolean read = true;
	    
	    // citirea de la coada-cap a vectorului(in ordine inversa)
	    int j = a.length-1;

	    // metoda de comparare si afisare 
	    for(int i = 0; i <a.length/2; i++)
	    {
	       if(a[i] != a[j])
	       {
	        read = false;
	        break;
	       }
	        else
	        j--;
	    }
	    // afisarea rezultatului
	    System.out.println(read);
		
		
		// formula customizata
		
	    // creearea unor variabile
		int dimensiune;
		boolean verificareFataSpateVector = true;
		
		// creearea unui scaner
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.println("Specificati dimensiunea vectorului ");
		dimensiune = valoriTastatura.nextInt();
		
		// creearea unui vector
		int vector[] = new int[dimensiune];
		
		// implementarea valorilor in vector
		System.out.println("Specificati valorile vectorului : ");
		for (int i = 0; i < dimensiune; i++){
			vector[i] = valoriTastatura.nextInt();
		}
		
		// metoda de verificare 
		// lungime vector = 6 => k = 6 - 1 = 5
	    int k = vector.length - 1;
	              // dimensiune = 5 => 5 : 2 = 2,5 => 2
		for (int i = 0; i < dimensiune / 2; i++ )
		{	
				if (vector[i] != vector[k])
				{  
					//daca gaseste valori care nu coincid de ex primu cu ultimu se va opri executia
					verificareFataSpateVector = false;
					break;
				}
				else
					// altfel va tot continua pana cand va gasi..si daca nu va afisa true la afisarea rezzultatului
				{
					k--;
				}			
			
		}
		// afisarea rezultatului
		System.out.println(verificareFataSpateVector);
		
			
	 }
}
