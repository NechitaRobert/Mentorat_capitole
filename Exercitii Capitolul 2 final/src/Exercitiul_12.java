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
		 int cateRanduriSaFie; //n
		 
		 // create scanner
		 Scanner valoriTastatura = new Scanner(System.in);
		 System.out.print("Introduceti un numar : ");
		 cateRanduriSaFie = valoriTastatura.nextInt();
		 
		 // creearea unei tip de matrice
		 
		 // intai declaram randurile (cate randuri sa fie)
		 // i intr-o matrice intotdeauna inseamna rand
		 // j intr-o matrice intotdeauna inseamna coloana
		 
		 /*  blocul de mai jos va functiona in felul urmator
		  *  ex : introduceti un numar = 3
		  *  	    
		  *  pt linie va arata executia in felul urmator :
		  *  
		  *  1(fiind i declarat) + i(incremetarea ce incepe de la 0) = rezultat ; iteratie(nr de ori) <= cateRanduriSaFie; da : urm iteratie/ nu : stop
		  *        1    +              0                             =    1     ;           1         <=         3       ; da : urm iteratie     
		  *        1    +              1                             =    2     ;           2         <=         3       ; da : urm iteratie
		  *        1    +              2                             =    3     ;           3         <=         3       ; da : urm iteratie
		  *        1    +              3                             =    4     ;           4         <=         3       ; nu : stop
		  *        
		  *  iar pentru coloana va arata in felul urmator :      
		  *                                            
		  *  1(fiind j) + j(incremetarea ce incepe de la 0) = rezultat ; iteratie(nr de ori) <= i(fiind randul - ce am facut mai sus); da : urm iteratie/ nu : stop      
		  *        1    +                0                  =   1     ;           1         <= 3(numarul de iteratii care au fost facute mai sus) ; da : urm iteratie
		  *        1    +                1                  =   2     ;           2         <= 3                                                  ; da : urm iteratie  
		  *        1    +                2                  =   3     ;           3         <= 3                                                  ; da : urm iteratie
		  *        1    +                3                  =   4     ;           4         <= 3                                                  ; nu : stop
		  *                                                                 
		  * */     
		 
		 for(int i = 1; i <= cateRanduriSaFie; i++ )
	     {   
		     // zicem de unde initializam(mai zicem odata de unde incepem)
			 //cateRanduriSaFie = 1;
			 
			 // declaram cate coloane sa fie (trebuie sa fie un numar mic sau egal cu cel al randurilor)
			 for(int j = 1; j <= i; j ++)
			 {
			 // afisarea rezultatului
			 System.out.print(j + " ");
			 }
		 System.out.println();
		 }
		
		 
		 
		 
		
		 
	 }
}
