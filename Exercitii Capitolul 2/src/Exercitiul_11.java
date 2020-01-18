// eroare la compilare

import java.util.Scanner;


public class Exercitiul_11 {

	public static void main(String args[])
	{
		int varsta;
		String nume;
	
		
		Scanner x = new Scanner(System.in);
		System.out.print("Care este numele dumneavoastra ? : ");
		nume = x.nextLine();
		
		System.out.print("Ce varsta aveti ? ");
		varsta = x.nextInt();
		
		if (varsta >=  18)
		{
			System.out.print(nume + " tu poti sa votezi");
			
		}
		else
		{  
			System.out.print(nume + " tu nu poti vota");
		}
		
		
		
	}
}
