package exercitiul1;
/*Scrieti o clasa Java cu urmatoarele caracteristici:
->doua variabile de instanta(globale)
->Un constructor implicit care sa afiseze un mesaj
->Un constructor care sa initializeze cele doua variabile globale(foloseste cuvantul cheie
this)
->Metode de set si get pentru fiecare variabila
->o metoda care nu returneaza nimic, doar printeaza cele doua variabile
->o clasa main unde veti folosi toate functionalitatile de mai sus
 * */
 import java.util.Scanner;

public class Exercitiul_1 {

	private double unu ;
	private double doi ;
	
	public Exercitiul_1()
	{
		System.out.println("Acesta e un exercitiul de encapsulare : getter si setter ");
	}
	
	public 	Exercitiul_1(double unu, double doi)
	{
		this.unu = unu;
		this.doi = doi;
	}
	
	public double getUnu()
	{
		return this.unu;
		 // this.getUnu(); ????
	}  
	
	public double getDoi()
	{
		return this.doi;
	}
	
	
	public void setUnu(double primulNumar)
	{
		 this.unu = primulNumar;
	}
	public void setDoi(double alDoileaNumar)
	{
		 this.doi = alDoileaNumar;
	}
	
	public void printareTastatura()
	{
		Scanner valoriTastatura = null;
		valoriTastatura = new Scanner(System.in);
		System.out.println("valoarea primei variabile : ");
		unu = valoriTastatura.nextDouble();
		System.out.println("valoarea celei de-a doua variabile : ");
		doi = valoriTastatura.nextDouble();
		
		valoriTastatura.close();
	}
	
	public static void main(String args[])
	{
		Exercitiul_1 encapsulare = new Exercitiul_1();
		encapsulare.printareTastatura();

		double getEncapsulare1  = encapsulare.getUnu();
		System.out.println("Primul numar este " + getEncapsulare1);
		double getEncapsulare2  = encapsulare.getDoi();
		System.out.println("Al doilea numar este " + getEncapsulare2);
		

		encapsulare.setUnu(2);
		System.out.println("Primul numar este " + encapsulare.getUnu());
		encapsulare.setDoi(3);
		System.out.println("Al doilea numar este " + encapsulare.getDoi());
	}
	
}
