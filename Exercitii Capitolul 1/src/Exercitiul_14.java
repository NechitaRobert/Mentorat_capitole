// Exercitiu in care calculam valoarea unui cilindru

// importarea scanerului
import java.util.Scanner;

// declararea clasei
public class Exercitiul_14 {
   
	// introducerea metodei main
    public static void main(String args[])
    {
    	// declararea variabilelor de instanta
    	// volumul unui cilindru este : VC = pi*r^2*h
    	
    	double volumul_cilindrului;
    	double pi = 3.14;
    	double r;
    	double h;
    	
    	// introducerea scanerului
    	Scanner raza = new Scanner(System.in);
    	Scanner inaltime = new Scanner(System.in);
    	
    	// introducerea valorii
    	System.out.print("Introduceti valoarea razei cilindrului ");
    	r = raza.nextDouble();
    	System.out.print("Introduceti valoarea inaltimii cilindrului ");
    	h = inaltime.nextDouble();
    	
    	// Calcularea volumului cilindrului
    	volumul_cilindrului = pi*(Math.pow(r, 2))* h ;
    	 
    	// Afisarea rezultatului
    	System.out.println("Valoarea cilindrului este de " + volumul_cilindrului);
    	
    }
}
