/*Scrie un program JAVA unde userul va scrie un numar la tastatura si se va genera urmatorul pattern
 *ex : 5
 * 12345
 * 1234
 * 123
 * 12
 * 1
 * */

import java.util.Scanner;




public class Exercitiul_20 {

	public static void main(String args[])
	{
		int rand;
		
		Scanner valoriTastatura = new Scanner(System.in);
		System.out.print("Scrieti un numar ");
		rand = valoriTastatura.nextInt();
		
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
