// Scrieti un program java care sa afiseze suma si produsul unei matrici

import java.util.Scanner;

public class Exercitiul_13 {

   public static void main(String args[])
   {
	   
	   int linie;
	   int coloana;
	   
	   Scanner valoriTastatura = new Scanner(System.in);
	   System.out.println("Specificati cate randuri sa aiba matricea ");
	   linie = valoriTastatura.nextInt();
	   System.out.println("Specificati cate coloane sa aiba matricea ");
	   coloana = valoriTastatura.nextInt();
	   
	   int matriceUnu[][] = new int[linie][coloana];
	   int matriceDoi[][] = new int[linie][coloana];
	   
	   int produs[][]= new int[linie][coloana];
	   
	   for (int i = 0; i < linie; i++)
	   {
		   for (int j = 0; j < coloana; j++)
		   {
			   System.out.println("Specificati valorile pt locatia " + i + j);
			   matriceUnu[i][j] = valoriTastatura.nextInt();
		   }
		   System.out.println();
	   }
	   
	   for (int i = 0; i < linie; i++)
	   {
		   for (int j = 0; j < coloana; j++)
		   {
			   System.out.println("Specificati valorile pt locatia " + i + j);
			   matriceDoi[i][j] = valoriTastatura.nextInt();
		   }
		   System.out.println();
	   }
	   
	   System.out.println("Prima matrice");
	   for (int i = 0; i < linie; i++)
	   {
		   for (int j = 0; j < coloana; j++)
		   {
			   System.out.print("[" + matriceUnu[i][j] + "]");
		   }
		   System.out.println();
	   }
	   
	   System.out.println("A doua matrice");
	   for (int i = 0; i < linie; i++)
	   {
		   for (int j = 0; j < coloana; j++)
		   {
			   System.out.print("[" + matriceDoi[i][j] + "]");
		   }
		   System.out.println();
	   }
	   
	   for (int i = 0; i < linie; i++)
	   {
		   for (int j = 0; j < coloana; j++)
		   {
			   produs[i][j] = matriceUnu[i][j] * matriceDoi[i][j];
		   }
		   System.out.println();
	   }
	   
	   System.out.println("Produs");
	   for (int i = 0; i < linie; i++)
	   {
		   for (int j = 0; j < coloana; j++)
		   {
			   System.out.print("[" + produs[i][j] + "]");   
		   }
		   System.out.println();
	   }
	      
	   int suma[][]= new int[linie][coloana];
	   
	   for (int i = 0; i < linie; i++)
	   {
		   for (int j = 0; j < coloana; j++)
		   {
			   suma[i][j] = matriceUnu[i][j] + matriceDoi[i][j];
		   }
		   System.out.println();
	   }
	   System.out.println("Suma");
	   
	   for (int i = 0; i < linie; i++)
	   {
		   for (int j = 0; j < coloana; j++)
		   {
			   System.out.print("[" + suma[i][j] + "]");
		   }
		   System.out.println();
	   }
	   
   }
	
}
