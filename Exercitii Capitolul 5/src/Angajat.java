/*Scrieti o clasa Java denumita “Angajat” care sa efectueze urmatoarele cerinte:
->4 variabile de instanta(nume, prenume, salariu, cnp)
->un constructor care sa initializeze variabilele de instanta
->metode de set si get pentru cele 4 variabile
->o metoda care sa calculeze salariul anual pentru o persoana
->o metoda care sa mareasca salariul unei persoane (raiseSalary(int percent))
 * */


// NOTA : FA CU NET SI CU BRUT(imbunatatire de cod)
import java.util.Scanner;

public class Angajat {

	// variabiele globale
	private String nume;
	private String prenume;
	private String cnp;
	private double salariu;
		
	// constructorul implicit
	public Angajat() {
		// cate ore o muncit pe zi
		// salariu brut = nr de ore * nr de zile lucratoare pe luna * venit pe ora;
		// salariu net = salariu brut - (cas 25 % , cass 10 % , iv 10 % , cam 2,25%)
	}
	
	// constructorul
	public Angajat(String nume, String prenume, String cnp, double salariu) {
		this.nume = nume;
		this.prenume = prenume;
		this.cnp = cnp;
		this.salariu = salariu;
		
	}
	
	
	// getter si setter
	// nume
	public String getNume() {
		return this.nume;
	}
	public String setNume(String nume) {
		return this.nume = nume;
	}
	
	// prenume
	public String getPrenume() {
		return this.prenume;
	}
	public String setPrenume(String prenume) {
		return this.prenume = prenume;
	}
	
	// cnp
	public String getCnp() {
		return this.cnp;
	}
	public String setCnp(String cnp) {
	    return this.cnp = cnp;	
	}
	
	// salariu
	public double getSalariu() {
		return this.salariu;
	}
	public double setSalariu(double salariu) {
		return this.salariu = salariu;
	}
	
	// pt preluarea de valori de la tastatura
	 public void printareTastatura () {
			
			Scanner valoriTastatura = null;
			valoriTastatura = new Scanner(System.in);
			System.out.println("Numele dumneavoastra : ");
			nume = valoriTastatura.next();
			System.out.println("Prenumele dumneavoastra : ");
			prenume = valoriTastatura.next();
			System.out.println("Cnp dumneavoastra ");
			cnp = valoriTastatura.next();
			System.out.println("Ce salariu luati dumneavoastra pe luna ? : ");
			salariu = valoriTastatura.nextDouble();
	  	
			valoriTastatura.close();
	}
	 
	 // metoda de calcul a venitului anual
	public double venit (double salariu) {
		System.out.println("Hai sa iti calculam salariu brut pe an : ");   
	    return salariu * 12;		
	}
	
	
	// metoda de calcul a cresterii salariale
	// se poate aplica oricare dintre aceste metode
	public double crestereSalariala (double salariu) {
		 int procent = 3;
		 return salariu + salariu * (procent/100);
	}
	public double raiseSalary (double procent) {
		procent = 3;
		return this.salariu * (procent/100);		
	}
	
	
	// metoda main
	public static void main(String args[])
	{
		Angajat salarii = new Angajat();
		salarii.printareTastatura();
	    
	    String nume  = salarii.getNume();
	    String prenume = salarii.getPrenume();
	    String cnp = salarii.getCnp();
	    double salariu = salarii.getSalariu();
	    
	    // limitarea nr de elemente intr-un string
	    String cnpStrict = cnp.substring(0,13);
	      
	    double bani = salarii.venit(salariu);
	    System.out.println(nume + prenume + " cu cnp  " + cnpStrict + " aveti o suma de " + bani + " lei pe an");
	    double maiMultiBani = salarii.raiseSalary(salariu);
	    System.out.println("Daca munciti , o sa obtineti in plus o suma de " + maiMultiBani + " la salarul lunar");
	}
	
}
