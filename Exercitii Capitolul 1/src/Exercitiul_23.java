// O eroare

// Scrieti un program in Java pentru a converti temperatura a din Fahrenheit în Kelvin

// Importarea Scanerului
import java.util.Locale;
import java.util.Scanner;

// Declararea clasei
public class Exercitiul_23 {
	
	// Declararea metodei main
	public static void main(String args[])
	{
		
		// declararea variabilelor de instata
		// Formula de convertire din Fahrenheit în Kelvin
		// T_K = ((T_F + 459.67)*5)/9
		double tempF;
		double tempK;
		
		// Creearea Scanerului
		// Scanner fahrenheit = new Scanner(System.in);
		// !Nota pentru ce e jos : aparent, cateodata programul face confuzie intre "." si ","
		// Pentru remedierea situatiei trebuie folosit si "useLocale" ca mai jos
		// Ca actiune : transforma "," in "."
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		// Introducerea valorilor
		System.out.print("Cate grade Fahrenheit sunt ? ");
		tempF =  scanner.nextDouble();
		
		// Calcularea 
		tempK = ((tempF + 459.67)*5)/9;	
		
		// Afisarea rezultatelor
		System.out.println("Sunt " + tempK + " grade Kelvin");
	}

}
