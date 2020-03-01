package exercitiul1;

public abstract class Salarii {

	// variables
	private int venitLunar = 28;
	private int nrDeAni = 5;
	private int oreSuplimentare = 10;
	
	// abstract methods
	public abstract int getSalariuLunar(int venitLunar, int nrDeAni);
	public abstract String getToString();
	
	// constructors
	public Salarii() {}
	public Salarii(int venitLunar, int nrDeAni, int oreSuplimentare) {
		this.venitLunar = venitLunar;
		this.nrDeAni = nrDeAni;
		this.oreSuplimentare = oreSuplimentare;
	}
	
	// getter and setters
	public int getVenitLunar() {
		return venitLunar;
	}
	public void setVenitLunar(int venitLunar) {
		this.venitLunar = venitLunar;
	}
	public int getNrDeAni() {
		return nrDeAni;
	}
	public int setNrDeAni(int nrDeAni) {
		return this.nrDeAni = nrDeAni;
	}
	public int getOreSuplimentare() {
		return oreSuplimentare;
	}
	public int setOreSuplimentare(int oreSuplimentare) {
		return this.oreSuplimentare = oreSuplimentare;
	}
	
	

	

	
	
	
	
	
}
