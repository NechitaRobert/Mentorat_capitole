package capitolul2;
import java.util.Random;

public class Exercitiul_5 {

	public static void main(String args[])
	{
		Random aleator = new Random();
		int a = aleator.nextInt(7);
		
		switch(a)
		{
		case 1:
			if (a == 1)
			{
				System.out.println("Este luni");
			}
		    break;
		case 2:
			if (a == 2)
			{
				 System.out.println("Este marti");
			}
			break;
		case 3:
			if (a == 3)
			{
				System.out.println("Este miercuri");
			}
			break;
		case 4:
			if (a == 4)
			{
				System.out.println("Este joi");
			}
			break;
		case 5:
			if (a == 5)
			{
				System.out.println("Este vineri");
			}
			break;
		case 6:
			if (a == 6)
			{
				System.out.println("Este sambata");
			}
			break;
		case 7:
			if (a == 7)
			{
				System.out.println("Este duminica");
			}
			break;
			
		    
		}
		
	}
	
	
	
}
