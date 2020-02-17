/* Scrieti 3 clase Java pe baza diagramei de mai jos:
->O clasa de baza Persoana
-
 *  
 * 
 * */

public class Persoana {

	private String nume;
	private String adresa;
	
	public Persoana() {}
	public Persoana(String nume, String adresa) {
		this.nume = nume;
		this.adresa = adresa;
	}
	
	public String getNume() {
		return this.nume;
	}
	public String setNume(String nume) {
		return this.nume = nume;
	}
	
	public String getAdresa() {
		return this.adresa;
	}
	public String setAdresa(String adresa) {
		return this.adresa = adresa;
	}
	
	public String toString(String nume, String adresa)
	{
		nume = "Andrei";
		adresa = "Aleea corzilor";
		return (nume + " de pe " + adresa);
	}
	
	// metoda de verificare daca sunt afisate corect
	public static void main(String args[])
	{
		Persoana mostenire = new Persoana();
		
		String nume = mostenire.getNume();
		String adresa = mostenire.getAdresa();
		
		String numeAdresa = mostenire.toString(nume, adresa);
		System.out.println(numeAdresa); 
		
	}
	
}
