package capitolul1;
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
		Scanner valoriTastatura = new Scanner(System.in);
		
		// implementarea introducerii valorilor
		System.out.print("Introduceti temperaturii Celsius ");
		tempC = valoriTastatura.nextDouble();
		
		//formula convertirii din Celsius in  Fahrenheit
		tempF = tempC * 1.8 + 32;
		
		// Afisarea rezultatului
		System.out.println("Temperatura Fahrenheit este de " + tempF);
		
	}

}
