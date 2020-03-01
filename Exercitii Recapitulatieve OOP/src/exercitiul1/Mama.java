package exercitiul1;

public class Mama extends Salarii {

	// create one variable
	private String numeleMamei = "Ana";
	
	// create one constructor
	public Mama() {}
	public Mama(int venitLunar, int nrDeAni, int oreSuplimentare, String numeleMamei) {
		super (venitLunar, nrDeAni, oreSuplimentare);
		this.numeleMamei = numeleMamei;	
	}
	
	
	// getter and setter
	public String getNumeleMamei() {
		return numeleMamei;
	}
	public String setNumeleMamei(String numeleMamei) {
		return this.numeleMamei = numeleMamei;
	}

	@Override
	public String getToString() {
		return (numeleMamei + " are un salariu de ");
	}
	
	// abstract and overloading methods
	// first is  abstract method
	
	public int getSalariuLunar(int venitLunar, int nrDeAni) {
		return venitLunar * nrDeAni;
	}
	// second is overloading method
	public int getSalariuLunar(int venitLunar, int nrDeAni, int numarZileConcediuLunar) {
		return (venitLunar * nrDeAni) - numarZileConcediuLunar;
	}
	
	
	
	

	
	
	
	
	
	
	
	
		
	
	
}
