// Scrie un program in java unde userul va scrie un numar de la tastatura
// si se va genera urmatorul pattern
		
/* 
         ex: imput = 5
             outpout = 1
                       1 2
                       1 2 3
                       1 2 3 4
                       1 2 3 4 5
 
 */

// eraore ... nu imi ies coloanele
import java.util.Scanner;


public class Exercitiul_12 {

	 public static void  main (String args[])
	 {
		 // declararea variabilelor
//		 int randuri; // i
//		 int coloane; // j
//		 int cate_randuri_sa_fie; //n
//		 
//		 // create scanner
//		 Scanner x = new Scanner(System.in);
//		 System.out.print("Introduceti un numar : ");
//		 cate_randuri_sa_fie = x.nextInt();
//		 
//		 // creearea unei tip de matrice
//		 
//		 // intai declaram randurile (cate randuri sa fie)
//		 for(randuri = 1; randuri <= cate_randuri_sa_fie; randuri++ )
//		 {   
//			 
//			 // zicem de unde initializam(mai zicem odata de unde incepem)
//			 cate_randuri_sa_fie = 1;
//			 
//			 // declaram cate coloane sa fie (trebuie sa fie un numar mic sau egal cu cel al randurilor)
//			 for(coloane = 1; coloane <= randuri; coloane ++)
//		     
//			 // cum ar trebui sa fie afisat
//			 System.out.print(" " + coloane);
//			 cate_randuri_sa_fie ++;
//		 }
//		 
		 // Afisarea rezultatului
		 System.out.println("Rezultat: ");
		
		 for(int i = 1; i <= 5; i++) {
			 for(int j = 1; j <= i; j++) {
				 System.out.print(i +  " ");
			 }
			System.out.println();
		 }
		 
		
		 
	 }
}
