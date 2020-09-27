package capitolul1;
// Sa se scrie un program in java pentru a calcula totalul si media a 4 numere

// importarea scanerului
import java.util.Scanner;

// declararea clasei
public class Exercitiul_26 {

	//declararea metodei main
	public static void main(String args[])
	{
		// declararea variabilelor
		// media a 4 numere = (a+b+c+d)/4 sau sum/4 sum fiind a+b+c+d
		
		// Obs : la double sau float se afiseaza zecimalele
		// compararativ cu int care da doar numaru intreg
		float primulNumar, alDoileaNumar, alTreileaNumar, alPatruleaNumar ;
		float medieM, sumaM;
		
		// creearea scanerului
		Scanner valoriTastatura = new Scanner(System.in);
		
		// implementarea introducerii valorilor
		System.out.print("Valoarea primei cifre este : ");
		primulNumar = valoriTastatura.nextFloat();
		System.out.print("Valoarea celei de-a doua cifra : ");
		alDoileaNumar = valoriTastatura.nextFloat();
		System.out.print("Valoarea celei de-a treia cifra : ");
		alTreileaNumar = valoriTastatura.nextFloat();
		System.out.print("Valoarea celei de-a patra cifre ");
		alPatruleaNumar = valoriTastatura.nextFloat();
		
		// aplicarea formulei
		sumaM = (primulNumar+alDoileaNumar+alTreileaNumar+alPatruleaNumar);
		medieM = sumaM / 4;
		
		// Afisarea rezultatelor
		System.out.println("Suma valorilor este " + sumaM);
		System.out.println("Media valorilor este " + medieM);
		
	}
}
