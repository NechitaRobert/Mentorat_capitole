import java.util.Scanner;
// eraore .. pot pune doar 4 numeremm ma gandesc la un if ..ceva de control 
public class Exercitiul_9 {
	
	public static void main(String args[])
	{
		//Scanner scann = new Scanner(System.in);
		int numere;
		int nrTastatura;
		int suma = 0;
		
		for(numere =0; numere < 5; numere++)
		{
			Scanner scann = new Scanner(System.in);
			System.out.print("Introduceti numere : ");
	        nrTastatura = scann.nextInt();
			
			suma += nrTastatura;
			// a = a + x;
		}
		
		
		//0,1,2,3,4,5
	
		System.out.println("Suma numerelor este " + suma);
		
	}

}
