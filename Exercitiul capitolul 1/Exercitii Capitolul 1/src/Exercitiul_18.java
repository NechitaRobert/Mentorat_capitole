// Exercitiu in care convertesti temperatura Celsius in Fahrenheit

// Importarea scanerului
import java.util.Scanner;

// Declararea clasei
public class Exercitiul_18 {
	
	// declararea metodei main
	public static void main(String args[])
	{
		// declararea variabilelor de instanta
		// formula convertirii Celsius in Fahrenheit
		// T(F) = T(C)*1,8 + 32
		double tempF;
		double tempC;
		
		// creearea scanerului
		Scanner celsius = new Scanner(System.in);
		
		// introducerea valorii
		System.out.print("Introduceti temperaturii Celsius ");
		tempC = celsius.nextDouble();
		
		//formula convertirii din Celsius in  Fahrenheit
		tempF = tempC * 1.8 + 32;
		
		// Afisarea rezultatului
		System.out.println("Temperatura Fahrenheit este de " + tempF);
		
	}

}
