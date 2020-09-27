<<<<<<< HEAD
package PiatraHartieFoarfeca;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		// initierea si instantierea obiectelor
		Persoane jucatorBot = new Persoane();
		Persoane jucatorPlayer = new Persoane();
		
		// alegerea botului (neafisat pt utilizator)
		Persoane.alegereaBotului(jucatorBot);
		// alegerea botului (afisat pt utilizator)
		//System.out.println(Persoane.alegereaBotului(jucatorBot));
	
		// alegerea jucatorului
		Scanner scan = new Scanner(System.in);
		System.out.println("Alege( de la 1 la 3 ) : 1 - piatra, 2 - hartia, 3 - foarfeca");
		int elementeleDeSelectie = scan.nextInt();
	     System.out.println("Jucatorul a ales " + Persoane.alegereaJucatorului(elementeleDeSelectie));
		scan.close();
		
		// afisarea castigatorului
		System.out.println( Arbitru.alegereaCastigatorului(jucatorPlayer, jucatorBot));
	}
	
}
=======
package PiatraHartieFoarfeca;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		// initierea si instantierea obiectelor
		Persoane jucatorBot = new Persoane();
		Persoane jucatorPlayer = new Persoane();
		
		// alegerea botului (neafisat pt utilizator)
		Persoane.alegereaBotului(jucatorBot);
		// alegerea botului (afisat pt utilizator)
		//System.out.println(Persoane.alegereaBotului(jucatorBot));
	
		// alegerea jucatorului
		Scanner scan = new Scanner(System.in);
		System.out.println("Alege( de la 1 la 3 ) : 1 - piatra, 2 - hartia, 3 - foarfeca");
		int elementeleDeSelectie = scan.nextInt();
	     System.out.println("Jucatorul a ales " + Persoane.alegereaJucatorului(elementeleDeSelectie));
		scan.close();
		
		// afisarea castigatorului
		System.out.println( Arbitru.alegereaCastigatorului(jucatorPlayer, jucatorBot));
	}
	
}
>>>>>>> ede2816... actualizare
