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
		double r;
		double pi = 3.14;
		double circumferinta, arie;
		
		// creearea scanerului
		Scanner raza = new Scanner(System.in);
		
		// introducerea valorii
		System.out.print("Introduceti valoarea razei cercului ");
		r = raza.nextDouble();
		
		// calcularea circumferintei cercului
		circumferinta = 2*pi*r;
		System.out.println("Valoarea circumferintei este de " + circumferinta);
		
		// calcularea ariei unui cerc
		arie = pi*Math.pow(r, 2);
		System.out.println("Valoarea ariei unui cerc este de " + arie);
	}

}
