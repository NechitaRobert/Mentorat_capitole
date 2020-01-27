// Scrieti un program java un care : Userul va insera anul curent iar programul 
// va spune daca e an bisect sau nu

import java.util.Scanner;


public class Exercitiul_7 {

	public static void main(String args[])
	{
		int an;
		
		Scanner bisect = new Scanner(System.in);
		System.out.print("Introduceti anul ");
		an = bisect.nextInt();
		
		boolean eBisect = false;
		
		if(an % 4 == 0)
		{
			if(an % 100 == 0)
			{
				if (an % 400 == 0)
				{
					eBisect = true;
				}
				else
				{
					eBisect = false;
				}
			}
			else
			{
				eBisect = true;
			}
		}
		else
		{
			eBisect = false;
		}
		
		
		
		if(eBisect == true)
		{
			System.out.println("E bisect");
		}
		else
		{
			System.out.println("Nu e bisect");
		}
		
		
		
	}
	
}
