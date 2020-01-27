// Scrieti un program JAVA pentru a afisa tabelul de inmultire a unui numar intreg dat

// importarea scanerului
import java.util.Scanner;

// declararea clasei
public class Exercitiul_10 {
	
	// declararea metodei main
	public static void main(String args[])
	{
		// declararea variabilelor
		int deCateOri, cuCeNumar;
		
		// creearea scanerului
		Scanner valoriTastatura = new Scanner(System.in);
		
		// implementarea introducerii valorilor
		System.out.print("De cate ori vreti sa inmultiti : ");
		deCateOri = valoriTastatura.nextInt();
		System.out.print("Cu ce numar vreti sa inmultiti : ");
		cuCeNumar = valoriTastatura.nextInt();
		
		// pt a inmulti un numar de un numar de ori trebuie folosit o bucla(loop)
		// in cazul de mai jos am utilizat "for"(o recursivitate) si functioneaza in felul urmator
		// ex : deCateOri = 3 , cuCeNumar = 4
		/* 0(fiind i)*cuCeNumar = rezultat  ; numar de iteratii  < deCateOri;  da : urm iteratie/nu : stop
		 *                                     (deCateOri)
		 *      0    *   4      =   0       ;    0               <    3     ;  da : urm iteratie
		 *      1    *   4      =   4       ;    1               <    3     ;  da : urm iteratie
		 *      2    *   4      =   8       ;    2               <    3     ;  da : urm iteratie
		 *      3    *   4      =   12      ;    3               <    3     ;  nu : stop
		 * */
		
		
		for(int i = 0; i < deCateOri; i++ )
		{   
			// afisarea rezultatelor
			System.out.print(i + "*" + cuCeNumar + "=");
			System.out.println(i*cuCeNumar);
			
		}
	}

}
