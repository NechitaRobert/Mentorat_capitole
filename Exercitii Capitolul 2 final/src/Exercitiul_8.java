// Scrieti un program JAVA in care sa afisezi primele 10 numere naturale
// Foloseste instructiunile "for" "while" si "do while"


public class Exercitiul_8 {

	public static void main(String args[])
	{
		
		
		int j = 0;
		int k = 1;
		
		// for
		
		for (int i = 1; i <= 10; i++)
		{
			System.out.print(i);
		}
		System.out.println();
	    
		// while
		while (j <= 10)
		{
			j = j + 1;
			if (j == 11)
			{
				break;
			}
			System.out.print(j);
			
		}
		System.out.println();
		
		// do while
		 do
		 {
			 System.out.print(k);
			 k = k + 1;
		 }
		 
		 while(k <= 10);
		 
		
	}
	
}
