package exercitiul3;
/*Scrieti o clasa Java denumita “Cerc” care sa efectueze urmatoarele cerinte:
->doua variabile de instanta(raza, culoare)
->un constructor care sa initializeze cele doua variabile
->metode de set si get pentru cele doua variabile
->o metoda care sa returneze aria cercului
->o metoda main in care sa testati codul scris in clasa Cerc
 * */


import java.util.Scanner;

public class Cerc {

	private double raza;
	private double culoare;
	
	// constructorul si implicit si constructorul principal
	public Cerc(){}
//	public Cerc(double raza, double culoare) {
//		this.raza = raza;
//		this.culoare = culoare;
//	}
	
	// setter si getter
	public double getCerc() {
		return this.raza;
	}
	public double setCerc(double raza) {
		return this.raza = raza;
	}
	
	public double getCuloare() {
		return this.culoare;
	}
	public double setCuloare(double culoare) {
		return this.culoare = culoare;
	}
	
	public double arie() {
		double pi = 3.14;
		return pi*Math.pow(raza, 2);
	}
	
	public void printareTastatura() {
		Scanner valoriTastatura = null;
		valoriTastatura = new Scanner(System.in);
		System.out.println("Specificati raza cercului : ");
		raza = valoriTastatura.nextDouble();
		
		valoriTastatura.close();
	}
	
	public static void main(String args[])
	{
		Cerc valori = new Cerc();
		valori.printareTastatura();
		
		double arieCerc = valori.arie();
		System.out.println("Aria cercului este : " + arieCerc + " cm");
		
		
	}
	
}
