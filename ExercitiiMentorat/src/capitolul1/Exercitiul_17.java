package capitolul1;
// Exercitiu in care gasim aria si circumferinta unui cerc

// importarea scanerului
import java.util.Scanner;

// declararea clasei
public class Exercitiul_17 {
	
	// declararea metodei main
	public static void main(String args[])
	{
		// declararea variabilelor de instanta
		// formula circumferintei unui cerc este  C = 2*pi*raza
		// formula ariei unui cerc este A = pi*raza^2
		double raza;
		double pi = 3.14;
		double circumferinta, arie;
		
		// creearea scanerului
	
		Scanner valoriTastatura = new Scanner(System.in);
		
		// implementarea introducerii valorilor
		System.out.print("Introduceti valoarea razei cercului ");
		raza = valoriTastatura.nextDouble();
		
		// calcularea circumferintei cercului
		circumferinta = 2*pi*raza;
		System.out.println("Valoarea circumferintei este de " + circumferinta);
		
		// calcularea ariei unui cerc
		arie = pi*Math.pow(raza, 2);
		System.out.println("Valoarea ariei unui cerc este de " + arie);
	}

}
