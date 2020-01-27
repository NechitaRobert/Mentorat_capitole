// Exercitiu in care calculam valoarea unui cub

// importarea scanerului
import java.util.Scanner;

// declararea clasei
public class Exercitiul_13 {
	
	// declararea metodei main(punctul de incepere)
	public static void main(String args[])
	{
		// declararea variabilelor de instanta
		// volumul unui cub este C = lungimea*latimea*inaltimea = latura^3
		double latura;
		double volumulCubului;
		
		// creearea scanerului
		Scanner cub = new Scanner (System.in);
		
		// implementarea introducerii valorilor a laturii cubului
		System.out.print("Introduceti valoarea laturii cubului ");
		latura = cub.nextDouble();
		
		// Formula de calcul a cubului
		volumulCubului = latura*latura*latura;
		volumulCubului = (Math.pow(latura, 3));
		
		// Afisarea rezutatului
		System.out.println("Volumul cubului este de " + volumulCubului);
		
	}

}
