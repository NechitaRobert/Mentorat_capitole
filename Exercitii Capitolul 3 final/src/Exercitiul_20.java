// Exercitiu : Scrieti un program java pentru a imprima un semn intr-o matrice ;
// De exemplu : matrice 3 pe 3:  Input : "-" 
//                               Output : ---
//                                        ---
//                                        ---

// importarea scanerului
import java.util.Scanner;

// declararea clasei
public class Exercitiul_20 {
   
	// declararea metodei main
	public static void main(String args[])
	{
	    // declararea variabilelor
		int linie;
		int coloana;
		String unCaracter;
		
		// creearea scanerului 
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.println("Specificati cate linii trebuie sa aiba matricea ? ");
		linie = valoriTastatura.nextInt();
		System.out.println("Specificati cate coloane trebuie sa aiba matricea ? ");
		coloana = valoriTastatura.nextInt();
		System.out.println("Specificati ce caracter a-ti dori sa folositi : ");
		unCaracter = valoriTastatura.next();
		
		// creearea matricei
		String matrice[][]= new String[linie][coloana];
		
		// citirea matricei
		   // primul for e pt linii
		for(int i = 0; i < linie; i++ )
		{   
		   // al doilea for e pt coloane
			for(int j = 0; j < coloana; j++)
			{
				// pt printarea unui anumit tip de caracter in toata matricea se foloseste metoda "printf"
				// System.out.printf(caracterul care il imprimi, matricea denumita);
				System.out.printf(unCaracter, matrice[i][j]);
				
			}
			// Afisarea rezultatului
			System.out.println();
		}
		
		
		
		
		
		
	}
	
	
}
