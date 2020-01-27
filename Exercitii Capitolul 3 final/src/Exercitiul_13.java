//Scrie un program in JAVA pentru a inlocui o litera cu o alta litera la alegere


// importarea scanerului
import java.util.Scanner;

// crearea clasei
public class Exercitiul_13 {

	// declararea metodei main
	public static void main(String args[])
	{
		
		// declararea variabilelor de instanta
		String primulString;  // creearea unui string
		char unElementVechi;  // creearea unei variabile pt selectarea unui element 
		char unElementNou;    // creearea unei variabile pt inlocuirea cu un alt element
			
		// creearea scanerului
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.println("Tastati orice propozitie doriti ");
		primulString = valoriTastatura.nextLine();
	    System.out.println("Ce litera a-ti dori sa schimbati din propozitie ?");
	    unElementVechi = valoriTastatura.next().charAt(0);
	    System.out.println("Ce litera a-ti dori sa puneti in locul celui vechi ? ");
        unElementNou = valoriTastatura.next().charAt(0);
	    
        // creearea unui nou string pt a schimba elementul din vechiul string
        // se foloseste metoda "replace" ca in blocul de mai jos
		String stringCuElementeSchimbate = primulString.replace(unElementVechi, unElementNou);
		
		// afisarea vechiului string
		System.out.println("Vechiul String : " + primulString);
		// afisarea noului string
		System.out.println("Noul String : " + stringCuElementeSchimbate);
		
		
		
	}
	
}
