package capitolul3;
// Exercitiu : Scrieti un program java pentru a insuma valorile unui array


import java.util.Scanner;



public class Exercitiul_19 {

	// declararea metodei main
	public static void main(String args[])
	{
		
		// declararea variabilelor de instanta
		int dimensiune;
		int suma = 0;
		
		// creearea scanerului
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.println("Specificati ce dimensiune a-ti dori sa aiba vectorul ?");
		dimensiune = valoriTastatura.nextInt();
		System.out.println("Spcificati valorile vectorului : ");
		
		// creearea vectorului
		int vector[] = new int[dimensiune];
		
		// citirea vectorului
		for(int i = 0; i < dimensiune; i ++)
		{
			
			vector[i] = valoriTastatura.nextInt();
		}
		
		// insumarea valorilor din vector
		for (int i : vector)
		{
			suma += i;
		}
		
		// afisarea rezultatului
		System.out.println("Suma numerelor din vector este " + suma);
		
		
	}
	
}
