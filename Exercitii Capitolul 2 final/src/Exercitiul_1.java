//Scrieti un program in java in care luati un nr de la tastatura iar
// programul va spune daca este pozitiv sau negativ

// importarea scanerului
import java.util.Scanner;

// declararea clasei
public class Exercitiul_1 {
	
	// declararea metodei main
	public static void main(String args[])
	{
		// declararea variabilei 
		int valoare;
		
		// creearea scanerului
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.println("Scrieti numarul dumneavoastra ");
		valoare = valoriTastatura.nextInt();
		
		// pt a determina un numar e neg sau pozitiv utlizam "if"
		// "if e utilizat pentru a specifica un bloc de cod care trebuie sa fie executat"
		// daca o conditie specificata e adevarata
		
		if(valoare < 0)
	 	{   
			// daca intruneste conditia atunci se va executa codul de mai jos
			System.out.println("Numarul este negativ");
		}
		else
		{
			// daca nu intruneste conditia atunci se va executa codul de mai jos
			System.out.println("Numarul este pozitiv");
		}		
		
	}

}
