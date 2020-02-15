// Exercitiu in care trebuie sa gasim al 3-lea unghi al unui triunghi

// Importarea scanerului
import java.util.Scanner;

// Declararea clasei
public class Exercitiul_19 {
	
	// Declararea metodei main
	public static void main(String args[])
	{
	   // declararea variabilelor de instanta
	   // Suma totala a unghiurilor este de 180 grade, deci formula ar fi
	   // c = 180 - a - b
       int a, b, c;
	
	   // creearea scanerului
      Scanner primul_unghi = new Scanner(System.in);
      Scanner al_doilea_unghi = new Scanner(System.in);
      
      // Introducerea valorilor
      System.out.print("Introducerea valorii primului unghi ");
      a = primul_unghi.nextInt();
      System.out.print("Introducerea valorii celui de-al doilea unghi ");
	  b = al_doilea_unghi.nextInt();
	  
	  // aplicarea formulei
	  c = 180 - a - b;
	  
	  // afisarea rezultatului
	  System.out.println("Valoarea celui de-al 3-lea unghi este de " + c);
	
	}
}
