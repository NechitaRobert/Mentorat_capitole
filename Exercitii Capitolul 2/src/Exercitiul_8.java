
public class Exercitiul_8 {

	public static void main(String args[])
	{
		
		int i = 0;
		int j = 0;
		int k = 1;
		
		// for
		
		for (i = 1; 1 <= 10; i++)
		{
			System.out.println(i);
			if(i == 10)
			{
				break;
			}
		}
		
	    
		// while
		while (j <= 10)
		{
			j = j + 1;
			if (j == 11)
			{
				break;
			}
			System.out.println(j);
			
		}
		
		
		// do while
		 do
		 {
			 System.out.println(k);
			 k = k + 1;
		 }
		 
		 while(k <= 10);
		 
		
	}
	
}
