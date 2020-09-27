package capitolul5;
/*Scrieti un program care sa calculeze suma a 10 numere
generate in mod random folosind instructiunea do while.
 * */
import java.util.Random;

public class Exercitiul_2 {

	public static void main(String args[])
	{
		
		int suma = 0;
		int sir[] = new int[10];
		Random aleator = new Random();
		int numarMaxim = 9;
        int i = 0;
		  
       for ( i = 0; i < 10; i++ )
       {	
        	sir[i] = aleator.nextInt(numarMaxim);
        	System.out.print("[" + sir[i] + "]");
       }    
       System.out.println(); 
       i=0;
       do {
    	   suma = suma + sir[i]; 
    	   i++;
       }
       while(i < 10); 
       
       System.out.println(suma); 
        

        

        
        
        
        
    
      
        
      
     
	}
	
}
