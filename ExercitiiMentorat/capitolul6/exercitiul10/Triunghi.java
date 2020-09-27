package exercitiul10;
/*Scrieti doua clase Java denumite “Punct” si “Triunghi”:
clasa Punct:
->doua variabile de instanta(x, y) care reprezinta coordonatele
->constructor care sa initializeze acele variabile
->metode de set si get pentru cele doua variabile
clasa Triunghi:
->3 variabile de instanta de tip “Punct”
->un constructor care sa initializeze cele 3 puncte
ex: this.punct1 = new Punct(1,2);
->o metoda care sa printeze perimetrul triunghiului
->o metoda care sa specifice tipul triunghiului (Echilateral, Isoscel..)
 * */
import java.util.Scanner;

public class Triunghi extends Punct {

	private int punct3;
	
	public Triunghi() {}
	public Triunghi(int punct1, int punct2, int punct3) {
		super (punct1, punct2);
		this.punct3 = punct3;		
	}
	
    public int getPunct3() {
    	return this.punct3;
    }
	public int setPunct3(int punct3) {
		return this.punct3 = punct3;
	}
	
	
	
	public boolean triunghiIsoscel (int punct1, int punct2, int punct3)
	{
		if (
			 ((punct1 == punct2) && (punct1 != punct3)) ||
			 ((punct1 == punct3) && (punct1 != punct2))	||
			 ((punct2 == punct3) && (punct2 != punct1))
		   ) {
			    return true;
		     }
	       	 else 
	       	 {
	       		 return false;
	       	 }			
	}
	
	public boolean triunghiDreptunghic(int punct1, int punct2, int punct3)
	{
		if (
			 ((punct1*punct2) == (punct2*punct2) + (punct3*punct3)) ||
			 ((punct2*punct2) == (punct1*punct1) + (punct3*punct3)) ||
			 ((punct3*punct3) == (punct1*punct1) + (punct2*punct2))
		   ) {
			   return true;
		     }
		     else
		     {
		    	 return false;
		     }
	}
	
	
	public boolean triunghiOarecare(int punct1, int punct2, int punct3)
	{
		if(
			(punct1 != punct2) &&
			(punct1 != punct3) &&
			(punct2 != punct3)
		   ) {
			   return true;
		     }
		     else
		     {
		    	 return false;
		     }
		
	} 
	
	public boolean triunghiEchilateral(int punct1, int punct2, int punct3)
	{
		if((punct1 == punct2) && (punct1 == punct3))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int perimetru (int punct1, int punct2, int punct3)
	{
		return punct1 + punct2 + punct3;
	}
	
	public void printare()
	{
		Scanner valoriTastatura = null;
		valoriTastatura = new Scanner(System.in);
		System.out.println("Specificati prima dreapta : ");
		punct1 = valoriTastatura.nextInt();
		System.out.println("Specificati a doua dreapta : ");
		punct2 = valoriTastatura.nextInt();
		System.out.println("Specificati a treia dreapta : ");
		punct3 = valoriTastatura.nextInt();
		valoriTastatura.close();
	}
	
	public static void main(String args[])
	{
		Triunghi triunghi = new Triunghi();
		triunghi.printare();
		
		int unu = triunghi.getPunct1();
		int doi = triunghi.getPunct2();
		int trei = triunghi.getPunct3();
		
		Boolean determinareTriunghiDreptunchic = triunghi.triunghiDreptunghic(unu, doi, trei);
		System.out.println("Este triunghi dreptunghic ? : " + determinareTriunghiDreptunchic);
		Boolean determinareTriunghiOarecare = triunghi.triunghiOarecare(unu, doi, trei);
		System.out.println("Este triunghi oarecare ? : " + determinareTriunghiOarecare);
		Boolean determinareTriunghiIsoscel = triunghi.triunghiIsoscel(unu, doi, trei);
		System.out.println("Este triunghi isoscel ? : " + determinareTriunghiIsoscel);
		Boolean determinareTriunghiEchilateral = triunghi.triunghiEchilateral(unu, doi, trei);
		System.out.println("Este triunghi echilateral ? " + determinareTriunghiEchilateral);
		
		int perimetru = triunghi.perimetru(unu, doi, trei);
		System.out.println("Perimetrul este de " + perimetru + " cm");
		// nota : sa fac si un exemplu cu coordonatele euclidiene
	}
	
}
