// Scrie un program java pentru a crea un identificator unic al unui String


import java.util.Scanner;

public class Exercitiul_10 {

	public static void main(String args[])
	{
		// declararea variabilelor
		String codificare;
		
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.println("Scrieti ce doriti dumneavoastra ca ulterior sa fie codificat ");
		codificare = valoriTastatura.nextLine();
		
		// hash code functioneaza ca o codificare a unor valori de tip string 
		int codificat = codificare.hashCode();
		
		// afisarea rezultatelor
		System.out.print(codificat);
		
	}
	
	
}
