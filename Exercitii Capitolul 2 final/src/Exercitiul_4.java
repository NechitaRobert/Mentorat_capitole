/*Scrieti un program JAVA in care generati in mod random o cifra intre 1 si 7 
 * Pe baza rezultatului generat vei printa la tastatura ziua din saptamana corespondenta cifrei primite
 * 
 * */

import java.util.Random;


public class Exercitiul_4 {
	
	public static void main(String args[])
	{
		Random aleator = new Random();	
		int a     = aleator.nextInt(7);
		
		if(a == 1)
		{
			System.out.println("Este luni");
		}
		else if(a == 2)
		{
			System.out.println("Este marti");
		}
		else if(a == 3)
		{
			System.out.println("Este miercuri");
		}
		else if(a == 4)
		{
			System.out.println("Este joi");
		}
		else if(a == 5)
		{
			System.out.println("Este vineri");
		}
		else if(a == 6 )
		{
			System.out.println("Este sambata");
		}
		else if(a == 7)
		{
			System.out.println("Este duminica");
		}
		
		
		
       
		
		
	}
	
	

}
