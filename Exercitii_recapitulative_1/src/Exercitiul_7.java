<<<<<<< HEAD
/*Scrieti un program in care luati o serie de 10 elemente dupa care veti copia 
 * elementele in 2 array-uri unidimensionale astfel incat primele 5 elemente sa fie copiate 
 * in primul array iar urmatoarele in al doilea array 
 */

import java.util.Arrays;
import java.util.Scanner;

public class Exercitiul_7 {

	public static void main(String args[])
	{
	    //--------------cu vector definit-----------------------------
		
		// creearea unui vector
		int vector[] = {1, 2, 3 ,4 ,5, 6, 7, 8, 9 ,10};
		
        // metoda de impartire a vectorului
		int primaJumatate[] = new int[(vector.length + 1)/2];
        int aDouaJumatate[] = new int[vector.length - primaJumatate.length];
		
    
       for (int i = 0; i < vector.length; i++)
       {
    	  //cu primul if verificam ca luam primele 4 elemente
    	   if(i < (vector.length + 1)/2) 
    	   {
    		   primaJumatate[i] = vector[i];
    	   }
       }   
       
       // cu urmatorul if urmatoarele 4 valori(a doua jumatate)
       // ne trebuie un iterator
       int iterator = 0;
            // pornim de unde am ramas ; pana la dimensiunea max a sirului
       for (int i = (vector.length + 1)/2; i < vector.length; i++)
       {
    	   aDouaJumatate[iterator] = vector[i];
    	   iterator++;
    	   
       } 
    	 
       // afisarea primelor 4 elemente
       for(int i = 0; i < primaJumatate.length; i++)
       {
    	   System.out.print(primaJumatate[i] + " ");
       }
       System.out.println();
       
       // afisarea ultimelor 4 elemente
       for(int i = 0; i < aDouaJumatate.length; i++) 
       {
    	   System.out.print(aDouaJumatate[i] + " ");
       }
       System.out.println();
       
       // ---------------cu vector nepredefinit------------------------------
       // -- ceva e gresit ---- 
       
       // creearea scanerului
       Scanner valoriTastatura = new Scanner(System.in);
       
       // specificarea dimensiunii vectorului
       int dimensiune;
       System.out.println("Specificati dimensiunea vectorului ");
       dimensiune = valoriTastatura.nextInt();
       
       // creearea unui vector
       int vectorNou[] = new int[dimensiune];
       
       // implementarea valorilor in vector
       System.out.println("Specificati valorile vectorului : ");
       for (int i = 0; i < dimensiune; i++)
       {
    	   vectorNou[i] = valoriTastatura.nextInt();
       }
       
       // afisarea rezultatului
       for (int i = 0; i < dimensiune; i++)
       {
    	   System.out.print("[" + vectorNou[i] + "]");
       }
       System.out.println();
       
       // creearea noilor vectori pt a imparti vechiul vector
       int primaJumatateNou[] = new int[ (dimensiune + 1) / 2];
       int aDouaJumatateNou[] = new int[dimensiune - primaJumatateNou.length];
       
       // luarea primei jumatati de elemente din vector
       for (int i = 0; i < dimensiune; i++)
       {
    	   if(i < ((dimensiune + 1)/2) )
    	   {
    		   primaJumatateNou[i] = vectorNou[i];
    	   }
       }
       System.out.println();
       
       // afisarea primei jumatati
       for (int i = 0; i < primaJumatate.length ; i ++)
       {
    	   System.out.print("[" + primaJumatate[i] + "]");
       }
       System.out.println();
       
       // luarea celei de-a doua jumatate
       int iteratie = 0;
       for (int i = (dimensiune + 1)/2 ; i < dimensiune; i++)
       {
    	   aDouaJumatateNou[iteratie] = vectorNou[i];
    	   iteratie ++;
       }
       System.out.println();
       
       // afisarea celeli de-a doua jumatate
       for (int i = 0; i < aDouaJumatate.length; i++)
       {
    	   System.out.print("[" + aDouaJumatate + "]");
       }
       System.out.println();
       
       valoriTastatura.close();
	}
	
}
=======
/*Scrieti un program in care luati o serie de 10 elemente dupa care veti copia 
 * elementele in 2 array-uri unidimensionale astfel incat primele 5 elemente sa fie copiate 
 * in primul array iar urmatoarele in al doilea array 
 */

