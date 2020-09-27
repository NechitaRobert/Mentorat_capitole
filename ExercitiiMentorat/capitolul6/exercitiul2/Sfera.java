package exercitiul2;
/*
 * Scrieti o clasa Java denimita “Sfera” care sa efectueze urmatoarele cerinte:
->o variabila de instanta pentru stocarea razei
->un constructor implicit
->un constructor care sa initializeze variabila de instanta
->o metoda setter care sa seteze acea variabila de instanta in caz ca nu vreau sa folosesc
constructorul pentru a initializa variabila
->o metoda getter care sa returneze variabila de instanta
 * 
 * */
import java.util.Scanner;

public class Sfera {

	private double raza;
	
	public Sfera()
	{
		
	}
	
	// constructorul
	public Sfera(double raza)
	{
		this.raza = raza;
	}
	// getter
	public double getSfera()
	{
		return this.raza;
	}
	// setter
	public void setSfera(int raza)
	{
	   this.raza = raza;
	}

	private double volum()
	{
	   int constant1 = 4;
	   int constant2 = 3;
	   double pi = 3.14;
	   return (constant1*pi*raza*raza*raza)/constant2;
	}
	
	private void printTastatura()
	{
		Scanner valoriTastatura = null;
		valoriTastatura = new Scanner(System.in);
		System.out.println("Specificati raza cercului : ");
        raza = valoriTastatura.nextDouble();
        
        valoriTastatura.close();
	}
	
	public static void main(String args[])
	{
		Sfera constructor = new Sfera();
		constructor.printTastatura();
		
		double raza = constructor.getSfera();
		System.out.println("Raza este : " + raza);
		
		double volumSfera = constructor.volum();
		System.out.println("Volumul este : " + volumSfera);
		
	}
	
}
