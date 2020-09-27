package capitolul2;
//Scrie un program in JAVA unde userul va scrie un numar de la tastatura si va
//genera urmatorul pattern
//
//ex : input = 4
//     output 1
//            22
//            333
//            4444	

// importarea scanerului
import java.util.Scanner;

// clasa
public class Exercitiul_13 {

	public static void main(String args[])
	{
		// variabila
		int numar;
		
		// creearea scanerului
		Scanner numarTastatura = new Scanner(System.in);
		System.out.print("Introduceti numarul ");
		numar = numarTastatura.nextInt();
		
		// creearea matricii
		
		// creearea randului
		for(int i = 0; i <= numar; i++)
		{
			// creearea coloanei
			for(int j = 0; j <= i; j++)
			{   
				//afisarea
				System.out.print(i+"");
			}
			// spatiul pt afisare
			System.out.println();
		}
		
		
		
		
	}
}
