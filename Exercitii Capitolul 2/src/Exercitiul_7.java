import java.util.Scanner;


public class Exercitiul_7 {

	public static void main(String args[])
	{
		int an;
		
		Scanner bisect = new Scanner(System.in);
		System.out.print("Introduceti anul ");
		an = bisect.nextInt();
		
		boolean e_bisect = false;
		
		if(an % 4 == 0)
		{
			if(an % 100 == 0)
			{
				if (an % 400 == 0)
				{
					e_bisect = true;
				}
				else
				{
					e_bisect = false;
				}
			}
			else
			{
				e_bisect = true;
			}
		}
		else
		{
			e_bisect = false;
		}
		
		
		
		if(e_bisect == true)
		{
			System.out.println("E bisect");
		}
		else
		{
			System.out.println("Nu e bisect");
		}
		
		
		
	}
	
}
