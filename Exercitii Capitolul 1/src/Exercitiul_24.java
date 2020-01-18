// Scrieti un prgram in java in care conertiti temperatura celsius in kelvin

// importarea scanerului
import java.util.Locale;
import java.util.Scanner;

// declararea clasei
public class Exercitiul_24 {

	 // declararea metodei main
	public static void main(String args[])
	{
		// declararea variabilelor
		// formula de convertire din Celsius in Kelvin
		// T(k) = T(c)+ 273.15 ;
		double tempK;
		double tempC;
		
		// creearea scanerului
		// Scanner celsius = new Scanner(System.in);
		Scanner celsius = new Scanner(System.in).useLocale(Locale.US);
		
		// Adaugarea valorilor
		System.out.print("Cate grade Celsius sunt ? : ");
		tempC = celsius.nextDouble();
		
		// Calculul
		tempK = tempC + 273.15;
		
		// Afisarea rezultatelor
		System.out.println("Sunt " + tempK + " grade Kelvin");
		
	}
}