import java.util.Arrays;
import java.util.Scanner;

public class Exercitiul_7 {

	public static void main(String args[])
	{
	    //--------------cu vector definit-----------------------------
		
		// creearea unui vector
		int vector[] = {1, 2, 3 ,4 ,5, 6, 7, 8, 9 ,10};
		
        // metoda de impartire a vectorului
		int primaJumatate[] = new int[(vector.length + 1)/2];
        int aDouaJumatate[] = new int[vector.length - primaJumatate.length];
		
    
       for (int i = 0; i < vector.length; i++)
       {
    	  //cu primul if verificam ca luam primele 4 elemente
    	   if(i < (vector.length + 1)/2) 
    	   {
    		   primaJumatate[i] = vector[i];
    	   }
       }   
       
       // cu urmatorul if urmatoarele 4 valori(a doua jumatate)
       // ne trebuie un iterator
       int iterator = 0;
            // pornim de unde am ramas ; pana la dimensiunea max a sirului
       for (int i = (vector.length + 1)/2; i < vector.length; i++)
       {
    	   aDouaJumatate[iterator] = vector[i];
    	   iterator++;
    	   
       } 
    	 
       // afisarea primelor 4 elemente
       for(int i = 0; i < primaJumatate.length; i++)
       {
    	   System.out.print(primaJumatate[i] + " ");
       }
       System.out.println();
       
       // afisarea ultimelor 4 elemente
       for(int i = 0; i < aDouaJumatate.length; i++) 
       {
    	   System.out.print(aDouaJumatate[i] + " ");
       }
       System.out.println();
       
       // ---------------cu vector nepredefinit------------------------------
       // -- ceva e gresit ---- 
       
       // creearea scanerului
       Scanner valoriTastatura = new Scanner(System.in);
       
       // specificarea dimensiunii vectorului
       int dimensiune;
       System.out.println("Specificati dimensiunea vectorului ");
       dimensiune = valoriTastatura.nextInt();
       
       // creearea unui vector
       int vectorNou[] = new int[dimensiune];
       
       // implementarea valorilor in vector
       System.out.println("Specificati valorile vectorului : ");
       for (int i = 0; i < dimensiune; i++)
       {
    	   vectorNou[i] = valoriTastatura.nextInt();
       }
       
       // afisarea rezultatului
       for (int i = 0; i < dimensiune; i++)
       {
    	   System.out.print("[" + vectorNou[i] + "]");
       }
       System.out.println();
       
       // creearea noilor vectori pt a imparti vechiul vector
       int primaJumatateNou[] = new int[ (dimensiune + 1) / 2];
       int aDouaJumatateNou[] = new int[dimensiune - primaJumatateNou.length];
       
       // luarea primei jumatati de elemente din vector
       for (int i = 0; i < dimensiune; i++)
       {
    	   if(i < ((dimensiune + 1)/2) )
    	   {
    		   primaJumatateNou[i] = vectorNou[i];
    	   }
       }
       System.out.println();
       
       // afisarea primei jumatati
       for (int i = 0; i < primaJumatate.length ; i ++)
       {
    	   System.out.print("[" + primaJumatate[i] + "]");
       }
       System.out.println();
       
       // luarea celei de-a doua jumatate
       int iteratie = 0;
       for (int i = (dimensiune + 1)/2 ; i < dimensiune; i++)
       {
    	   aDouaJumatateNou[iteratie] = vectorNou[i];
    	   iteratie ++;
       }
       System.out.println();
       
       // afisarea celeli de-a doua jumatate
       for (int i = 0; i < aDouaJumatate.length; i++)
       {
    	   System.out.print("[" + aDouaJumatate + "]");
       }
       System.out.println();
       
       valoriTastatura.close();
	}
	
}
>>>>>>> e991fb12e6548d27accefeb7dc13388b7e3b39cc
