package capitolul1;
// Exercitiu in care convertim temperatura Kelvin in Fahrenheit

// Importarea scanerului
import java.util.Scanner;

// Declararea clasei
public class Exercitiul_21 {

	// Declararea metodei main
	public static void main(String args[])
	{
		// Declararea variabilelor de instanta
		// Formula de convertire din Kelvin in  Fahrenheit
		// T_F = T_K * 9/5 - 459.67
		double tempK, tempF;
		
		// Creearea scanerului
		Scanner valoriTastatura = new Scanner(System.in);
		
		// Implementarea introducerii valorilor
		System.out.print("Cate grade Kelvin ");
		tempK = valoriTastatura.nextDouble();
		
		// Aplicarea formulei
		tempF = (tempK * 9)/5 - 459.67;
		
		// Afisarea rezultatelor
		System.out.println("Sunt " + tempF + " Grade Fahrenheit");
	}
}
