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
       int primulUnghi, alDoileaUnghi, alTreileaUnghi;
	
	   // creearea scanerului
       Scanner valoriTastatura = new Scanner(System.in);
     
       // implementarea introducerii valorilor
      System.out.print("Introducerea valorii primului unghi ");
      primulUnghi = valoriTastatura.nextInt();
      System.out.print("Introducerea valorii celui de-al doilea unghi ");
      alDoileaUnghi = valoriTastatura.nextInt();
	  
	  // aplicarea formulei
      alTreileaUnghi = 180 - primulUnghi - alDoileaUnghi;
	  
	  // afisarea rezultatului
	  System.out.println("Valoarea celui de-al 3-lea unghi este de " + alTreileaUnghi);
	
	}
}
