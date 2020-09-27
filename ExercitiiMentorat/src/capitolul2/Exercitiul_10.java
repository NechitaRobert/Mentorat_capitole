package capitolul2;

import java.util.Scanner;

public class Exercitiul_10 {
	
	public static void main(String args[])
	{
		int a;
		int n, x;
		
		Scanner numar = new Scanner(System.in);
		System.out.print("De cate ori vreti sa inmultiti : ");
		n = numar.nextInt();
		System.out.print("Cu ce numar vreti sa inmultiti : ");
		x = numar.nextInt();
		
		for(a = 0; a < n; a++ )
		{
			System.out.println(a*x);
			
		}
	}

}
