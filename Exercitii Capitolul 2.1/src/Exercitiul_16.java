import java.util.Scanner;


public class Exercitiul_16 {

	public static void main(String args[])
	{
		
		int numar;
		int initializare;
		int produs = 1 ;
		
		Scanner numar_tastatura = new Scanner(System.in);
		System.out.print("Spuneti numarul ");
		numar = numar_tastatura.nextInt();
		
		for( initializare = 1; initializare <= numar; initializare++ )
		{
			produs *= initializare;
		}
		System.out.println("Numarul factorial este " + produs);
		
	}
}
