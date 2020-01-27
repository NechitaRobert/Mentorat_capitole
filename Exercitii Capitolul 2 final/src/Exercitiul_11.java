// Scrie un program java in care userul isi va scrie la tastatura numele si varsta
// Pe baza varstei, programul ii va spune daca esti eligibil pentru a vota

// importarea scanerului
import java.util.Scanner;

// declararea clasei
public class Exercitiul_11 {

	// declararea metodei main
	public static void main(String args[])
	{
		// declararea variabilelor
		int varsta;
		String nume;
	
		// creearea scanerului si implementarea introducerii valorilor
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.print("Care este numele dumneavoastra ? : ");
		nume = valoriTastatura.nextLine();
		
		System.out.print("Ce varsta aveti ? ");
		varsta = valoriTastatura.nextInt();
		
		// se utlizeaza "if" pentru a verifica conditia
		if (varsta >=  18)
		{
			// daca conditia e adevarata se va executa linia de cod de mai jos
			System.out.print(nume + " tu poti sa votezi");
			
		}
		else
		{  
			// daca conditia nu e adevarata se va executa linia de cod de mai jos
			System.out.print(nume + " tu nu poti vota");
		}
		
		
		
	}
}
