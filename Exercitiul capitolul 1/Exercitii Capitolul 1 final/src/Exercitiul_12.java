// Exercitiul in care calculam volumului unei sfere

// Importarea scanerului
import java.util.Scanner;
// Importarea librariei cu operatii matematice umpic mai avansate
import java.lang.Math;

// Declararea clasei
public class Exercitiul_12 {
	
	// Declararea metodei main (punctul de incepere)
	public static void main(String args[])
	{
		
      // Declararea valorilor de instanta
	  // Volumul unei sfere este V = 4/3*pi*r^3
	  double constant1 = 4;
	  double constant2 = 3;
	  double pi = 3.14;
	  double r;
	  double V;
	  
	  // Creearea scanerului
	  Scanner raza = new Scanner(System.in);
	  
	  // implementarea introducerii valorii a razei 
	  System.out.print("Introduceti valoarea razei sferei : ");
	  r = raza.nextDouble();
	  
	  // Calculul volumului
	  // V = (constant_1*pi*(Math.pow(r, 3)))/constant_2;
	  
	  // O alta metoda fara librarie
	  V = (constant1*pi*r*r*r)/constant2;
	  
	  // Afisarea rezultatului
	  System.out.println("Aria sferei este de : " + V);
	  
	  
	  
		
	}

}
