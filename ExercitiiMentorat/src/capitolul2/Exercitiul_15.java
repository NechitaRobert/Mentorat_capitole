package capitolul2;
// Scrie un program in JAVA unde userul va scrie un numar la tastatura iar programul
// ii va spne cate cifre are acel numar. Pe langa numarul de cifre ale acelui numar
// va trebui sa printezi si suma cifrelor

import java.util.Scanner;


public class Exercitiul_15 {
	
	public static void main(String args[])
	{
		// declararea variabilelor
		int numar;
		int cate_cifre_are_numarul = 0; 
		int suma = 0;
		
		// crearea scanerului
		Scanner numere = new Scanner(System.in);
		System.out.print("Spuneti numarul : ");
		numar = numere.nextInt();
		
		// pt numararea cifrelor din numar si aflarea sumei lor se face cu ajutorul unei iteratii
		// exemplu while
		  
		   // numarul trebuie sa fie diferit de 0
		while(numar != 0)
		{   
			// pentru a vedea cate cifre are un numar se utilizeaza urmatorul bloc
			numar = numar / 10;
			++ cate_cifre_are_numarul;
			
	        // pentru a vedea ce suma au cifrele din numar se utlizeaza urm bloc
			suma = suma + numar % 10;
		}
		
		// afisarea rezultatelor
		System.out.println("Numarul de cifre este " + cate_cifre_are_numarul );
		System.out.println("Suma cifrelor a numarului este " + suma);
	}

}
