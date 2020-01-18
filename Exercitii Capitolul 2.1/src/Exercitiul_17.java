
import java.util.Scanner;

public class Exercitiul_17 {

	public static void main(String args[])
	{
		
		int numar;
		int invers = 0;
		
		Scanner numar_tastatura = new Scanner(System.in);
		System.out.print("Scrieti un numar ");
		numar = numar_tastatura.nextInt();
		
		while(numar != 0 )
		{
			int cifra = numar % 10;
			invers = invers * 10 + cifra;
			numar = numar / 10;
			// numar /= 10;
					
		}
		
		System.out.println("Numarul scris invers este " + invers);
		
	}
	
}
