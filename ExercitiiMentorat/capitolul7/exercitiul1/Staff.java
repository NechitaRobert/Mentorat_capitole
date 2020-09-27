package exercitiul1;

interface InterfataStaff {
	void toString(String scoala, double plata);
}


public class Staff extends Persoana implements InterfataStaff {

	private String scoala;
	private double plata;
	
	public Staff() {}
	public Staff(String scoala, double plata, String nume, String adresa) {
		super (nume, adresa);
		this.scoala = scoala;
		this.plata = plata;
	}
	
	public String getScoala() {
		return this.scoala;
	}
	public String setScoala(String scoala) {
		return this.scoala = scoala;
	}
	
	
	public double getPlata() {
		return this.plata;
	}
	public double setPlata(double plata) {
		return this.plata = plata;
	}
	
	public void toString( String scoala, double plata) {
		scoala = "Sfantul Mihailskov";
		plata = 300;
		System.out.println(super.getNume() + " este la scoala " + scoala + " unde a platit o suma de " 
				+ plata + " de lei");
	}
	

	
	
	
}

