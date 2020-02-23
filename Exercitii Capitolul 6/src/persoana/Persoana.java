package persoana;


interface InterfataPersoana {
	void toString(String nume, String adresa);
	void afisare();
    String getNume();
    String setNume(String nume);
    // poti baga toate metodele aici doar sa fie scrise corect
}


public class Persoana implements InterfataPersoana {

	private String nume = "Andrei";
	private String adresa = "Aleea armoniei";
	
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
	
	public void toString(String nume, String adresa) {
		nume = "Andrei";
		adresa = "Aleea armoniei";
		System.out.println(nume + " de pe strada " + adresa);
		
	}
	public void afisare() {
		System.out.println("ceva");
	}
	

	
}