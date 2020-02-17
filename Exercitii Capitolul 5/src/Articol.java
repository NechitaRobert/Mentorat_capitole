/*Scrieti o clasa Java denumita “Articol” care sa efectueze urmatoarele cerinte:
->4 variabile de instanta(id, descriere, cantitate, pret)
->un constructor care sa initializeze variabilele de instanta
->metode de set si get pentru fiecare variabila de instanta
->o metoda care sa calculeze totalul pe care l-am face din vanzarea tuturor articolelor din
stoc(pret*cantitate)*/


import java.util.Scanner;

public class Articol {

	private String id;
	private String descriere;
	private int cantitate;
	private double pret;
	
	public Articol() {}
	public Articol(String id, String descriere, int cantitate, double pret) {
		
		this.id = id;
		this.descriere = descriere;
		this.cantitate = cantitate;
		this.pret = pret;		
	}
	
	
	public String getid() {
		return this.id;
	}
	public String setid(String id) {
		return this.id = id;
	}

	
	public String getdescriere() {
		return this.descriere;
	}
	public String setdescriere(String descriere) {
		return this.descriere = descriere;
	}
	
	
	public int getcantitate() {
		return this.cantitate;
	}
	public int setcantitate(int cantitate) {
		return this.cantitate = cantitate;
	}
	
	
	public double getpret() {
		return this.pret;
	}
	public double setpret(double pret) {
		return this.pret;
	}
	
	
	public double totalvanzari(int cantitate, double pret) {
		return cantitate * pret;
	}
	
	public void printare() {
		
		Scanner valoriTastatura = null;
		valoriTastatura = new Scanner(System.in);
		System.out.println("Spuneti numele produsului : ");
		id = valoriTastatura.next();
		System.out.println("Descrieti va rog produsul : ");
		descriere = valoriTastatura.next();
		System.out.println("Cate produse doriti : ");
		cantitate = valoriTastatura.nextInt(); 
		System.out.println("La ce pret a-ti cumpara :");
		pret = valoriTastatura.nextDouble();
		valoriTastatura.close();
	}
	
	public static void main(String args[])
	{
		
		Articol produse = new Articol();
		produse.printare();
		
		String id = produse.getid();
		String descriere = produse.getdescriere();
		int cantitate = produse.getcantitate();
		double pret = produse.getpret();
		
		// trebuie scrise variabile bagate in get pt a face metoda
		double totalvanzare = produse.totalvanzari(cantitate, pret);
		System.out.println("Produsul " + id + " este " + descriere );
		System.out.println("Am cumparat " + id + "in valoare de " +totalvanzare);
		
	}
}
