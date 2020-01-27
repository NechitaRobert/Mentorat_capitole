//Exerciitu in care convertim temperatura din Kelvin in Celsius

//Importarea scanerului
import java.util.Scanner;

// Declararea clasei
public class Exercitiul_22 {
	
	// declararea metodei main
	public static void main(String args[])
	{
		
		// declararea variabilelor de instanta
		// Formula de convertire din Kelvin in Celsius :
		// T_C = T_K - 273.15
		double tempCelsius;
		double tempKelvin;
		
		// implementarea introducerii valorilor
		Scanner valoriTastatura = new Scanner(System.in);
		
		// Introducerea valorilor
		System.out.print("Cate grade Kelvin sunt ? : ");
		tempKelvin = valoriTastatura.nextDouble();
		
		// Aplicarea formulei
		tempCelsius  = tempKelvin - 273.15;
		
		// Afisarea rezultatelor
		System.out.println("Sunt " + tempCelsius + " grade Celsius");
		
		
	}
	

}
