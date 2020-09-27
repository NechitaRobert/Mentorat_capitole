package capitolul2;
//Scrieti un program in java in care luati un nr de la tastatura iar
// programul va spune daca este pozitiv sau negativ

import java.util.Scanner;

public class Exercitiul_1 {
	
	public static void main(String args[])
	{
		
		int valoare;
		
		Scanner numar = new Scanner(System.in);
		System.out.println("Scrieti numarul dumneavoastra ");
		valoare = numar.nextInt();
		
		if(valoare < 0)
		{
			System.out.println("Numarul este negativ");
		}
		else
		{
			System.out.println("Numarul este pozitiv");
		}
		
		
		
		
	}

}
