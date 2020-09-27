package capitolul2;
// bug

import java.util.Scanner;




public class Exercitiul_20 {

	public static void main(String args[])
	{
		int rand;
		
		Scanner numar_tastatura = new Scanner(System.in);
		System.out.print("Scrieti un numar ");
		rand = numar_tastatura.nextInt();
		
		for( int i = rand - 1; i >= 0; i-- )
		{
			for( int j = 1; j <= i + 1; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		
	}
	
}
