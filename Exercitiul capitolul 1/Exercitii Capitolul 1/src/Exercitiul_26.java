// Sa se scrie un program in java pentru a calcula totalul si media a 4 numere

// importarea scanerului
import java.util.Scanner;

// declararea clasei
public class Exercitiul_26 {

	//declararea metodei main
	public static void main(String args[])
	{
		// declararea variabilelor
		// media a 4 numere = (a+b+c+d)/4 sau sum/4 sum fiind a+b+c+d
		
		// Obs : la double sau float se afiseaza zecimalele
		// compararativ cu int care da doar numaru intreg
		float a,b,c,d ;
		float medieM, sumaM;
		
		// creearea scanerului
		Scanner unu = new Scanner(System.in);
		Scanner doi = new Scanner(System.in);
		Scanner trei  = new Scanner(System.in);
		Scanner patru = new Scanner(System.in);
		
		// creearea valorilor
		
		System.out.print("Valoarea primei cifre este : ");
		a = unu.nextFloat();
		System.out.print("Valoarea celei de-a doua cifra : ");
		b = doi.nextFloat();
		System.out.print("Valoarea celei de-a treia cifra : ");
		c = trei.nextFloat();
		System.out.print("Valoarea celei de-a patra cifre ");
		d = patru.nextFloat();
		
		// calcularea
		sumaM = (a+b+c+d);
		medieM = sumaM / 4;
		
		// Afisarea rezultatelor
		System.out.println("Suma valorilor este " + sumaM);
		System.out.println("Media valorilor este " + medieM);
		
	}
}
