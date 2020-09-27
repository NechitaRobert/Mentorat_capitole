package capitolul2;
// Creati in java un program in care sa aflati numarul de zile dintr-o luna
// userul va insera un numar de la 1 la 12 numar ce reprezinta dintr-un an
// pe baza inputului acesta va primi ca si raspuns care zile are acea luna
// foloseste instructiunea SWITCH


import java.util.Scanner;

public class Exercitul_6 {

	public static void main(String args[])
	{
		// creearea variabilei
		int luna;
		
		// creearea scanerului
		Scanner luna_an = new Scanner(System.in);
		System.out.print("Introduceti un nr de la 1 la 12 : ");
		luna = luna_an.nextInt();
		
		
		// creearea codului unde specificam cate zile are o luna
		if (luna == 1 || luna == 3 || luna == 5 || luna == 7 || luna == 8 || luna == 10 || luna == 12)
		{
		  System.out.println("Luna are 31 de zile");	
		}
		else if(luna == 4 || luna == 6 || luna == 9 || luna == 11)
		{
		  System.out.println("Luna are 30 de zile");
		}
		else if(luna == 2)
		{
		  System.out.println("Luna are 28 sau 29 de zile");
		}
		else
		{
		  System.out.println("Introduceti va rog o alta valoare");
		};
		
		// creearea codului unde specificam ce luna este in functie de valoarea introdusa de la tastatura
		switch(luna)
		{
		case 1:
			System.out.println("Este ianuarie");
			break;
		case 2:
			System.out.println("Este februarie");
			break;
		case 3:
			System.out.println("Este martie");
			break;
		case 4:
			System.out.println("Este aprilie");
			break;
		case 5:
			System.out.println("Este mai");
			break;
		case 6:
			System.out.println("Este iunie");
			break;
		case 7:
			System.out.println("Este iulie");
			break;
		case 8:
			System.out.println("Este august");
			break;
		case 9:
			System.out.println("Este septembrie");
			break;
		case 10:
			System.out.println("Este octombrie");
			break;
		case 11:
			System.out.println("Este noiembrie");
			break;
		case 12:
			System.out.println("Este decembrie");
			break;
			
		
		
		}
		
	}
	
}
